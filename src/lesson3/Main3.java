package lesson3;

public class Main3 {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 60; k++) {
                    for (int l = 0; l < 60; l++) {

                        System.out.printf(
                                "Прошло  %d дней, %d часов, %d минут, %d секунд", i, j, k, l);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                    }
                }
            }

        }
    }
}

