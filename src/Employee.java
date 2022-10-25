public class Employee {
    private String name;
    private String surname;
    private String middleName;
    private int salary;
    private int department;
    private int id;
    private static int idCount = 0;


    public Employee(String surname, String name, String middleName, int salary, int depeartment) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.salary = salary;
        this.department = depeartment;
        this.id = idCount ++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "\n" + "Имя = " + name + ", Фамилия = " + surname + ", Отчество = " + middleName + ", Зарплата =" + salary +
                ", Отдел =" + department + ", id =" + id + ";";
    }

}

