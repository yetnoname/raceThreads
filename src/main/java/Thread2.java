import java.util.logging.Logger;

public class Thread2 extends Thread {

    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.currentThread().sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток2!");

        }
    }
}

