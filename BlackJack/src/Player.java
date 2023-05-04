import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player{
	
	public String playerName ; 
	public List<BlackJackDeck> playerDeck = new ArrayList<>() ; 
	
	public Player(String name) {
		this.playerName = name ; 
		
		Collections.addAll(playerDeck, BlackJackDeck.values());
		Cards.shuffleNewCards(playerDeck);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
