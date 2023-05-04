import java.util.Scanner;

public class BlackJack{
	
	int playerFirstCard ; 
	int playerSecondCard ; 
	
	int dealerFirstCard ; 
	int dealerSecondCard ; 

	private static boolean validateIfBlackJack(int player) {
		
		return player == 21 ? true : false ; 
	}
	
	private static boolean validateIfBusted(int player) {
		return player > 21 ? true : false ;
	}
	
	private static void gameLogic(int sumOfPlayer ,  int sumOfDealer , Scanner sc , Player newPlayer  , Dealer dealer)
	{
		if(validateIfBlackJack(sumOfPlayer) || (sumOfDealer > 17 ))
			System.out.println("Congratulations " + newPlayer.getPlayerName() +" BlackJack !!");	
		
		else if (validateIfBusted(sumOfPlayer))
			System.out.println("Busted your lose !!");
		
		while(true) {
			int cardCount  = 2 ; 
			
			if(sumOfPlayer < 21 && sumOfDealer <= 17 ){

				System.out.println("Do u want to Hit or Stand ? ");
				String input = sc.next()  ; 

				if(input.equalsIgnoreCase("hit"))
				{
					System.out.println("Your "+  (cardCount + 1) +" card is : " + newPlayer.playerDeck.get(cardCount).getValue());
					sumOfPlayer += newPlayer.playerDeck.get(cardCount).getValue() ;
					
					System.out.println("Dealer  "+  (cardCount + 1) +" card is : " + dealer.dealerDeck.get(cardCount).getValue());
					sumOfDealer += dealer.dealerDeck.get(cardCount).getValue() ;

					if(validateIfBusted(sumOfPlayer))
					{
						System.out.println("Busted your lose !!");
						break ; 
					}
					else if (validateIfBlackJack(sumOfPlayer) || sumOfDealer > 17) {
						System.out.println("Congratulations " + newPlayer.getPlayerName() +" BlackJack !!");		
						break ; 
					}
					
					cardCount++ ; 

				}
				else if(input.equalsIgnoreCase("stand")) {
					
					if(sumOfPlayer > sumOfDealer)
					{
						System.out.println("Congrats " + newPlayer.getPlayerName()+" u Win !!");
					}
					else if(sumOfPlayer == sumOfDealer){
						System.out.println("Tie !!");
					}else
					{
						System.out.println("You Lose !!") ;
					}
					break ; 
					
				}else {
					System.out.println("Invalid input");
				}

			}
		}
	}
	
	public static void main(String args[])
	{
		boolean play = true ; 
		Scanner sc = new Scanner(System.in) ; 
		
		while(play)
		{
			System.out.println("Welcome to BlackJack !!");
			System.out.println("Please Enter Your Name :");
			
			Player newPlayer = new Player(sc.next()) ; 
			Dealer dealer = new Dealer() ; 
			
			//Player Deck
			int playerFirstCard  = newPlayer.playerDeck.get(0).getValue(); 
			int playerSecondCard  = newPlayer.playerDeck.get(1).getValue(); 
			
			//Dealer Deck
			int dealerFirstCard  = dealer.dealerDeck.get(0).getValue(); 
			int dealerSecondCard  = dealer.dealerDeck.get(1).getValue() ; 
			
			int sumOfPlayer = playerFirstCard + playerSecondCard ; 
			int sumOfDealer = dealerFirstCard + dealerSecondCard ; 
			
			System.out.println("Player Deck : 1st Card :" +  playerFirstCard+ " 2nd Card :" + playerSecondCard);
			System.out.println("Dealer Deck :  1st Card :" + dealerFirstCard + " Dealer Deck : 2nd Card : " + dealerSecondCard);
			
			gameLogic(sumOfPlayer , sumOfDealer ,sc , newPlayer , dealer) ; 
			
			System.out.println("Do u want to play again ? Y or N");
			
			String playAgain = sc.next();
			play = playAgain.equalsIgnoreCase("Y") ? true : false ; 
		}
		
		sc.close();
		
	}

}
