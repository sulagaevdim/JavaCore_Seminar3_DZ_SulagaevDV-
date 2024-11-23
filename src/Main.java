import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
        // представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

        System.out.println("Задание 1:");
        System.out.println("Результат сравнения дат 2024-11-23 и 2024-11-23: "
                + Employee.compareDate("2024-11-23", "2024-11-23"));
        System.out.println("Результат сравнения дат 2024-11-23 и 1999-05-22: "
                + Employee.compareDate("2024-11-23", "1999-05-22"));
        System.out.println();

        // 2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод
        // повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он
        // мог поднять заработную плату всем, кроме руководителей. В основной программе создайте
        // руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем
        // сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

        System.out.println("Задание 2:");
        Employee employee1 = new Employee("Дмитрий", "Сулагаев", 40000);
        Employee employee2 = new Employee("Александр", "Андронов", 45000);
        Employee employee3 = new Supervisor("Михаил", "Орлов", 80000);
        Employee[] employees = new Employee[]{employee1, employee2, employee3};
        System.out.println("Зарплаты сотрудников до индексации:    "
                + "     1:" + employee1.getSalary()
                + "руб  2:" + employee2.getSalary()
                + "руб  3:" + employee3.getSalary() + "руб");
        Supervisor.upSalary(employees, 20);
        System.out.println("Зарплаты сотрудников после индексации: "
                + "     1:" + employee1.getSalary()
                + "руб  2:" + employee2.getSalary()
                + "руб  3:" + employee3.getSalary() + "руб");
    }
}