package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class WorkerCalcTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void test(int expected, int income, int expences, int threshold ) {
        WorkerCalc service = new WorkerCalc();

        int actual = service.calculate(income, expences,threshold);

        Assertions.assertEquals(expected,actual);
    }
}