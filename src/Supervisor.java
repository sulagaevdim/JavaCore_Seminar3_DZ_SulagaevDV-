public class Supervisor extends Employee{

    public Supervisor(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
        this.lead = true;
    }

    //метод повышение ЗП всем сотрудникам за исключением рук-лей на определенный индекс
    // (пример: индекс 1.2 = увеличение ЗП на 20%)
    public static void upSalary(Employee[] employees, double indexing){
        for (int i = 0; i < employees.length; i++) {
            if (!employees[i].lead) employees[i].setSalary(employees[i].getSalary() * (1 + indexing/100));
        }
    }
}
