package com.company;

public class Main
    {
        public static void main(String[] args) {

        Vehicle a = new Vehicle();

        a.setstarting("Starting");
        a.setgoing_90_mph("Going 90 mph");
        a.setaccelerating("Accelerating");
        a.setStopped("Stopped");

        System.out.println("The red Porsche is " + a.getStarting());
        System.out.println(("The red Porsche is " +a.getaccelerating()));
        System.out.println("The red Porsche is " + a.getGoing_90_mph());
        System.out.println("The red Porsche is " + a.getStopped());

        CarApp c= new CarApp();
        c.setaccelerating("80 mph");
        System.out.println("The  Blue Jetta is Going "+c.getaccelerating());
        System.out.println("The  Blue Jetta has " + a.getStopped());
        


    }

}
