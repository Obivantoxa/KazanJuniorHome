package lesson3;

public class Main1 {

    public static void main(String[] args) {

//        int [][] mass = new int[5][6];
//        int i = mass.length;
//        int j = mass[i].length;

        int m = 7;
        int n = 7;
        int[][] nums = new int[n][m];

        for (int i = 0; i< nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if ((i - j <= nums.length / 2) && (i - j >= -nums.length / 2) &&
                        (i + j > nums.length / 2 - 1) && (i + j < (nums.length + nums.length / 2 ))) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");






    }
}
