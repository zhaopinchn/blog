package com.blog.demo;

import com.google.common.eventbus.EventBus;
import rx.Observable;

public class RxjavaDemo {

    public void rxjava() {
        Observable.just("Hello World")
            .subscribe(word -> {
                System.out.println("get " + word + "@"
                    + Thread.currentThread().getName());
            });
    }
}
