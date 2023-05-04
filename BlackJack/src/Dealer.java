import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {

	public List<BlackJackDeck> dealerDeck  = new ArrayList<>() ; 
	
	public Dealer() {
		Collections.addAll(this.dealerDeck, BlackJackDeck.values());
		Cards.shuffleNewCards(this.dealerDeck);
	}
	
}
