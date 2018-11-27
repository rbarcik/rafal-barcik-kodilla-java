package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] number = new int[20];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;
        number[10] = 11;
        number[11] = 12;
        number[12] = 13;
        number[13] = 14;
        number[14] = 15;
        number[15] = 16;
        number[16] = 17;
        number[17] = 18;
        number[18] = 19;
        number[19] = 20;

        //When
        double averageOfNumbers = ArrayOperations.getAverage(number);

        //Then
        Assert.assertEquals(10.5, averageOfNumbers, 0);
    }
}
