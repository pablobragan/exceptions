package org.pbragan.exceptions.examples.services;

import java.time.Duration;

public class InfiniteExecutionService implements Runnable{

    private Duration timeout;

    public InfiniteExecutionService(Duration timeout){
        this.timeout = timeout;
    }

    public void run()  {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(this.timeout.toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("FINALLY Service");
        }
    }
}
