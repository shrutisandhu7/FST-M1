package activities;

interface Addable{

    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args){

        Addable ad1;
        Addable ad2;
        ad1 = (num1, num2) -> (num1+num2);
        ad2 = (int num1, int num2) -> {
                return (num1 + num2);
        };

        System.out.println("Sum is: "+ad1.add(10,20));
        System.out.println("Sum is: "+ad2.add(10,40));
    }
}
