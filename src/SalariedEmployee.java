public class SalariedEmployee extends StaffMember{
    private double salary, bonus;

    public SalariedEmployee(int id, String name, String address, double salary, double bonus) {
        super(id, name, address);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double pay(){
        return(pay = salary+bonus);
    }

    @Override
    public String toString() {
        return "SalariedEmployee {" +
                " ID=" + id +
                ", Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Salary=" + salary +
                ", Bonus=" + bonus +
                ", Pay=" + pay() +
                '}';
    }
}
