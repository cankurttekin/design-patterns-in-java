Singleton is a creational design pattern that lets you ensure
that a class has only one instance, while providing a global
access point to this instance.
<br>
Singleton pattern lets you access
some object from anywhere in the program. However, it also
protects that instance from being overwritten by other code.
<br><br>
- Make the default constructor private, to prevent other objects
from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor.
Under the hood, this method calls the private constructor to
create an object and saves it in a static field. All following calls
to this method return the cached object.
<br>
So whenever that method is
called, the same object is always returned.
