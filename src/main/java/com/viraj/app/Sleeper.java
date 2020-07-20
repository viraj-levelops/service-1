package com.viraj.app;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sleeper {
    private static final Random rnd = new Random();
    public boolean doWork(){
        int sleepTime = rnd.nextInt(30);
        long timeInMiliSecs = TimeUnit.SECONDS.toMillis(sleepTime);
        try {
            Thread.sleep(timeInMiliSecs);
            return true;
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + e.toString());
            return false;
        }
    }
}
