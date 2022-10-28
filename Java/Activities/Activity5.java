package activities;

abstract class Book{

    String title;
    abstract void setTitle(String str);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String str) {
        title = str;
    }
}

public class Activity5{
    public static void main(String[] args){

        MyBook newNovel = new MyBook();
        newNovel.setTitle("Harry Potter");
        System.out.println("Title of book = " +newNovel.getTitle());
    }
}