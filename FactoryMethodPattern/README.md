The Factory Method Design Pattern is a creational design pattern to provide an interface for creating objects in a superclass, 
while allowing subclasses to alter the type of objects that will be created. 
It encapsulates the object creation logic in a separate method, 
abstracting the instantiation process and promoting loose coupling between the creator and the created objects. 
This pattern enables flexibility, extensibility, and maintainability in the codebase by allowing subclasses to define their own implementation 
of the factory method to create specific types of objects.

<br><br>
For example, to add a new product type to the app, you’ll only
need to create a new creator subclass and override the factory
method in it.
