public class Employee {

    private String name;
    private String surname;
    private String middlename;
    private double salary;
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

    static String names[] = { "Петя", "Вася" };
    static String senames[] = { "Смирнов", "Сидоров" };
    static String midnames[] = { "Михайлович", "Александрович" };

    public Employee () {
        id = counter++;
        name = names[(int)(Math.random() * names.length)];
        surname = senames[(int)(Math.random() * senames.length)];;
        middlename = midnames[(int)(Math.random() * midnames.length)];;

        salary = 8500*(1 + Math.random()*50);
        workPlace = (int) (1 + Math.random()*4);
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

    public void setSalary(double salary) {
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

    public void addSalary(double prc) { // умножение на проценты зп
//        prc = 1.0 + prc/100.0;
        setSalary((int) (getSalary() * prc));
    }
    public void addSalary(int val) { // изменение зп на значение
        salary += val;
    }


    public String toString_noWorkPlace() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }



}


