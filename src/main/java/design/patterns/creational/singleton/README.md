# Introduction

Sometimes it’s important for some classes to have exactly one instance. There are many objects we only need one instance
of them and if we, instantiate more than one, we’ll run into all sorts of problems like incorrect program behavior, overuse of
resources, or inconsistent results.
You may require only one object of a class, for example, when you are a creating the context of an application, or a thread
manageable pool, registry settings, a driver to connect to the input or output console etc. More than one object of that type
clearly will cause inconsistency to your program.
The Singleton Pattern ensures that a class has only one instance, and provides a global point of access to it. However, although
the Singleton is the simplest in terms of its class diagram because there is only one single class, its implementation is a bit trickier.

We will try different ways to create only a single object of the class and will also see how one way is better than the other.

### Lazy Singleton & Multithreaded

So, on the first call when sc would be null the object gets created and on the next successive calls it will return the same object.
This surely looks good, doesn’t it? But this code will fail in a multi-threaded environment. Imagine two threads concurrently
accessing the class, thread t1 gives the first call to the getInstance() method, it checks if the static variable sc is null and
then gets interrupted due to some reason. Another thread t2 calls the getInstance() method successfully passes the if check
and instantiates the object. Then, thread t1 gets awake and it also creates the object. At this time, there would be two objects of
this class. To avoid this, we will use the synchronized keyword to the getInstance() method. With this way, we force every thread
to wait its turn before it can enter the method. So, no two threads will enter the method at the same time. The synchronized comes with a price, it will decrease the performance, but if the call to the getInstance() method isn’t causing a substantial
overhead for your application, forget about it. The other workaround is to move to eager instantiation approach.

### Lazy Singleton Double Check

But if you want to use synchronization, there is another technique known as “double-checked locking” to reduce the use of
synchronization. With the double-checked locking, we first check to see if an instance is created, and if not, then we synchronize.
This way, we only synchronize the first time.


### Singleton

Apart from this, there are some other ways to break the singleton pattern.
• If the class is Serializable.
• If it’s Clonable.
• It can be break by Reflection.
• And also if, the class is loaded by multiple class loaders.
This class shows how you can protect your class from getting instantiated more than once

• Implement the readResolve() and writeReplace() methods in your singleton class and return the same object through them.
• You should also implement the clone() method and throw an exception so that the singleton cannot be cloned.
• An "if condition" inside the constructor can prevent the singleton from getting instantiated more than once using reflection.
• To prevent the singleton getting instantiated from different class loaders, you can implement the getClass() method. The
above getClass() method associates the classloader with the current thread; if that classloader is null, the method uses the
same classloader that loaded the singleton class

### Singleton Enum

Although we can use all these techniques, there is one simple and easier way of creating a singleton class. As of JDK 1.5, you
can create a singleton class using enums. The Enum constants are implicitly static and final and you cannot change their values
once created.
You will get a compile time error when you attempt to explicitly instantiate an Enum object. As Enum gets loaded statically, it is
thread-safe. The clone method in Enum is final which ensures that enum constants never get cloned. Enum is inherently serializable, the serialization mechanism ensures that duplicate instances are never created as a result of deserialization. Instantiation
using reflection is also prohibited. These things ensure that no instance of an enum exists beyond the one defined by the enum
constants

# When to use Singleton

• There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
• When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without modifying their code