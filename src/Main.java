import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthManger manager = new MonthManger();


        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Отчёт за какой месяц нужно считать?");
                String month = scanner.nextLine();
                System.out.println("Укажите папку и файл которые хотите считать?");
                String file = scanner.nextLine();
                manager.addMonth(month,file);

            } else if (userInput == 2) {
                System.out.println("Отчёт за какой год вы хотите считать?");
                int year = scanner.nextInt();
                System.out.println("Укажите папку и файл которые хотите считать?");
                String file = scanner.nextLine();
                manager.addYear(year,file);

            } else if (userInput == 3) {


            } else if (userInput == 4) {
                System.out.println("Информацию за какой месяц вы хотите вывести");
                String user = scanner.nextLine();
                manager.printInfoM(manager.months.get(user));
            } else if (userInput == 5) {
                System.out.println("Информацию за какой год вы хотите вывести?");
                Integer user = scanner.nextInt();
                manager.printInfoY(manager.years.get(user));

            } else if (userInput == 1111) {
                break;
            } else {
                System.out.println("Такой команды ещё нет, повторите ввод");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Считать все месячные отчёты");
        System.out.println("2. Считать годовой отчёт");
        System.out.println("3. Сверить отчёты");
        System.out.println("4. Вывести информацию о всех месячных отчётах");
        System.out.println("5. Вывести информацию о годовом отчёте");
    }
}

