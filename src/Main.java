public class Main {

    public static Employee[] employees = new Employee[10];

    public void printEmp(Employee[] employe) {
        System.out.println(employe.toString());
    }
    public static void printWorkPlace(int workPlace) {
        System.out.println("Задание среднего уровня");
        Employee emp_max = null; // new Employee("", "", "", 0, 0);
        Employee emp_min = null; // new Employee("", "", "", 0, 0);
        double sumSalary = 0;
        double meanSalary = 0;
        int col_workers = 0;

        // цикл по всем сотрудникам
        for (int i = 0; i < employees.length; i++)
        {
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
            // проверка номера отдела с введённым workPlace
            if (workPlace != employees[i].getWorkPlace())
                continue;
            employees[i].addSalary(1.07);
        } // end for

        // вывод сотрудников (кроме отдела)
        for (int i = 0; i < employees.length; i++) {
            // проверка номера отдела с введённым workPlace
            if (workPlace != employees[i].getWorkPlace())
                continue;
            System.out.println(employees[i].toString_noWorkPlace());
        } // end for

    } // end printWorkPlace


    public static void zadanie_3(double Salary) {
        System.out.println("Salary < " + Salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < Salary)
                System.out.println(employees[i].toString());
        } // end for
        System.out.println("Salary >= " + Salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= Salary)
                System.out.println(employees[i].toString());
        } // end for
    }

        public static void main(String[] args) {
            // пишем код курсовой список

        employees[0] = new Employee("Иван", "Петров", "Викторович", 1, 35_000 );
        employees[1] = new Employee("Любовь", "Петрова", "Ивановна", 1, 41_000);
        employees[2] = new Employee("Михаил", "Смирнов", "Александрович", 2, 29_000);
        employees[3] = new Employee("Борис", "Котов", "Игоревич", 2, 48_000);
        employees[4] = new Employee("Мария", "Смирнова", "Владимировна", 3, 65_000);
        employees[5] = new Employee("Денис", "Топоров", "Аркадьевич", 3, 60_000);
        employees[6] = new Employee("Александр", "Сильченко", "Евгеньевич", 4, 22_000);
        employees[7] = new Employee("Екатерина", "Левина", "Викторовна", 4, 45_000);
        employees[8] = new Employee("Наталья", "Кашапова", "Александровна", 5, 65_000);
        employees[9] = new Employee("Сергей", "Гаврилов", "Юрьевич", 5, 39_000);

        // выводим список сотрудников
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }

        // считаем мин, мах, средняя, общая
        int sum = 0;
        int maxSalary = employees[0].getSalary();
        int minSalary = employees[0].getSalary();
        int middleSalary = 0;
        String maxSalarySum = null;
        String minSalarySum = null;
        for(int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
            middleSalary = sum / employees.length;
            if (employees[i].getSalary() > maxSalary){
                maxSalary = employees[i].getSalary();
                maxSalarySum = employees[i].getFullName();
            }if (employees[i].getSalary() < minSalary){
                minSalary = employees[i].getSalary();
                minSalarySum = employees[i].getFullName();
            }
            System.out.println( employees[i].getFullName() );
        }
        System.out.println("Общая сумма затрат за месяц: " + sum);
        System.out.println("Сотрудник с самой большой зарплатой: " + maxSalarySum+" - " + maxSalary);
        System.out.println("Сотрудник с самой низкой зарплатой: " + minSalarySum+" - " + minSalary);
        System.out.println("Средняя зарплата за месяц: " + middleSalary);

//        addPrc(2.0, employees);

        //добавляем процент к зп
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.print("was " + employees[i].getName() + " " + employees[i].getSalary());
            employees[i].addSalary(1.02);
            System.out.println(" now " + employees[i].getSalary());
        }
        printWorkPlace(1);


        zadanie_3(50000);
    }


}