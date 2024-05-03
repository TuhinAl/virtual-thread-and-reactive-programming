# virtual-thread-and-reactive-programming

Process: 
=======
A process is an instance of a computer program which has its own isolated memory space and getting executed . (unit of resources)

Thread:
======
A Thread is a unit of program or part of process that share the same memory space.(unit of execution)

# When we run a Java Program
1. It will create a process
2. It will create and JVM instance
3.  ![alt text](images/part01ThreadProcessMemoryModel/process_and_instances.png)

### Code Segment and Data Segment
![alt text](images/part01ThreadProcessMemoryModel/code_and_data_segment.png)

### Heap
![alt text](images/part01ThreadProcessMemoryModel/heap.png)

### Stack and Register
![alt text](images/part01ThreadProcessMemoryModel/stack_and_register.png)
### Counter
![alt text](images/part01ThreadProcessMemoryModel/counter.png)

### JVM Simulation
![alt text](images/part01ThreadProcessMemoryModel/jvm1.png)
![alt text](images/part01ThreadProcessMemoryModel/jvm2.png)

### Definition of Multithreading
![alt text](images/part01ThreadProcessMemoryModel/multithreading_def.png)

### Benefits and Challenges of Multithreading
![alt text](images/part01ThreadProcessMemoryModel/benefits_and_challenges.png)

#### Multitasking and MultiThreading
Multitasking is like multiple process and MultiThreading is use multiple thread.

# Part01: Thread Creation, Thread LifeCycle and Inter-Thread Communication

![alt text](images/part02Thread/ss1.png)
![alt text](images/part02Thread/ss2.png)
![alt text](images/part02Thread/ss3.png)
![alt text](images/part02Thread/ss4.png)
![alt text](images/part02Thread/ss5.png)
![alt text](images/part02Thread/ss6.png)
![alt text](images/part02Thread/ss7.png)
![alt text](images/part02Thread/ss8.png)
![alt text](images/part02Thread/ss9.png)
![alt text](images/part02Thread/ss10.png)

# Part01: Thread Joining and Producer Consumer problem

![alt text](images/part03ThreadJoinProducerConsumer/ss1.png)
![alt text](images/part03ThreadJoinProducerConsumer/ss2.png)
![alt text](images/part03ThreadJoinProducerConsumer/part3and4.png)
![alt text](images/part03ThreadJoinProducerConsumer/Q1.png)
![alt text](images/part03ThreadJoinProducerConsumer/join.png)

## Thread Priority
![alt text](images/part04ThreadPrioroty/threadPriority.png)

## Daemon Thread
[Something which is running in ASYNC manner known asa daemon thread]
![alt text](images/part04ThreadPrioroty/threadPriority.png)


































































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