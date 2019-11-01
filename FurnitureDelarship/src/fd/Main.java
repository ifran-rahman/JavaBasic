package fd;

public class Main {

    public static void main(String[] args) {
	Customer c1=new Customer();

	c1.setName("tom");
	c1.setAddress("pathantule");
	c1.setCashonhold(1500);

	Furtinure f=new Furtinure();

	Employee emp=new Employee();

	c1.purchasefurniture(f,emp,false);

	c1.toString();

    }
}
