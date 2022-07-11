package lesson6.BlackJack;

public class Diller extends Player {



    @Override
    public boolean needKartaHand() {
        int count = 0;
        for (int i = 0; i < super.cards.length - 1; i++)
            if (super.cards[i] != null) {
                count = count + super.cards[i].getValue();

            }
        if (count < 18)
            return true;
        else
            return false;
    }
}
