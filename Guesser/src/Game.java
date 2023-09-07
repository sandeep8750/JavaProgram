import java.util.*;


class Guesser
{
	int guessNum;
	int guessNum()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Gusser kindly guess the number .");
		guessNum=input.nextInt();
		return guessNum;	
	}
}

class Player
{
	int guessPlayerNum;
	int guessPlayerNum()
	{
		Scanner input = new Scanner(System.in);
		System.out.println( " Player guess the number .");
		guessPlayerNum=input.nextInt();
		return guessPlayerNum;
		
	}
}
	
class Umpire 
{
	int numberFromGuess;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;

	void collectFromGuesser()
	{
		Guesser g=new Guesser();
		numberFromGuess=g.guessNum();
	}
	
	void collectFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numberFromPlayer1=p1.guessPlayerNum();
		numberFromPlayer2=p2.guessPlayerNum();
		numberFromPlayer3=p3.guessPlayerNum();
	}
	void compare()
	{
		if(numberFromGuess==numberFromPlayer1)
		{
			System.out.println("Player 1 won the game ");
		}
		else if(numberFromGuess==numberFromPlayer2)
		{
			System.out.println("Player 2 won the game ");
		}
		else if(numberFromGuess==numberFromPlayer3)
		{
			System.out.println("Player 3 won the game ");
		}
		else  
		{
			System.out.println("Game lost try again ");
		}
	}
}

public class Game {

public static void main(String[] args) {
Umpire u =new Umpire();
u.collectFromGuesser();
u.collectFromPlayer();
u.compare();
}
}


