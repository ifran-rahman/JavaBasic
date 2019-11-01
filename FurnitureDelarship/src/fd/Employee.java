package fd;

public class Employee {

    public void handlecustomer(Customer cust,boolean finance,Furtinure f)
    {
        if(finance == true)
        {

            double loanamountj = f.getPrice()-cust.getCashonhold();
            runCreditHistory(cust,loanamountj);
        }else if(f.getPrice()<=cust.getCashonhold())
        {
            processTransacction(cust,f);
        }else{
            System.out.println("customer needs more money");
        }

    }

    private void runCreditHistory(Customer cust, double loadamountj) {
        System.out.println("ran credit history for customer");
        System.out.println("Customer has been approved to purchase the furniture");
    }

    public void processTransacction(Customer cust,Furtinure f)
    {
        System.out.println("customer has purchased the furniture"+f+"for the price"+f.getPrice());
    }

}
