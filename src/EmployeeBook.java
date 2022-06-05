import java.util.ArrayList;

class EmployeeBook {

    private Employee[] employees = new Employee[50];
    public EmployeeBook() {}

    public void printWorkPlace(int workPlace) {
        System.out.println("Задание среднего уровня");
        Employee emp_max = null; // new Employee("", "", "", 0, 0);
        Employee emp_min = null; // new Employee("", "", "", 0, 0);
        double sumSalary = 0;
        double meanSalary = 0;
        int col_workers = 0;

        // цикл по всем сотрудникам
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;
            // проверка номера отдела с введённым workPlace
            if (workPlace != employees[i].getWorkPlace())
                continue;

            sumSalary += employees[i].getSalary();
            ++col_workers;

            if (emp_max == null)
            {
                emp_max = employees[i];
            } else {
                if ( employees[i].getSalary() > emp_max.getSalary())
                {
                    emp_max = employees[i];
                }
            }
            if (emp_min == null)
            {
                emp_min = employees[i];

            } else {
                if (employees[i].getSalary() < emp_min.getSalary()){
                    emp_min = employees[i];
                }
            }

//                System.out.println(employees[i].toString());
        } // end for
        if (emp_max == null) {
            System.out.println("В этом отделе нет сотрудников");
            return;
            // вывод сотрудников с максимальной, минимальной ЗП
        } else {
            System.out.println(emp_max.toString_noWorkPlace());
            System.out.println(emp_min.toString_noWorkPlace());
            // вывод суммы затрат и средней ЗП в отделе
            System.out.println(sumSalary);
            meanSalary = sumSalary/col_workers;
            System.out.println(meanSalary);
        }

        // цикл по всем сотрудникам
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            // проверка номера отдела с введённым workPlace
            if (workPlace != employees[i].getWorkPlace())
                continue;
            employees[i].addSalary(1.07);
        } // end for

        // вывод сотрудников (кроме отдела)
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            // проверка номера отдела с введённым workPlace
            if (workPlace != employees[i].getWorkPlace())
                continue;
            System.out.println(employees[i].toString_noWorkPlace());
        } // end for

    } // end printWorkPlace


    public void zadanie_3(double Salary) {
        System.out.println("Salary < " + Salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            if (employees[i].getSalary() < Salary)
                System.out.println(employees[i].toString());
        } // end for
        System.out.println("Salary >= " + Salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            if (employees[i].getSalary() >= Salary)
                System.out.println(employees[i].toString());
        } // end for
    }


public boolean addEmployee () { // ищем пустой элемент и добавляем сотрудника


    for (int i = 0; i < employees.length; i++) {
        if (employees[i] == null) {
            employees[i] = new Employee();
            return true;
        }
    }
    return false;
}

    public void delEmployee (int id) { //удаляем сотрудника по id
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                if (id == employees[i].id)
                    employees[i] = null;
        }
    }

        public void delEmployee (String name, String surname, String middlename) { //удаляем сотрудников по ФИО
            for (int i = 0; i < employees.length; i ++) {
                if (employees[i] != null)
                    if (  name == employees[i].getName()
                       && surname == employees[i].getSurname()
                       && middlename == employees[i].getMiddlename()
                    ) {
                        employees[i] = null;
                    }
            }
        }

    public Employee findEmployee (int id){ //находим сотрудника
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i] != null)
                if (id == employees[i].id)
                    return employees[i];
        }
        return null;
    }
    public Employee findEmployee (String name, String surname, String middlename){ //находим сотрудника
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i] != null)
            if (name == employees[i].getName() && surname == employees[i].getSurname() && middlename == employees[i].getMiddlename())
                return employees[i];
        }
        return null;
    }

    public void changeSalary (double salary, Employee finded){ //меняем зарплату
        finded.setSalary(salary);

    }

    public void changeWorkPlace (int workPlace, Employee finded) { //меняем отдел
        finded.setWorkPlace(workPlace);

    }




    public void printAllEmployees () {
        System.out.println("Список сотрудников :");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
//    public void printAllEmployees () {
//        System.out.println("Список сотрудников :");
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//    }


    public void minMax (){ // считаем мин, мах, средняя, общая

        int sum = 0;
        int maxSalary = employees[0].getSalary();
        int minSalary = employees[0].getSalary();
        int middleSalary = 0;
        String maxSalarySum = null;
        String minSalarySum = null;
        for(int i = 0; i < employees.length; i++){
            if (employees[i] == null)
                continue;
            sum += employees[i].getSalary();
            middleSalary = sum / employees.length;
            if (employees[i].getSalary() > maxSalary){
                maxSalary = employees[i].getSalary();
                maxSalarySum = employees[i].getFullName();
            }
            if (employees[i].getSalary() < minSalary){
                minSalary = employees[i].getSalary();
                minSalarySum = employees[i].getFullName();
            }
            System.out.println( employees[i].getFullName() );
        }
        System.out.println("Общая сумма затрат за месяц: " + sum);
        System.out.println("Сотрудник с самой большой зарплатой: " + maxSalarySum+" - " + maxSalary);
        System.out.println("Сотрудник с самой низкой зарплатой: " + minSalarySum+" - " + minSalary);
        System.out.println("Средняя зарплата за месяц: " + middleSalary);


    }

    public void newName () { //добавляем процент к зп
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            System.out.print("was " + employees[i].getName() + " " + employees[i].getSalary());
            employees[i].addSalary(1.02);
            System.out.println(" now " + employees[i].getSalary());
        }
    }

    public void printAllEmployeesInWorkPlace () {
        ArrayList<Integer> workPlaceNumbers = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                continue;
            Integer workPlace = employees[i].getWorkPlace();
            if (! workPlaceNumbers.contains(workPlace))
                workPlaceNumbers.add(workPlace);
        }

        for (Integer workPlace : workPlaceNumbers) {
            System.out.println("Сотрудники отдела " + workPlaceNumbers.get(i));
            for (int e = 0; e < employees.length; e++) {
                if (employees[e] == null)
                    continue;
                Integer e_workPlace = employees[e].getWorkPlace();
                if (workPlace == e_workPlace)
                    System.out.println(employees[e].toString_noWorkPlace());
            }
        }

    }







}
