package lesson16.homeWork;


import org.apache.log4j.Logger;

public class Main {
    /*
    Создать программу как на уроке, толко уже с 3мя певцами.
    Ведущий обьявил концерт.
    Потом Должен спеть первый, затем второй, и третий певец .
    Так три круга.
    Ведущий закрыл шоу.
    Так же подключить логирование и внести лог в файл.
     Должен обязательно отображаться имя потока, проснулся, уснул
     */
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Pevec1 pevec1 = new Pevec1();
        Pevec2 pevec2 = new Pevec2();
        Pevec3 pevec3 = new Pevec3();

        pevec1.setName(" Поток 1 ");
        pevec2.setName(" Поток 2 ");
        pevec3.setName(" Поток 3 ");
        pevec3.setDaemon(true);
        System.out.println("hellow start");
        pevec1.start();
        pevec2.start();
        pevec3.start();
        while (pevec1.isAlive()) {

        }
        System.out.println("finish!!!");
        LOGGER.info("Finish" + Thread.currentThread().getName());
    }
}
