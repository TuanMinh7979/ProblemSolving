package common;

public class timer {
    public static void main(String[] args) {
//        long startTime= System.currentTimeMillis();
//        //thuat toan
//
//        long endTime=System.currentTimeMillis();
//        long exetime=endTime-startTime;
//        System.out.println("TIME EXECUTE: "+exetime);

        double startTime= System.nanoTime();
        //thuat toan

        double endTime=System.nanoTime();
        double exetime=(endTime-startTime)/1000000000;
        System.out.println("TIME EXECUTE: "+exetime);


    }
}
