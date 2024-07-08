package LabTask12;
class Transport {

    protected String name="By Walk";
    protected String made="Human";
    protected int model=2002;

    public void vehicleDetails() {
        System.out.println("Vehicle Name = " + name);
        System.out.println("Vehicle made = " + made);
        System.out.println("Vehicle model = " + model);
    }
}
class Cars extends Transport {
    Cars() {
        super();
        this.name = "Noir droptail";
        this.made = "RollsRoyce";
        this.model = 2023;
    }
}
class MotorCycles extends Transport {

    MotorCycles() {
        super();
        this.name = "Ninja H2R";
        this.made = "Kawasaki";
        this.model = 2021;
    }
}

public class Main {

    public static void main(String args[]) {
        System.out.println("Transport Class: ");
        Transport t = new Transport();
        t.vehicleDetails();
        
        System.out.println("\nCar Class: ");
        Cars c = new Cars();
        c.vehicleDetails();
        
        System.out.println("\nMotorcyle Class");
        MotorCycles m = new MotorCycles();
        m.vehicleDetails();}}
