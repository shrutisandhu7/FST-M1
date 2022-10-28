package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args){

        Map<Integer, String> colors = new HashMap<>();
        colors.put(1,"Blue");
        colors.put(2,"Black");
        colors.put(3,"Turquoise");
        colors.put(4,"Pink");
        colors.put(5,"Red");

        System.out.println("Map values: "+colors);

        colors.remove(3);
        System.out.println("After removing one element: "+colors);

        if(colors.containsValue("Green"))
            System.out.println("Green color is present!!");
        else
            System.out.println("Green color is not present:/");

            System.out.println("Size of map: "+colors.size());
    }
}
