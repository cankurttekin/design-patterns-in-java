Flyweight lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
<br>
Flyweigh pattern suggest to not store extrinsic state(depends on and varies with the flyweight’s context and therefore can’t be shared.) inside the object. Instead you should pass this state to specific methods whic rely on it. Only the instrinsic state(stored in the flyweight; it consists of information that’s independent of the flyweight’s context, thereby making it sharable) stays within the object, letting you reuse it in different contexts.
<br>
The benefit of applying the pattern depends heavily on how
and where it’s used. It’s most useful when:<br>
•an application needs to spawn a huge number of similar
objects<br>
•this drains all available RAM on a target device<br>
•the objects contain duplicate states which can be extracted
and shared between multiple objects
