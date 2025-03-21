 #Performance & Memory Management Improvements in Java 24 
 Garbage Collector (GC)
 -> GC is an automatic memory management system that removes unused objects from memory, preventing memory leaks and optimizing performance.

 -> GC Pause Time GC pause time refers to the brief interruption of an application while the garbage collector cleans memory.

Shenandoah GC
->Shenandoah treats all objects the same and scans the entire heap during every collection cycle.

This leads to low pause times but can cause high CPU usage.

Java 24: Generational Shenandoah (Experimental) 
-> Generational Shenandoah improves memory management by dividing objects into two generations, reducing CPU usage and improving efficiency.

How it Works
1> Young Generation objects - Contains newly created objects.
2> Old Generation objects - Objects are collected frequently since most are short-lived.

Stores long-lived objects that survived multiple GC cycles. Collected less frequently to optimize performance. 

This approach improves efficiency and reduces latency, making Java 24's memory management faster and more optimized. 🚀
