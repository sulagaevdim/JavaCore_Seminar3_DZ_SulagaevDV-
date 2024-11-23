public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    protected boolean lead;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.lead = false;
    }
    //region getters/setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isLead() {
        return lead;
    }

    public void setLead(boolean lead) {
        this.lead = lead;
    }
    //endregion

    public static boolean compareDate(String date1, String date2){
        return date1.equals(date2);
    }
}
