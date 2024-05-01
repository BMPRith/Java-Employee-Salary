abstract class StaffMember{
    protected int id;
    protected double pay;
    protected String name, address;
    public StaffMember(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    abstract double pay();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}