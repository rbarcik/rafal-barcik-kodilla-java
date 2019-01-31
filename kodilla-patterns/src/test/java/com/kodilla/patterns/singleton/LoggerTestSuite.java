package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Application log");
        //Then
        String log = Logger.getInstance().getLastLog();
        Assert.assertEquals(log, "Application log" );
    }
}
