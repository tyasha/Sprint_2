import java.util.HashMap;

public class MonthManger {
    HashMap<String, MonthlyReport> months = new HashMap<>();
    HashMap<Integer, YearlyReport> years = new HashMap<>();

    public void addMonth(String monthName, String path) {
        MonthlyReport monthData = new MonthlyReport(path);
        months.put(monthName, monthData);
    }

    public void addYear(int year, String path) {
        YearlyReport yearData = new YearlyReport(path);
        years.put(year, yearData);
    }

    //метод считающий общие доходы за меясц
    public int getExpense(MonthlyReport month) {
        int expense = 0;
        if(month.isExpense){

        }
        return 0;
    }

    //метод считающий общие расходы за месяц
    public int getAllSpend(MonthlyReport month) {
        return 0;
    }

    //метод сверяющий полученные суммы с суммой доходов и расходов в отчёте по году.
    public void checkIn() {

    }

    // метод нахоядщий самый прибыльный товар в месяце
    public int getMostExpense(MonthlyReport month) {
        int maxProfit = 0;
        int profit = 0;
        if (!month.isExpense) {
            profit = month.sumOfOne * month.quantity;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    // метод находящий самую большую трату за месяц
    public int getMostSpending(MonthlyReport month) {
        int maxSpend = 0;
        int spend = 0;
        if (month.isExpense) {
            spend = month.sumOfOne * month.quantity;
            if (spend > maxSpend) {
                maxSpend = spend;
            }
        }
        return maxSpend;
    }

    //метод печатающий статистику за месяц
    public void printInfoM(MonthlyReport month) {
        System.out.println(month);
        System.out.println(getMostSpending(month));
        System.out.println(getMostExpense(month));
    }

    // Печатает статистику за год
    public void printInfoY(YearlyReport year) {
        System.out.println(year);
        System.out.println(getAverageExpense(year));
        System.out.println(getAverageSpending(year));
    }

    //Находит средний расход за год
    public int getAverageExpense(YearlyReport year) {
        int average = 0;
        int sum = 0;
        if (!year.isExpense) {
            average++;
            sum += year.amount;
        }
        return sum / average;
    }

    //находит средний расход за год
    public int getAverageSpending(YearlyReport year) {
        int average = 0;
        int sum = 0;
        if (year.isExpense) {
            average++;
            sum += year.amount;
        }
        return sum / average;
    }
}


