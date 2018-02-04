package com.company;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
		//local class - good when every button does the same thing
//		class CLickListener implements Button.OnClickListener {
//			public CLickListener() {
//				System.out.println("I've been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}

//		btnPrint.setOnClickListener(new CLickListener());
//		listen();

		//Anonymous class because of new OnclickListener implemented
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			@Override //In order to ensure we implemented the interface correctly
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});
		listen();

//	    Gearbox mcLaren = new Gearbox(6);
////	    mcLaren.addGear(1, 5.3);
////	    mcLaren.addGear(2, 10.6);
////	    mcLaren.addGear(3, 15.9); Not necessary once addGear is added to the constructor
//	    mcLaren.operateClutch(true);
//	    mcLaren.changeGear(1);
//	    mcLaren.operateClutch(false);
//	    System.out.println(mcLaren.wheelSpeed(1000));
//	    mcLaren.changeGear(2);
//	    System.out.println(mcLaren.wheelSpeed(3000));
//	    mcLaren.operateClutch(true);
//	    mcLaren.changeGear(3);
//	    mcLaren.operateClutch(false);
//	    System.out.println(mcLaren.wheelSpeed(6000));


//	    Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//	    //Specify the outer class first before the inner class
        //Be mindful of the syntax
	    //System.out.println(first.driveSpeed(1000)); won't work if inner class is private

	    //Gearbox.Gear second = new Gearbox.Gear(2, 15.4); Wrong declaration
        //Gearbox.Gear third = new mcLaren.Gear(3, 17.8); Won't work either
		//Inner classes are normally private so they're only accessible by the outer clas

    }

    private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 0:
					quit = true;
					break;
				case 1:
					btnPrint.onClick();
			}
		}
	}
}
