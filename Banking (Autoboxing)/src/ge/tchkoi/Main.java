package ge.tchkoi;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Tchkoi",50.05);
        bank.addCustomer("Adelaide","Mike", 435.31);
        bank.addCustomer("Adelaide","Percy",234.132);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 276.43);

        bank.addCustomerTransaction("Adelaide","Tchkoi",33.43);
        bank.addCustomerTransaction("Adelaide","Tchkoi",12.32);
        bank.addCustomerTransaction("Adelaide","Mike",1.63);

        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);
    }
}
