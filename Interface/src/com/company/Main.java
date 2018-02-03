package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone timsPhone;
	    //ITelephone timPhone = new Telephone() Does not work
        //The actual class implementation (Deskphone) is the specific functionality for a certain type of phone
	    timsPhone = new DeskPhone(123456);
	    timsPhone.powerOn();
	    timsPhone.callPhone(123456);
	    timsPhone.answer();

	    timsPhone = new MobilePhone(23455);
	    timsPhone.powerOn();
	    timsPhone.callPhone(23455);
	    timsPhone.answer();
    }
}
