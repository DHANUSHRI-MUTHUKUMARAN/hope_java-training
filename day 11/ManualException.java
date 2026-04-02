class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class ManualException {
    static void checkAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is lesser than 18");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        try{
            ManualException.checkAge(17);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
