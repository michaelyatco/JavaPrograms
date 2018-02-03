package com.company;

public interface ITelephone {
    void powerOn(); //no need for public - redundant access modifier
    void dial(int phoneNumber); //not creating classes; creating signatures
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging(); //a class will inherit this interface
}
