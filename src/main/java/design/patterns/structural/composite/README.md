# Introduction

There are times when you feel a need of a tree data structure in your code. There are many variations to the tree data structure,
but sometimes there is a need of a tree in which both branches as well as leafs of the tree should be treated as uniformly.
The Composite Pattern allows you to compose objects into a tree structure to represent the part-whole hierarchy which means
you can create a tree of objects that is made of different parts, but that can be treated as a whole one big thing. Composite lets
clients to treat individual objects and compositions of objects uniformly, that’s the intent of the Composite Pattern.
There can be lots of practical examples of the Composite Pattern. A file directory system, an html representation in java, an XML
parser all are well managed composites and all can easily be represented using the Composite Pattern. But before digging into
the details of an example, let’s see some more details regarding the Composite Pattern.

The Composite Pattern has four participants:
• Component
• Leaf
• Composite
• Client

A Leaf defines the behavior for the elements in the composition. It does this by implementing the operations the Component
supports. Leaf also inherits methods, which don’t necessarily make a lot of sense for a leaf node.
The Client manipulates objects in the composition through the Component interface.

The Composite pattern can be implemented anywhere you have the hierarchical nature of the system or a subsystem and you
want to treat individual objects and compositions of objects uniformly. A File System, an XML, an Html, or a hierarchy of an
office (starting from the president to employees) can be implemented using the Composite Pattern.
Let’s see a simple example where we implement an html representation in Java using the Composite Pattern. An html is hierarchical in nature, its starts from an <html> tag which is the parent or the root tag, and it contains other tags which can be a parent
or a child tag

NOTE:
The HtmlTag class is the component class which defines all the methods used by the composite and the leaf class. There are
some methods which should be common in both the extended classes;

The getTagName(), just returns the tag name and should be used by both child classes, i.e., the composite class and the leaf
class.

There are methods which are useful only to the composite class and are useless to the leaf class. Just provide the default
implementation to these methods, throwing an exception is a good implementation of these methods to avoid any accidental call
to these methods by the object which should not support them.

The HtmlParentElement class is the composite class which implements methods like addChildTag, removeChild
Tag, getChildren which must be implemented by a class to become the composite of the structure. The operation method
here is the generateHtml, which prints the tag of the current class, and also iterates through its children and calls their
generateHtml method too.
