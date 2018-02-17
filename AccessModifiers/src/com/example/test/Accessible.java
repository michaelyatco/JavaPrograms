package com.example.test;
//Visibility
interface Accessible { //Package-private
    int SOME_CONSTANT = 100; //public
    public void methodA(); //public
    void methodB();
    boolean methodC(); //public -all interface methods are automatically public
}
