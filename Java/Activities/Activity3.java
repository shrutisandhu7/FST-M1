package activities;

public class Activity3 {

    public static void main(String[] args){
        double ageseconds = 1000000000;

        double Earth = 31557600;
        double Mercury = 0.2408467;
        double Venus = 0.61519726;
        double Mars =  1.8808158;
        double Jupiter = 11.862615;
        double Saturn = 29.447498;
        double Uranus = 84.016846;
        double Neptune = 164.79132;

        System.out.println("Age on Earth: " +ageseconds/Earth);
        System.out.println("Age on Mercury: " +ageseconds/Earth/Mercury);
        System.out.println("Age on Venus: " +ageseconds/Earth/Venus);
        System.out.println("Age on Mars: " +ageseconds/Earth/Mars);
        System.out.println("Age on Jupiter: " +ageseconds/Earth/Jupiter);
        System.out.println("Age on Saturn: " +ageseconds/Earth/Saturn);
        System.out.println("Age on Uranus: " +ageseconds/Earth/Uranus);
        System.out.println("Age on Neptune: " +ageseconds/Earth/Neptune);

    }
}
