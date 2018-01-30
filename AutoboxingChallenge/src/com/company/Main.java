package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 1222.23);
        bank.addCustomer("Adelaide", "Dani", 23412.56);


        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 100.00);
        bank.addCustomerTransaction("Adelaide", "Mike", 100.00);
        bank.addCustomerTransaction("Adelaide", "Dani", 100.00);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.54)) {
            System.out.println("Error: Melbourne does not exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Already created");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Snow", 223.23)) {
            System.out.println("Does not exist");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.23)){
            System.out.println("Customer already exists");
        }

    }
}
