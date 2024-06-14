Facade is a structural design pattern provides a simplified interface to 
a library, a framework, or any other complex set of classes.
<br>
Facade is handy when you need to integrate your app with a sophisticated library that has dozens of features, but you just need a tiny bit of its functionality.
<br>
Instead of making your code work with dozens of the framework classes directly, you create a facade class which encapsulates that functionality and hides it from the rest of the code. This structure also helps you to minimize the effort of upgrading to future versions of the framework or replacing it with another one. The only thing youd need to change in your app would be the implementation of the facade's methods.
