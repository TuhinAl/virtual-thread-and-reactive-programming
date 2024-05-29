package com.altuhin.reactive.sec01.objsubscriber;

import com.altuhin.reactive.sec01.objpublisher.Employee;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class EmployeeSubscriber implements Subscriber<Employee> {


    @Override
    public void onSubscribe(Subscription s) {

    }

    @Override
    public void onNext(Employee employee) {

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {

    }
}
