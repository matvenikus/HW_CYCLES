package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class WorkerCalcTest {
    @ParameterizedTest
    @CsvSource({
            "10_000,3_000, 20_000"
    })
    public void test() {
        WorkerCalc service = new WorkerCalc();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected,actual);
    }
}