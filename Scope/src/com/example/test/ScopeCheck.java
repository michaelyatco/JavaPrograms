package com.example.test;
public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i*varTwo); //this.privateVar will refer to the variable at the greater scope - the field
        }
        //System.out.println("Value of i is now " + i); Scope of i is restricted to the for loop

    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
//            int privateVar = 2; //delete this and it will go to the 3 in the InnerClass field
            for (int i = 0; i<10; i++) {
                System.out.println(i + " times two is " + i*varThree); //this.privateVar will look at 3 in InnerClass field
                //ScopeCheck.this.privateVar will look at the initial field instead
            }
        }
    }
}
