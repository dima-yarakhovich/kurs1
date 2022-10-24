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

        System.out.println("Сумма затрат на зарплаты по отделу №" + dep + " в месяц равна: " + calculateSumSalary());
        System.out.println("Сотрудник с минимальной зарплатой по отделу №" + dep + " " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой по отделу №" + dep + " " + maxSalary());
        System.out.println("Cреднее значение зарплат по отделу №" + dep + " равно: " + averageSalary());
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:" + Arrays.toString(employees));
        System.out.println("Список всех сотрудников отдела №:" + dep);
        printFIO();
        indekSalary();
        System.out.println("Список всех сотрудников чья зарплата больше " + newMeaningSalary);
        maxNewMeaningSalary();
        System.out.println("Список всех сотрудников чья зарплата меньше " + newMeaningSalary);
        minNewMeaningSalary();


    }

    private static int dep = 3;
    private static int newMeaningSalary = 2900;


    public static void printFIO() {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dep) {
                System.out.println("Имя = " + employee.getName() + ", Фамилия = " + employee.getSurname() + ", Отчество = " + employee.getMiddleName());
            }
        }
    }


    public static int calculateSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dep) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee oneEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min && employee.getDepartment() == dep) {
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
            if (employee != null && employee.getSalary() > max && employee.getDepartment() == dep) {
                max = employee.getSalary();
                oneEmployee = employee;
            }
        }
        return oneEmployee;
    }

    public static int averageSalary() {
        int sumSalary = 0;
        int len = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dep) {
                sumSalary = sumSalary + employee.getSalary();
                len++;
            }
        }
        return sumSalary / len;
    }


    public static void indekSalary() {
        int proc = 10;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dep) {
                int oldSalary = employee.getSalary();
                employee.setSalary(employee.getSalary() + employee.getSalary() / proc);
                System.out.println("Зарплата сотрудника " + employee.getSurname() + " отдела №" + dep + " после индексации на " + proc + "% изменилась с " + oldSalary + " на " + employee.getSalary());
            }
        }
    }

    public static void maxNewMeaningSalary() {
        int max = newMeaningSalary;
        Employee oneEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= max) {
                System.out.println("id =" + employee.getId() + ", Имя = " + employee.getName() + ", Фамилия = " + employee.getSurname() + ", Отчество = " + employee.getMiddleName() + ", зарплата сотрудника " + employee.getSalary());
            }
        }
    }

    public static void minNewMeaningSalary() {
        int min = newMeaningSalary;
        Employee oneEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                System.out.println("id =" + employee.getId() + ", Имя = " + employee.getName() + ", Фамилия = " + employee.getSurname() + ", Отчество = " + employee.getMiddleName() + ", зарплата сотрудника " + employee.getSalary());
            }
        }
    }
}
