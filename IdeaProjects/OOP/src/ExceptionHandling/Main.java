package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{//try everything
//            divide(a,b);
            String name = "tan";
            if(name.equals("tan")){
                throw new myException("name is tan");
            }
//            int c =a/b;
        }
        catch (myException e ){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){//if anything bad happens catch it and do the following
            System.out.println(e.getMessage());// / by zero
        }
        catch (Exception e){
            System.out.println("normal exception");

        }finally{
            System.out.println("this will always execute");
        }
        //int c = a/b;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at ExceptionHandling.Main.main(Main.java:7)
    }
    static int divide(int a, int b) throws ArithmeticException{//throws means it may throw the exception
        if(b==0){
            throw new ArithmeticException("dont divide by zero");
        }
        return a/b;
    }
}
