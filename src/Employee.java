public class Employee {

    private String name;
    private String surname;
    private String middlename;
    public double salary;
    public int workPlace;
    public int id;
    private static int counter = 0;

    public Employee(String name, String surname, String middlename, int workPlace, int salary) {
        id = counter++;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.workPlace = workPlace;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getSalary() {
        return (int) salary;
    }

    public int getWorkPlace() {
        return workPlace;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkPlace(int workPlace) {
        this.workPlace = workPlace;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", salary=" + salary +
                ", workPlace=" + workPlace +
                ", id=" + id +
                '}';
    }
    public String getFullName() { // метод toString
        return name + " " + surname + " " + middlename;
    }





}


