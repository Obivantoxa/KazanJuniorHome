package lesson4;

public class Toure {
int i =0;



    public static void getCountry(String[][] massTour, String countr) {

        for (int i = 0; i < massTour.length; i++){

            System.out.printf((massTour[i][0]==countr?"Country %s,Summa %s, Food %s\n":"")
                    ,massTour[i][0],massTour[i][1],
                    massTour[i][3],massTour[i][4]);
        }

    }

    public void delCountry(String[][] massTour,String country){

    }
    public static void getCountry(String[][] massTour, String countr,int max) {
        for (int i = 0; i < massTour.length; i++){
            if(Integer.parseInt(massTour[i][1])>max){
            }
            System.out.printf((massTour[i][0]==countr?"Country %s,Summa %s, Food %s\n":"")
                    ,massTour[i][0],massTour[i][1],
                    massTour[i][3],massTour[i][4]);
        }

    }

    public static void corting ( String[][] massTour,int minPrice, int maxPrice){
        for (int i = 0; i<massTour.length; i++){
            if((Integer.parseInt(massTour[i][1])>=minPrice) && Integer.parseInt(massTour[i][1])<=maxPrice){

                System.out.printf("Country %s,Summa %s, Food %s\n"
                        ,massTour[i][0],massTour[i][1],
                        massTour[i][3],massTour[i][4]);
            }

        }
    }

}
