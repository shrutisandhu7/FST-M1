package activities;

public class Activity2 {
    public static void main(String[] args){

        int[] array = {10, 77, 10, 54, -11, 10};
        int sum = 0;

        for(int i = 0; i < array.length;i++){
            if(array[i] == 10){
                sum+=array[i];
            }
        }
        if(sum == 30)
            System.out.println("Sum of tens is 30");
        else
            System.out.println("Sum of tens is not 30");
    }
}
