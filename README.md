# virtual-thread-and-reactive-programming

Process: 
=======
A process is an instance of a computer program which has its own isolated memory space and getting executed . (unit of resources)

Thread:
======
A Thread is a unit of program or part of process that share the same memory space.(unit of execution)

# MultiThreading and Concurrency Syllabus
![alt text](images/thread/part01ThreadProcessMemoryModel/syl1.png)<br>
![alt text](images/thread/part01ThreadProcessMemoryModel/syl2.png)<br>
![alt text](images/thread/part01ThreadProcessMemoryModel/syl3.png)<br>
![alt text](images/thread/part01ThreadProcessMemoryModel/syl4.png)
![alt text](images/thread/part01ThreadProcessMemoryModel/syl5.png)
![alt text](images/thread/part01ThreadProcessMemoryModel/syl6.png)
![alt text](images/thread/part01ThreadProcessMemoryModel/syl7.png)


# When we run a Java Program
1. It will create a process
2. It will create and JVM instance
3.  ![alt text](images/thread/part01ThreadProcessMemoryModel/process_and_instances.png)

### Code Segment and Data Segment
![alt text](images/thread/part01ThreadProcessMemoryModel/code_and_data_segment.png)

### Heap
![alt text](images/thread/part01ThreadProcessMemoryModel/heap.png)

### Stack and Register
![alt text](images/thread/part01ThreadProcessMemoryModel/stack_and_register.png)
### Counter
![alt text](images/thread/part01ThreadProcessMemoryModel/counter.png)

### JVM Simulation
![alt text](images/thread/part01ThreadProcessMemoryModel/jvm1.png)
![alt text](images/thread/part01ThreadProcessMemoryModel/jvm2.png)

### Definition of Multithreading
![alt text](images/thread/part01ThreadProcessMemoryModel/multithreading_def.png)

### Benefits and Challenges of Multithreading
![alt text](images/thread/part01ThreadProcessMemoryModel/benefits_and_challenges.png)

#### Multitasking and MultiThreading
Multitasking is like multiple process and MultiThreading is use multiple thread.

# Part01: Thread Creation, Thread LifeCycle and Inter-Thread Communication

![alt text](images/thread/part02Thread/ss1.png)<br>
![alt text](images/thread/part02Thread/ss2.png)<br>
![alt text](images/thread/part02Thread/ss3.png)<br>
![alt text](images/thread/part02Thread/ss4.png)<br>
![alt text](images/thread/part02Thread/ss5.png)<br>
![alt text](images/thread/part02Thread/ss6.png)<br>
![alt text](images/thread/part02Thread/ss7.png)<br>
![alt text](images/thread/part02Thread/ss8.png)<br>
![alt text](images/thread/part02Thread/ss9.png)<br>
![alt text](images/thread/part02Thread/ss10.png)<br>

# Part01: Thread Joining and Producer Consumer problem

![alt text](images/thread/part03ThreadJoinProducerConsumer/ss1.png)<br>
![alt text](images/thread/part03ThreadJoinProducerConsumer/ss2.png)<br>
![alt text](images/thread/part03ThreadJoinProducerConsumer/part3and4.png)<br>
![alt text](images/thread/part03ThreadJoinProducerConsumer/Q1.png)<br>
![alt text](images/thread/part03ThreadJoinProducerConsumer/join.png)<br>

## Thread Priority
![alt text](images/thread/part04ThreadPrioroty/threadPriority.png)

## Daemon Thread
[Something which is running in ASYNC manner known asa daemon thread]
![alt text](images/thread/part04ThreadPrioroty/threadPriority.png)

## Lock and Condition (Multithreading Part4)
![alt text](images/thread/part05Lock/ss0.png)<br>
![alt text](images/thread/part05Lock/ss1.png)<br>
![alt text](images/thread/part05Lock/ss2.png)<br>
![alt text](images/thread/part05Lock/ss3.png)<br>
![alt text](images/thread/part05Lock/ss4.png)<br>
![alt text](images/thread/part05Lock/ss5.png)<br>
![alt text](images/thread/part05Lock/ss6.png)<br>

## Lock Free Concurrency (CAS): (Multithreading Part5)
![alt text](images/thread/part06LockFreeConcurrency/ss1.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss2.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss3.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss4.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss5.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss6.png)<br>
![alt text](images/thread/part06LockFreeConcurrency/ss7.png)<br>


## Thread Pool and ExecutorService: (Multithreading Part6)
![alt text](images/thread/part07ThreadPool/ss1.png)<br>
![alt text](images/thread/part07ThreadPool/ss2.png)<br>
![alt text](images/thread/part07ThreadPool/ss3.png)<br>
![alt text](images/thread/part07ThreadPool/ss4.png)<br>
![alt text](images/thread/part07ThreadPool/ss5.png)<br>
![alt text](images/thread/part07ThreadPool/ss6.png)<br>
![alt text](images/thread/part07ThreadPool/ss7.png)<br>

## Thread Pools and ThreadPoolExecutor (lec-46)
![alt text](images/thread/part07ThreadPool/ss8.png)<br>
![alt text](images/thread/part07ThreadPool/ss9.png)<br>
![alt text](images/thread/part07ThreadPool/ss10.png)<br>
![alt text](images/thread/part07ThreadPool/ss11.png)<br>
![alt text](images/thread/part07ThreadPool/ss12.png)<br>
![alt text](images/thread/part07ThreadPool/ss13.png)<br>
![alt text](images/thread/part07ThreadPool/ss14.png)<br>

## Future, CompletableFuture and Callable (lec-47)
![alt text](images/thread/part08Future/ss1.png)<br>
![alt text](images/thread/part08Future/ss2.png)<br>
![alt text](images/thread/part08Future/ss3.png)<br>
![alt text](images/thread/part08Future/ss4.png)<br>
![alt text](images/thread/part08Future/ss5.png)<br>
![alt text](images/thread/part08Future/ss6.png)<br>
![alt text](images/thread/part08Future/ss7.png)<br>
![alt text](images/thread/part08Future/ss8.png)<br>
![alt text](images/thread/part08Future/ss9.png)<br>
![alt text](images/thread/part08Future/ss10.png)<br>
![alt text](images/thread/part08Future/ss11.png)<br>
![alt text](images/thread/part08Future/ss12.png)<br>
![alt text](images/thread/part08Future/ss13.png)<br>

## Java - Fork/Join Pool, Single, Fixed, CachedPool (lec-49)
![alt text](images/thread/part09ThreadPoolTypes/ss1.png)<br>
![alt text](images/thread/part09ThreadPoolTypes/ss2.png)<br>
![alt text](images/thread/part09ThreadPoolTypes/ss3.png)<br>
![alt text](images/thread/part09ThreadPoolTypes/ss4.png)<br>
![alt text](images/thread/part09ThreadPoolTypes/ss5.png)<br>

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


#### Difference between ThreadPool and Executor Service:

#### Difference between Asynchronous and Non-Blocking:

#### Difference between shutdown() and shutdownNow():

#### Are we supposed to use ExecutorService with try-with-resource always?
 Ans: It depends. 



# Reactive Programming masterclass
![alt text](images/reactive/mono_ss1.png)<br>

#### On Thing please remember: In Reactive Programming, we have to do Subscribe + Request. without Request, Subscription will not working;

#### Mono Subscribe overloaded
[Lec03MonoSubscribe.java]

#### Creating default Subscriber
[DefaultSubscriber.java & Util.java]

#### Mono Empty/Error
[Lec04MonoEmptyError.java]

#### onError Dropped Problem
getUsername(34).subscribe(
s -> System.out.println(s)
); //onNext()

The console fays "Operator called default onErrorDropped" what is this meaning? ans: dont be panic
actually. It is what the reactor says that, hey you have subscribed to a publisher, that publisher did not give
any item, instead it gives one error message. you have provided only the data handler --subscribe(
s -> System.out.println(s)
); what about the error handler? you have not provided any error handler so, I did not know what to do with this error
Soln:
subscribe(
s -> System.out.println(s),
err -> {}
);

#### Mono - From Supplier 

Mono.just() - just() can be use when, whatever you want to send, that value
is already in the memory. for CPU task.

to delay the execution we will use Mono.fromSupplier()
Mono.fromSupplier() -> If you want to delay the CPU intensive operation
then we can use fromSupplier().

#### Mono - From Callable 

Callable vs Supplier: 
Callable: to wrap the behavior, to sum it as a task to get that executed by an executor service
it throw exception.

Supplier: Supplier will not throw exception. it can throw runtime exception but it does not have
checked exception.

#### Mono - From Runnable:
If you want to do some method invocation(ex: product 3tar niche neme geche druto admin k notify korte hbe), only after method invocation
if you have to send the empty then we can use Runnable.
emitting empty after some method invocation.

#### Mono - Defer:
This will be useful if you want to delay the Publisher creation.

we are assuming that Publisher is not a time-consuming operation.

![alt text](images/reactive/mono/mono_data.png)<br>

#### Non-Blocking IO client (reactor netty HttpClient:
(a) what is EventLoopGroup:
(b) what is LoopResources:
(c) what is ByteBuffer: ByteBuffer is a container of bytes.
(d) what is ByteBufFlux: FLux of byte buffer.

# Flux - Emitting Items programmatically:

### Flux Sink

![alt text](images/reactive/flux/flux_sink.png)<br>