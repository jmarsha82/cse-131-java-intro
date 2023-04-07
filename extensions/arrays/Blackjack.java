package arrays;

import cse131.ArgsProcessor;

public class Blackjack {

	/**
	 * @param peoplePlaying amount of people playing
	 * @param gamesToPlay amount of games to play
	 * @param totalCalculate total that I use to compute the fration of wins for a human at the end
	 * @param playersScores[] what I store the scores in
	 * @param showCard is the card that the dealer is showing
	 * @param humansWins is the amount of hands that the human wins during all the games
	 * @param extra card is your hit card
	 * @param peoplePlaying amount of people playing
	 * @param cardOne is the first card that you draw
	 * @param cardTwo is the second card that you draw
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int peoplePlaying = ap.nextInt("How many autonomous players will there be?");
		int gamesToPlay = ap.nextInt("How many games do you want to play?");
		double totalCalculate = peoplePlaying * gamesToPlay;
		int [] playersScores = new int[peoplePlaying+2];
		int showCard = 0;
		int humanWins = 0;
		int extraCard = 0;
		for(int game=1;game<gamesToPlay+1;++game){
			for(int j=0; j<=peoplePlaying+1;++j){
				int cardOne = (int)(Math.random()/7.15 * 100); //first card draw between 2 and 13
				if(cardOne==0){cardOne=2;}
				if(cardOne==11){cardOne=10;}
				if(cardOne==12){cardOne=10;}
				if(cardOne==13){cardOne=10;}
				if(cardOne==1){cardOne=11;}
				int cardTwo = (int)(Math.random()/7.15 * 100); //second card draw between 2 and 13
				if(cardTwo==0){cardTwo=2;}
				if(cardTwo==11){cardTwo=10;}
				if(cardTwo==12){cardTwo=10;}
				if(cardTwo==13){cardTwo=10;}
				if(cardTwo==1){cardTwo=11;}
				if(j==0){
					showCard = cardTwo; // assigns the showCard for the dealer
				}
				int firstRoundScore = cardOne+cardTwo; // calculates the first round score
				playersScores[j] = firstRoundScore;
			}
			System.out.println("\n" + "Game " + game); //First set of outputs
			System.out.println("The dealer has a face up card value of: " + showCard);
			System.out.println("The players scores were (you are player one): ");
			for(int i=1;i<playersScores.length;i++){
				System.out.print(playersScores[i] + " ");	
			}
			int hitOrStand = ap.nextInt("Will you Hit or Stand? Hit=1 Stand=2"); //This will give you the option to hit or stand no matter what
			while(hitOrStand ==1){
				System.out.println("\n" + "You Hit!");
				extraCard = (int)(Math.random()/7.15 * 100); //extra card draw between 2 and 13
				if(extraCard==0){extraCard=2;}
				if(extraCard==11){extraCard=10;}
				if(extraCard==12){extraCard=10;}
				if(extraCard==13){extraCard=10;}
				if(extraCard==1){extraCard=11;}
				playersScores[1] += extraCard;
				System.out.println("You now have: " + playersScores[1] + 
						"\n" + "And the dealer is still showing " + showCard);
				hitOrStand = ap.nextInt("Will you Hit or Stand? Hit=1 Stand=2");
			}
			System.out.println("\n" + "You Stand!");
			while(playersScores[0] < 17){ // this is the dealers choice to hit or stand based off 17
				extraCard = (int)(Math.random()/7.15 * 100); //extra card draw between 2 and 13
				if(extraCard==0){extraCard=2;}
				if(extraCard==11){extraCard=10;}
				if(extraCard==12){extraCard=10;}
				if(extraCard==13){extraCard=10;}
				if(extraCard==1){extraCard=11;}
				playersScores[0] += extraCard;
			}
			for(int i=2;i<playersScores.length;++i){ // this is all other players choice to hit or stand based off 17
				while(playersScores[i] < 17){
					extraCard = (int)(Math.random()/7.15 * 100); //extra card draw between 2 and 13
					if(extraCard==0){extraCard=2;}
					if(extraCard==11){extraCard=10;}
					if(extraCard==12){extraCard=10;}
					if(extraCard==13){extraCard=10;}
					if(extraCard==1){extraCard=11;}
					playersScores[i] += extraCard;
				}

			}
			int finalPlayerOutput = 1;
			System.out.println("");
			for (int i=0;i<playersScores.length;++i){// This is the final output showing the results of the game
				System.out.println("Player " + finalPlayerOutput+ " got " + playersScores[i]);
				//This section only applies to the dealer
				if(finalPlayerOutput ==1){
					if(playersScores[0] == 21){System.out.println("Dealer Blackjack!");}
					if(playersScores[0]>21){
						System.out.println("Dealer Busts!");
						humanWins++;// Dealer busts then human gets point
					}
				}
				//This section applies to all other players but the dealer
				else{
					if(playersScores[i]>21){System.out.println("They busted");}
					else if(playersScores[i]==21){
						System.out.println("Blackjack!");
						if(finalPlayerOutput==2 && playersScores[0]<=21){
							//If the human gets blackjack and the dealer didn't bust then you get a point
							humanWins++;
						}
					}
					else if(playersScores[i] == playersScores[0]){
						System.out.println("They Push!");
						if(finalPlayerOutput==2){
							//If the human gets the same score as the dealer
							humanWins++;
						}
					}
					else if(playersScores[i] > playersScores[0]){
						System.out.println("They beat the dealer!");
						if(finalPlayerOutput==2){
							//If the human beats the dealer without a Blackjack being played between the two of them
							humanWins++;
						}

					}
				}
				finalPlayerOutput++;
			}
		}
		System.out.println("The amount of times the human won is: " + humanWins);
		System.out.println("The fraction of human wins is: " +(humanWins/totalCalculate));
	}
}
