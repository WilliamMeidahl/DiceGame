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
                int diceRoll = (int) (Math.random()*11);
                diceRoll += 2;
                int computerRoll = (int) (Math.random()*11);
                computerRoll += 2;
                System.out.println("You rolled " + diceRoll + "!");
                System.out.println("The computer rolled " + computerRoll + "!");
                if(computerRoll > diceRoll){
                computerScore += 1;
                System.out.println("You've LOST!");
                System.out.println("Your score " + humanScore + " | Computer score " + computerScore + "!");
                }else if(diceRoll > computerRoll){
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
    // private static Result compareActions(Integer computerRoll, Integer diceRoll){
    //     if(computerRoll == diceRoll{
    //         return Result.DRAW;
    //     }
    //     if( user.equals(rock) && computer.equals(scissors) || user.equals(scissors) && computer.equals(paper) ||  user.equals(paper) && computer.equals(rock)){
    //         return Result.WIN;
    //     }
    //     return Result.LOSE;
    // }
    // enum Result {
    //     WIN,
    //     LOSE,
    //     DRAW
    // }
}
    
