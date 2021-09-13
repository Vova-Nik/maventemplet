import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;


class ComplFutureTest {

    @Test
    void tt() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World");
        assertEquals("Hello World", future.get());
    }

    @Test
    void ttCombine() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));

        assertEquals("Hello World", completableFuture.get());
    }


    public void printThread() {
        try {
            Thread.sleep(10);
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

    @Test
    public void threads(){
        ExecutorService es = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 8; i++) {
            System.out.println("Executed " + i);
        //            es.execute(() -> { System.out.println(Thread.currentThread().getName()); });
            es.execute(this::printThread);
        }
        es.shutdown();
    }

    @Test
    public void threadsSubmit(){
        ExecutorService es = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 8; i++) {
            System.out.println("Executed " + i);
            //            es.execute(() -> { System.out.println(Thread.currentThread().getName()); });
            CompletableFuture<String> cf = (CompletableFuture)es.submit(this::printThread);
        }
        es.shutdown();
    }


}

