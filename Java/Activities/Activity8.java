package activities;

class CustomException extends Exception{

    private String message = null;
    CustomException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {

    public static void main(String[] Args){
    exceptionTest(null);
    exceptionTest("Harry");
    }
    static void exceptionTest(String str){
        if(str == null){
            try {
                throw new CustomException("Exception occurred!! String value is null!!");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
        else{

            System.out.println("String value: " +str);
        }
    }
}
