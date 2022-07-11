package lesson8;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix(4, 5);
        Matrix m2 = new Matrix(4, 5);
        IMatrix m3 = new Matrix(4, 5);

        double i = m.getValueAt(3, 4);
        if (i == -1) {
            System.out.println("Массив вышел за границы");
        }

       // m.setValueAt(3, 4, 15);
       // double val = m.getValueAt(3, 4);
//        if (i == -1) {
//            System.out.println("Массив вышел за границы");
//        }else {
//            if (val == 15){
//                System.out.println("ok");
//            }else{
//                System.out.println("ne ok");
//            }
//        }
        m3 = m.add(m2);

    }
}
