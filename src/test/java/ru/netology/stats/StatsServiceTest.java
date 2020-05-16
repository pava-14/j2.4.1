package ru.netology.stats;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    //
    // Функция формирует целочисленный массив их строки параметров для теста
    //
    public int[] makeSalesDataArray(String csvSourceData) {

        String[] stringSalesDataArray = csvSourceData.split(",");
        int[] salesDataArray = new int[stringSalesDataArray.length];
        for (int index = 0; index < stringSalesDataArray.length; index++) {
            String numberAsString = stringSalesDataArray[index];
            salesDataArray[index] = Integer.parseInt(numberAsString.trim());
        }
        return salesDataArray;
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // суммы всех продаж.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 180"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateTotalSales must be equal 180")
    void shouldCalculateTotalSales(String csvSalesData, int expected) {

        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateTotalSales(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // суммы средней продажи за 12 месяцев.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 15"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateAverageSales must be equal 15")
    void shouldCalculateAverageSales(String csvSalesData, int expected) {
        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateAverageSales(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // номера последнего месяца с максимальной суммой продаж.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 8"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateMonthMaxSalesNumber must be equal 8")
    void shouldCalculateMonthMaxSalesNumber(String csvSalesData, int expected) {
        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateMonthMaxSalesNumber(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // номера последнего месяца с минимальной суммой продаж.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 9"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateMonthMinSalesNumber must be equal 9")
    void shouldCalculateMonthMinSalesNumber(String csvSalesData, int expected) {
        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateMonthMinSalesNumber(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // количества месяцев, в которых продажи были ниже среднего.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 5"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateMonthCountUnderAverageSales must be equal 5")
    void shouldCalculateMonthCountUnderAverageSales(String csvSalesData, int expected) {
        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateMonthCountUnderAverageSales(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    //
    // Используются две строки: значения сумм продаж по месяцам, через запятую и ожидаемое значение
    // количества месяцев, в которых продажи были выше среднего.
    //
    @CsvSource({"'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 5"})
    // Устанавливаем читаемое название выполняемого теста
    @DisplayName("CalculateMonthCountOverAverageSales must be equal 5")
    void shouldCalculateMonthCountOverAverageSales(String csvSalesData, int expected) {
        StatsService service = new StatsService();
        // Формируем массив двнных о продажах из строки параметров
        int[] salesData = makeSalesDataArray(csvSalesData);

        // Вызываем целевой метод:
        int actual = service.calculateMonthCountOverAverageSales(salesData);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}