package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }
}
