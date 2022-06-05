public class Main {

    public static void main(String[] args) {
        EmployeeBook empBook = new EmployeeBook();

        empBook.printAllEmployees();

        System.out.println("Дабавляем сотрудников");
        for (int i = 0; i < 55; ++i) {
            if ( empBook.addEmployee() )
                System.out.printf("%d ", i);
            else
                System.out.printf("\n%d - Массив сотрудников переполнен", i);
        }

        empBook.printAllEmployees();


    System.out.println("Удаляем сотрудников");
        for (int i = 0; i < 10; ++i) {
            empBook.delEmployee(  (int)((50-1)* Math.random()) );

        }
        empBook.printAllEmployees();

        System.out.println("Ищем рандомного сотрудника и меняем ЗП с отделом");
        Employee sotrudnik = empBook.findEmployee ( (int)((50-1)* Math.random()) );
        if (sotrudnik != null)
        {
            empBook.changeSalary(25_222, sotrudnik);
            empBook.changeWorkPlace(25, sotrudnik);
        }

        empBook.printAllEmployees();
        empBook.printAllEmployeesInWorkPlace();



        }
}