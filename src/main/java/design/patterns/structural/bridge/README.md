# Bridge Pattern

The Bridge Pattern’s intent is to decouple an abstraction from its implementation so that the two can vary independently. It puts
the abstraction and implementation into two different class hierarchies so that both can be extend independently.

The components of the Bridge Pattern comprise of an abstraction, refined abstraction, an implementer, and concrete implementer.
An abstraction defines the abstraction’s interface and also maintains a reference to an object of type implementer, and the link
between the abstraction and the implementer is called a Bridge.
Refined Abstraction extends the interface defined by the abstraction.
The Implementer provides the interface for implementation classes (concrete implementers).
And the Concrete Implementer implements the Implementer interface and defines its concrete implementation.
The Bridge Pattern decouples the interface and the implementation. As a result, an implementation is not bound permanently to
an interface. The implementation of an abstraction can be configured at run-time. It also eliminates compile-time dependencies
on the implementation. Changing an implementation class doesn’t required recompiling the abstraction class and its clients. The
Client only needs to know about the abstraction and you can hide the implementation from them.


# Problem

Sec Security System is a security and electronic company which produces and assembles products for cars. It delivers any car
electronic or security system you want, from air bags to GPS tracking system, reverse parking system etc. Big car companies
use its products in their cars. The company uses a well defined object oriented approach to keep track of their products using
software which is developed and maintained by them only. They get the car, produce the system for it and assemble it into the
car.
Recently, they got new orders from BigWheel (a car company) to produce central locking and gear lock system for their new xz
model. To maintain this, they are creating a new software system. They started by creating a new abstract class CarProductSecurity, in which they kept some car specific methods and some of the features which they thought are common to all security
products. Then they extended the class and created two different sub classes named them BigWheelXZCentralLocking, and
BigWheelXZGearLocking. Picture 1

After a while, another car company Motoren asked them to produce a new system of central locking and gear lock for their lm
model. Since, the same security system cannot be used in both models of different cars, the Sec Security System has produced
the new system for them, and also has created to new classes MotorenLMCentralLocking, and MotorenLMGearLocking which
also extend the CarProductSecurity class.
Now the new class diagram looks like Picture 2

So far so good, but what happens if another car company demands another new system of central locking and gear lock? One
needs to create another two new classes for it. This design will create one class per system, or worse, if the reverse parking
system is produced for each of these two car companies, two more new classes will be created for each of them.
A design with too many subclasses is not flexible and is hard to maintain. An Inheritance also binds an implementation to the
abstraction permanently, which makes it difficult to modify, extend, and reuse the abstraction and implementation independently.
Please note that, the car and the product should vary independently in order to make the software system easy to extend and
reusable.


# Solution

Instead of creating a subclass for each product per car model in the above discussed problem, we can separate the design into two
different hierarchies. One interface is for the product which will be used as an implementer and the other will be an abstraction
of car type. The implementer will be implemented by the concrete implementers and provides an implementation for it. On the
other side, the abstraction will be extended by more refined abstraction. Picture 3
