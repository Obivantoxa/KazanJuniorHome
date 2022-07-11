package lesson10;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
	
	Card []cardColoda = new Card[52];
	
	public Koloda(){
	
	cardColoda[0] = new Card(" 2 cherv ", 2);
	cardColoda[1] = new Card(" 2 bubi ", 2);
	cardColoda[2] = new Card(" 2 kresti ", 2);
	cardColoda[3] = new Card(" 2 piki ", 2);

	cardColoda[4] = new Card(" 3 cherv ", 3);
	cardColoda[5] = new Card(" 3 bubi ", 3);
	cardColoda[6] = new Card(" 3 kresti ", 3);
	cardColoda[7] = new Card(" 3 piki ", 3);
 
	cardColoda[8] = new Card(" 4 cherv ", 4);
	cardColoda[9] = new Card(" 4 bubi ", 4);
	cardColoda[10] = new Card(" 4 kresti ", 4);
	cardColoda[11] = new Card(" 4 piki ", 4);

	cardColoda[12] = new Card(" 5 cherv ", 5);
	cardColoda[13] = new Card(" 5 bubi ", 5);
	cardColoda[14] = new Card(" 5 kresti ", 5);
	cardColoda[15] = new Card(" 5 piki ", 5);

	cardColoda[16] = new Card(" 6 cherv ", 6);
	cardColoda[17] = new Card(" 6 bubi ", 6);
	cardColoda[18] = new Card(" 6 kresti ", 6);
	cardColoda[19] = new Card(" 6 piki ", 6);

	cardColoda[20] = new Card(" 7 cherv ", 7);
	cardColoda[21] = new Card(" 7 bubi ", 7);
	cardColoda[22] = new Card(" 7 kresti ", 7);
	cardColoda[23] = new Card(" 7 piki ", 7);

	cardColoda[24] = new Card(" 8 cherv ",8);
	cardColoda[25] = new Card(" 8 bubi ", 8);
	cardColoda[26] = new Card(" 8 kresti ", 8);
	cardColoda[27] = new Card(" 8 piki ", 8);

	cardColoda[28] = new Card(" 9 cherv ", 9);
	cardColoda[29] = new Card(" 9 bubi ", 9);
	cardColoda[30] = new Card(" 9 kresti ", 9);
	cardColoda[31] = new Card(" 9 piki ", 9);

	cardColoda[32] = new Card(" 10 cherv ", 10);
	cardColoda[33] = new Card(" 10 bubi ", 10);
	cardColoda[34] = new Card(" 10 kresti ", 10);
	cardColoda[35] = new Card(" 10 piki ", 10);

	cardColoda[36] = new Card(" Valet cherv ", 10);
	cardColoda[37] = new Card(" Valet bubi ", 10);
	cardColoda[38] = new Card(" Valet kresti ", 10);
	cardColoda[39] = new Card(" Valet piki ", 10);

	cardColoda[40] = new Card(" Dama cherv ", 10);
	cardColoda[41] = new Card(" Dama bubi ", 10);
	cardColoda[42] = new Card(" Dama kresti ", 10);
	cardColoda[43] = new Card(" Dama piki ", 10);

	cardColoda[44] = new Card(" King cherv ", 10);
	cardColoda[45] = new Card(" King bubi ", 10);
	cardColoda[46] = new Card(" King kresti ", 10);
	cardColoda[47] = new Card(" King piki ", 10);

	cardColoda[48] = new Card(" Tuz cherv ", 11);
	cardColoda[49] = new Card(" Tuz bubi ", 11);
	cardColoda[50] = new Card(" Tuz kresti ", 11);
	cardColoda[51] = new Card(" Tuz piki ", 11);

	}
	
	public Card getsRandomCard(){
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, cardColoda.length);
		return cardColoda[randomNum];
	}
}
