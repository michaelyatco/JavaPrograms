package com.company;

//Limitation of inheritance - can only extend from one class
//Composition advantage - to initialize the PC object - you initialize the Case, Monitor, and Motherboard objects to put together the PC
//Hide the functionality further in order to not allow the calling program to access those objects directly
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
