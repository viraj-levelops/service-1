package com.viraj.app;

import org.junit.Assert;
import org.junit.Test;

public class SleeperTest {
    @Test
    public void test(){
        Sleeper sleeper = new Sleeper();
        Assert.assertTrue(sleeper.doWork());
    }
}