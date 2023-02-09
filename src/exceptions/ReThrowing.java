package exceptions;

public class ReThrowing {


    public static void main(String[] args) {



        try{
            Integer.parseInt("dsjcvdsgh");

        }
        catch (NumberFormatException ex){
            System.out.println("Taking a screenshot");
            throw ex;  // re-throw the caught exception after processing
            // re-throwing is usually useful in catch blocks where once the exception is caught and processed
            // in certain way, we might want to stop the execution and fail the code rather than
            // keep executing
        }

        System.out.println("More tests...");





    }
}
