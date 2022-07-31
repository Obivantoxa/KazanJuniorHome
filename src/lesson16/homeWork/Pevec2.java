package lesson16.homeWork;

import lesson16.Monitor;
import org.apache.log4j.Logger;

public class Pevec2 extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Pevec2.class);
    public void run() {
        while (true) {
           // LOGGER.info("сейчас активный поток" + Thread.currentThread().getName());
            synchronized (Monitor.MIKROFON) {
                try {
                    Monitor.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("--------------PaPa");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            LOGGER.info("сейчас  поток" + Thread.currentThread().getName() +"Спит");
            synchronized (Monitor.MIKROFON) {

                Monitor.MIKROFON.notify();

            }

        }
    }
}
