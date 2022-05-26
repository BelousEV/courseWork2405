public class Main {
    public static void main(String[] args) {
        // пишем код курсовой список
        Employee[] employees = new Employee[10];

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
    }

}