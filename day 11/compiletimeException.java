public class compiletimeException {
    public static void main(String[] args) {
        Thread T = new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(5000);
                System.out.println("thread woke up");
            }
            catch(InterruptedException e){
                System.out.println("sleep interupted");

            }
        });
        T.start();
        T.interrupt();
        try{
            Thread.sleep(4000);
        }
        catch(Exception e){
            System.out.println("Not T");
        }
        T.interrupt();
    }
}
