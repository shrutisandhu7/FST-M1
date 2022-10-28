package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){

        HashSet<String> hs = new HashSet<>();
        hs.add("apple");
        hs.add("mango");
        hs.add("grapes");
        hs.add("peach");
        hs.add("guava");
        hs.add("strawberry");
        System.out.println("Size of Hashset: "+hs.size());
        System.out.println("Element removed which is present?: "+hs.remove("guava"));
        if(hs.remove("banana")) {
            System.out.println("banana is removed from the Set");
        } else {
            System.out.println("banana is not present in the Set");
        }

        if(hs.contains("peach"))
            System.out.println("Element is present");

        System.out.println("Final Set: ");
        for(String s:hs){
            System.out.print(s+" ");
        }

    }
}
