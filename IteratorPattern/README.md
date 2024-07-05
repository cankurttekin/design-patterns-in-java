Lets you traverse elements of a collection without exposing its underlying represantation (list, stack, tree, etc.).
<br>
<br>
Most colelctions store their elements in simple lists.
however, some of them are based on stacks, trees, graps and other complex data structures.
<br> no matter how a collection is structured, it must provide some way of accessing its elements so that other code can use these elements.
there should be a way to go through each elements over and over.
<br>
Adding more and more traversal algorithms to the collection
gradually blurs its primary responsibility.
<br>
On the other hand, the client code that’s supposed to work
with various collections may not even care how they store
their elements.
<br>
The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an iterator.
In addition to implementing the algorithm itself, an iterator
object encapsulates all of the traversal details, such as the
current position and how many elements are left till the end.
Because of this, several iterators can go through the same collection
at the same time, independently of each other.