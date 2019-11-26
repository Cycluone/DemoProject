package com.t.demoproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

//@SpringBootTest
class DemoprojectApplicationTests {
    @Test
    void t1() {
        String initialReference="initial value reference";
        AtomicReference<String> atomicString = new AtomicReference<>(initialReference);
        String newReference = "new reference";
        boolean exchanged = atomicString.compareAndSet(initialReference, newReference);
        System.out.println("exchanged-->"+exchanged);
        exchanged = atomicString.compareAndSet(initialReference, newReference);
        System.out.println("exchanged-->"+exchanged);

    }

}
