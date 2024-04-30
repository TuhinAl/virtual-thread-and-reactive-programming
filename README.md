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

# Scheduler
 ### 1. Preemptive scheduler (OS Scheduler)
 ### 2. Cooperative Scheduler(JVM Scheduler)

# Synchronization

Synchronization is a mechanism to a shared resources or critical
section of code in a multi-thread environment. It is used to prevent race condition and data corruption

All the multi-thread related challenges like race condition, deadlock are still applicable in Virtual Thread. 

### Synchronization for Computable Task(CPU Intensive)
### Synchronization for IO Task(Network call)