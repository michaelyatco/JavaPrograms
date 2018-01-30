package com.company;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account(); //calling the constructor
        Account bobsAccount = new Account("12345", 0.00, "Bob Belcher", "Bob@burger.com", "(516) 232-2323");
        System.out.println(bobsAccount.getCustomerName());

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Belcher");
        bobsAccount.setCustomerEmailAddress("Bob@burger.com");
        bobsAccount.setCustomerPhoneNumber("(516) 123-4456");
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account mikesAccount = new Account();
        System.out.println(mikesAccount.getCustomerName());

       Account timsAccount = new Account("Tim", "tim@gmail.com", "516-232-2322");
       System.out.println(timsAccount.getBalance());

       VipCustomer person1 = new VipCustomer();
       System.out.println(person1.getName());

       VipCustomer person2 = new VipCustomer("Bob", 25000.00);
       System.out.println(person2.getName());

       VipCustomer person3 = new VipCustomer("Dani", 100.00, "dani@gmail.com");
       System.out.println(person3.getEmailAddress());
    }
}
