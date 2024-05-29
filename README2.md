[//]: # (# virtual-thread-and-reactive-programming)

[//]: # ()
[//]: # (Process: )

[//]: # (=======)

[//]: # (A process is an instance of a computer program which has its own isolated memory space and getting executed . &#40;unit of resources&#41;)

[//]: # ()
[//]: # (Thread:)

[//]: # (======)

[//]: # (A Thread is a unit of program or part of process that share the same memory space.&#40;unit of execution&#41;)

[//]: # ()
[//]: # (# MultiThreading and Concurrency Syllabus)

[//]: # (![alt text]&#40;images/thread/part01ThreadProcessMemoryModel/syl1.png&#41;<br>)

[//]: # (![alt text]&#40;images/thread/part01ThreadProcessMemoryModel/syl2.png&#41;<br>)

[//]: # (![alt text]&#40;images/thread/part01ThreadProcessMemoryModel/syl3.png&#41;<br>)































































#### I/O using thread.sleep()

# virtual threads are daemon threads by default.

# Virtual Thread
Virtual Thread is simply an illusion provided by java
It will look like Thread, It will accept Runnable, we can do thread.start(),
 thread.sleep() . VT help us to do things in parallel to improve the overall response time you are getting. 
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

### What is Pinned Thread and how to resolved it?
### How to Fix Pinned Thread using Reentrant Lock?

Reentrant Lock is like Synchronize + some other flexibility like fairness policy and tryLock with timeout.

which will ensure that the longer waiting thread gets the chance first. it's fair. 

# Career Thread: 
Career Thread is platform Thread. Platform threads are expensive to create. we need platform thread to execute virtual thread. so we have a dedicated forkJoin pool to do execution, we called them career thread.

# Executor Service
It is High level concurrency framework, that is used for Thread management and Task Handling.
Virtual Threads are not supposed to be pooled.


### Difference between ThreadPool and Executor Service:

### Difference between Asynchronous and Non-Blocking:

### Difference between shutdown() and shutdownNow():

### Are we suppose to use ExecutorService with try-with-resource always?
 Ans: It depends. 