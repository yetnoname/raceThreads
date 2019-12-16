import java.util.logging.Logger;

public class Thread1 {
    private static final Logger log = Logger.getLogger(String.valueOf(Thread1.class));

    static Thread2 anotherThread;

    public static void main(String[] args) {
        anotherThread = new Thread2();
        System.out.println("Гонка начата");
        anotherThread.start();
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
//            log.info("Поток 1");
            try {
                Thread.currentThread().sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток1!");

        }
        if (anotherThread.isAlive()) {
            try {
                anotherThread.join();
            } catch (InterruptedException e) {
            }
            System.out.println();
            log.info("Имя: потока 1");
            log.info("Выиграл поток 1");
            log.info("\n");

        } else {
            System.out.println();
            log.info("Имя: потока 2");
            log.info("Выиграл поток 2");
            log.info("\n");

        }
        System.out.println("Конец гонки");
    }

}





