package docspell.scheduler.impl

import cats.effect._
import docspell.pubsub.api.PubSubT
import docspell.scheduler._
import fs2.concurrent.SignallingRef

object PeriodicSchedulerBuilder {

  def build[F[_]: Async](
      cfg: PeriodicSchedulerConfig,
      sch: Scheduler[F],
      queue: JobQueue[F],
      store: PeriodicTaskStore[F],
      pubsub: PubSubT[F]
  ): Resource[F, PeriodicScheduler[F]] =
    for {
      waiter <- Resource.eval(SignallingRef(true))
      state <- Resource.eval(SignallingRef(PeriodicSchedulerImpl.emptyState[F]))
      psch = new PeriodicSchedulerImpl[F](
        cfg,
        sch,
        queue,
        store,
        pubsub,
        waiter,
        state
      )
      _ <- Resource.eval(psch.init)
    } yield psch
}
