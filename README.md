# virtual-thread-and-reactive-programming

Process: 
=======
A process is an instance of a computer program which has its own isolated memory space. (unit of resources)

Thread: 
======
A Thread is a unit of program or part of process that share the same memory space.(unit of execution)


# I/O using thread.sleep()

# virtual threads are daemon threads by default.

# Virtual Thread
Virtual Thread is simply an illusion provided by java
It will look like Thread, It will accept Runnable, we can do thread.start(),
 thread.sleep() 
### But OS cannot see them/Schedule them.

## Virtual Thread ==> Task