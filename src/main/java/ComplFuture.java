import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComplFuture {
   public String getSmth(){
       return "Hellow world";
   }

   public void printThread() {
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println(Thread.currentThread().getName());
   }
    public String getThread() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName();
    }


   public String threads(){

       ExecutorService es = Executors.newFixedThreadPool(8);
       for (int i = 0; i < 8; i++) {
           es.execute(this::printThread);
       }
        es.shutdown();
       return "Ok";
   }

}
