package lesson10;

import java.util.Scanner;

public class Dealer extends Player {
	
	public Dealer() {
        super("Boss");
	}
	
	public boolean needMoreKartaDealer(Dealer d) {
		 if (d.showPlayerValue() < 18 ){
	            return true;
	        }
	        return false;
	    }
   
}
