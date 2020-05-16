package ru.netology.stats;

public class StatsService {

    public int calculateTotalSales(int[] salesData) {
        int total = 0;
        for (int sale : salesData) total += sale;
        return total;
    }

    public int calculateAverageSales(int[] salesData) {
        return (calculateTotalSales(salesData) / salesData.length);
    }

    public int calculateMonthMaxSalesNumber(int[] salesData) {
        int monthMaxSales = salesData[0];
        int monthMaxSalesNumber = 0;
        int monthCurrent = 0;

        for (int sale : salesData) {
            monthCurrent++;
            if (monthMaxSales <= sale) {
                monthMaxSales = sale;
                monthMaxSalesNumber = monthCurrent;
            }
        }
        return monthMaxSalesNumber;
    }

    public int calculateMonthMinSalesNumber(int[] salesData) {

        int monthMinSales = salesData[0];
        int monthMinSalesNumber = 0;
        int monthCurrent = 0;

        for (int sale : salesData) {
            monthCurrent++;
            if (monthMinSales >= sale) {
                monthMinSales = sale;
                monthMinSalesNumber = monthCurrent;
            }
        }

        return monthMinSalesNumber;
    }

    public int calculateMonthCountUnderAverageSales(int[] salesData) {

        int monthCountUnderAverageSales = 0;
        int averageSales = calculateAverageSales(salesData);

        for (int sale : salesData) {
            if (sale < averageSales) monthCountUnderAverageSales++;
        }

        return monthCountUnderAverageSales;
    }

    public int calculateMonthCountOverAverageSales(int[] salesData) {

        int monthCountOverAverageSales = 0;
        int averageSales = calculateAverageSales(salesData);

        for (int sale : salesData) {
            if (sale > averageSales) monthCountOverAverageSales++;
        }

        return monthCountOverAverageSales;
    }
}
