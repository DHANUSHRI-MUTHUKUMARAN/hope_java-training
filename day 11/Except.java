public class Except{
    public static void main (String[] args){
        try{
            int a =9;
            int b= 0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}