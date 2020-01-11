<img align="right" src="./artwork/logo-only.svg" height="150px" style="padding-left: 20px"/>

# Docspell


Docspell is a personal document organizer. You'll need a scanner to
convert your papers into PDF files. Docspell can then assist in
organizing the resulting mess :wink:.

You can associate tags, set correspondends, what a document is
concerned with, a name, a date and some more. If your documents are
associated with this meta data, you should be able to quickly find
them later using the search feature. But adding this manually to each
document is a tedious task. What if most of it could be done
automatically?

## How it works

Documents have two main properties: a correspondent (sender or
receiver that is not you) and something the document is about. Usually
it is about a person or some thing – maybe your car, or contracts
concerning some familiy member, etc.

1. You maintain a kind of address book. It should list all possible
   correspondents and the concerning people/things. This grows
   incrementally with each *new unknown* document.
2. When docspell analyzes a document, it tries to find matches within
   your address book. It can detect the correspondent and a concerning
   person or thing. It will then associate this data to your
   documents.
3. You can inspect what docspell has done and correct it. If docspell
   has found multiple suggestions, they will be shown for you to
   select one. If it is not correctly associated, very often the
   correct one is just one click away.

The set of meta data, that docspell uses to draw suggestions from,
must be maintained manually. But usually, this data doesn't grow as
fast as the documents. After a while there is a quite complete address
book and only once in a while it has to be revisited.

The [documentation](https://eikek.github.io/docspell/) provides for
more information.
