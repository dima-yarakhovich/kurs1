import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Крук", "Сергей", "Григорьевич", 2000, 1);
        employees[1] = new Employee("Рабкевич", "Василий", "Владимирович", 2300, 2);
        employees[2] = new Employee("Чуприс", "Петр", "Николаевич", 2700, 3);
        employees[3] = new Employee("Питкевич", "Алекс", "Петрович", 1200, 5);
        employees[4] = new Employee("Терешко", "Александр", "Васильевич", 2900, 4);
        employees[5] = new Employee("Шкурский", "Григорий", "Александрович", 3000, 3);
        employees[6] = new Employee("Задвинский", "Дмитрий", "Владимировичч", 3400, 5);
        employees[7] = new Employee("Ракович", "Архип", "Михайловичч", 1980, 3);
        employees[8] = new Employee("Василенко", "Геннадий", "Елексеевич", 1600, 1);
        employees[9] = new Employee("Семенко", "Владимир", "Эдуардович", 2600, 2);

        System.out.println("Сумма затрат на зарплаты в месяц равна: " + calculateSumSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:" + Arrays.toString(employees));
        System.out.println("Cреднее значение зарплат: " + calculateSumSalary() / employees.length);
        System.out.println("Список всех сотрудников ФИО:");
        printFIO();
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println("Имя = " + employee.getName() + ", Фамилия = " + employee.getSurname() + ", Отчество = " + employee.getMiddleName());
        }
    }


    public static int calculateSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee oneEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                oneEmployee = employee;
            }
        }
        return oneEmployee;
    }

    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee oneEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                oneEmployee = employee;
            }
        }
        return oneEmployee;
    }


}
