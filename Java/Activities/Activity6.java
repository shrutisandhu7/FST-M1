package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int maxpassengers){
       this.maxPassengers = maxpassengers;
       passengers = new ArrayList<>();
    }
    public void onboard(String passenger){
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
public class Activity6 {
    public static void main(String[] args){
            Plane plane = new Plane(10);
            plane.onboard("Shruti");
            plane.onboard("Sudhanshu");
            plane.onboard("Ruchika");
            plane.onboard("Pooja");
            plane.onboard("Ankita");
            plane.onboard("Neha");

            System.out.println("Plane took off time: "+plane.takeOff());

            System.out.println("Passengers on plane: "+plane.getPassengers());

            System.out.println("Wait For It--------:)");
        try {
            Thread.sleep(5000); //5 seconds wait
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        plane.land();
        System.out.println("Plane landing time: "+plane.getLastTimeLanded());
        System.out.println("Passengers after plane landed: "+plane.getPassengers());

    }
}
