package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

       for(String s:myList){
           System.out.print(s +" ");
       }

       System.out.println();
       System.out.println("Third element: "+myList.get(2));
       if(myList.contains("A"))
           System.out.println("Element exists");

        System.out.println("Size of array: "+myList.size());

        myList.remove("B");
        System.out.println("Size of array after removing 1 element: "+myList.size());
    }
}
