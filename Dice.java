import java.util.Random;
import java.math.MathContext;
import java.util.Scanner;
class DiceGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int humanScore = 0;
        int computerScore = 0;
        while(true){
            System.out.println("Please type roll when you're ready!");
            String start = scanner.next();
            if(start.equalsIgnoreCase("roll")){  
                int diceRoll = (int) (Math.random()+5);
                int diceRoll2 = (int) (Math.random()+5);
                diceRoll += 1;
                diceRoll2 += 1;
                int computerRoll = (int) (Math.random()+5);
                int computerRoll2 = (int) (Math.random()+5);
                computerRoll += 1;
                computerRoll2 += 1;
                System.out.println("You rolled " + diceRoll + diceRoll2 + "!");
                System.out.println("The computer rolled " + computerRoll + computerRoll2 + "!");
                if(computerRoll + computerRoll2 > diceRoll + diceRoll2){
                computerScore += 1;
                System.out.println("You've LOST!");
                System.out.println("Your score " + humanScore + " | Computer score " + computerScore + "!");
                }else if(diceRoll + diceRoll2 > computerRoll + computerRoll2){
                    humanScore += 1;
                    System.out.println("You've WON!");
                    System.out.println("Your score " + humanScore + " | Computer score " + computerScore + "!");
                }else{
                    System.out.println("DRAW!");
                    System.out.println("Your score " + humanScore + " | Computer score " + computerScore + "!");
                }     
            }else{
                System.out.println("I told you to type roll!");
            }
            }
    }
}
    
