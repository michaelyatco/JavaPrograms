package com.example.test;
public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i*privateVar); //this.privateVar will refer to the variable at the greater scope - the field
        }
        //System.out.println("Value of i is now " + i); Scope of i is restricted to the for loop

    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
            int privateVar = 2; //delete this and it will go to the 3 in the InnerClass field
            for (int i = 0; i<10; i++) {
                System.out.println(i + " times two is " + i*privateVar); //this.privateVar will look at 3 in InnerClass field
                //ScopeCheck.this.privateVar will look at the initial field instead
            }
        }
    }
}
