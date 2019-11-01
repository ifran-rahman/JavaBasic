package fd;

public class Customer {
    public Object setName;
    String name;
    String Address;
    double cashonhold;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getCashonhold() {
        cashonhold+=500;
        return cashonhold;
    }

    public void setCashonhold(double cashonhold) {
        this.cashonhold = cashonhold;
    }

    public void purchasefurniture(Furtinure f,Employee emp,boolean finance)
    {
        emp.handlecustomer(this,finance,f);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "setName=" + setName +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", cashonhold=" + cashonhold +
                '}';
    }
}
