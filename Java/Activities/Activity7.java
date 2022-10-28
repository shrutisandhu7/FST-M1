package activities;

interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations{
    public int applyBrake(int decrement);
    public int speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{

    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public int applyBrake(int decrement) {
        this.currentSpeed = currentSpeed - decrement;
        System.out.println("Current speed of Bicycle: "+currentSpeed);
        return currentSpeed;
    }

    @Override
    public int speedUp(int increment) {
        this.currentSpeed = currentSpeed + increment;
        System.out.println("Current speed of Bicycle: "+currentSpeed);
        return currentSpeed;
    }

    public void bicycleDesc(){
        System.out.println("Number of gears of Bicycle: "+gears);
        System.out.println("CurrentSpeed of Bicycle: "+currentSpeed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;

    MountainBike(int seatHeight, int gears, int currentSpeed){
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
    @Override
    public void bicycleDesc() {
        super.bicycleDesc();
        System.out.println("SeatHeight of Bicycle: "+seatHeight );
    }
}

public class Activity7 {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3, 2, 25);
        mb.bicycleDesc();
        System.out.println("----After increasing speed----");
        mb.speedUp(20);
        System.out.println("----After decreasing speed----");
        mb.applyBrake(5);
        System.out.println("----After changing seat height---");
        mb.setHeight(2);
        mb.bicycleDesc();
    }
}
