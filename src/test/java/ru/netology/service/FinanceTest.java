package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FinanceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataFirst.csv")

    public void NumberOfHolidaysFirst() {
        Finance service = new Finance();

        int result = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(result, 2);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataSecond.csv")

    public void NumberOfHolidaysSecond() {
        Finance service = new Finance();

        int result = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(result, 3);
    }
}
