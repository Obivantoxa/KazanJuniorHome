package lesson2;

public class Main6 {
    public static void main(String[] args) {

        //создать массив длиной в 10 элементов произвольными числами
        //задача вывести на консоль сколько четных и сколько нечетных там чисел
        int count=0;
        int countNech=0;
        int[] number = {2,4,6,8,8,8,6,10,11,15435};
        for (int i=0; i<number.length; i++){
            if ((number[i]%2==0)  ){
                count++;
            }else{
                countNech++;
            }
        }
        System.out.println("chet " +count);
        System.out.println("nechet " +countNech);
    }
}
