package com.viraj.app;

import java.util.Random;

public class Service {
    private static final Random RANDOM = new Random();
    public void doWork() {
        int i = RANDOM.nextInt(3);;
        if(i%3 == 0) {
            throw new RuntimeException("Error");
        }
    }
}
