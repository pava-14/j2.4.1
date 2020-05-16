# Задача № 1 "Статистика"

## Краткое описание

1. Создан пакет ru.netology.stats
2. Создан класс StatsService
3. Созданы методы:
    * calculateTotalSales
    * calculateAverageSales
    * calculateMonthMaxSalesNumber
    * calculateMonthMinSalesNumber
    * calculateMonthCountUnderAverageSales
    * calculateMonthCountOverAverageSales
    
    рассчитывающие:
    
    * Сумму всех продаж
    * Среднюю сумму продаж в месяц
    * Номер **последнего** месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    * Номер **последнего** месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    * Кол-во месяцев, в которых продажи были ниже среднего
    * Кол-во месяцев, в которых продажи были выше среднего
 
4. На каждый метод создано по одному автотесту, который проверяет правильность работы на тестовых данных.

5. Исходные данные передаются с помощью @CSVSource в виде двух строк: значения сумм продаж по месяцам через запятую и ожидаемое значение, которое должен возвращать метод.
    
6. Для преобразования строковых значений исходных параметров в массив целых чисел написан метод:
    ### Код:

```java
public int[] makeSalesDataArray(String csvSourceData) {

        String[] stringSalesDataArray = csvSourceData.split(",");
        int[] salesDataArray = new int[stringSalesDataArray.length];
        for (int index = 0; index < stringSalesDataArray.length; index++) {
            String numberAsString = stringSalesDataArray[index];
            salesDataArray[index] = Integer.parseInt(numberAsString.trim());
        }
        return salesDataArray;
    }
```
7. Выполнен прогон тестов:

    ### Лог:

```$xslt
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ru.netology.stats.StatsServiceTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.121 s - in ru.netology.stats.StatsServiceTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.359 s
[INFO] Finished at: 2020-05-16T16:36:26+07:00
[INFO] ------------------------------------------------------------------------
```