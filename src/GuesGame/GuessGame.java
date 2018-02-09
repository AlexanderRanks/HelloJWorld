package GuesGame;

import java.util.Scanner;

//Угадайка. Игрок загадывает число от 1 до 100 и не сообщает о нем компьютеру.
// Компьютер пытается его отгадать. На каждую попытку компьютера игрок отвечает `>`, `<` или `=`
public class GuessGame {
    public static void main(String[] args) {
        int wishMin=1;
        int wishMax=100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of any nymber between " + wishMin + " and " + wishMax);
        System.out.println("When ready press ENTER.");
        scanner.nextLine();

        int newGuess=0;
        do {

            if(wishMin==wishMax){
                System.out.println("You are thinking of: "  + wishMin);
                newGuess = 0;
            }else {
                newGuess = (wishMin+wishMax)/2;
                System.out.println("Are you thinking of: "  + newGuess+"?");
                String userInput;
                do {
                    System.out.println("[<,>,=]");
                    userInput = scanner.nextLine();
                } while ((!userInput.equals("="))&&(!userInput.equals("<"))&&(!userInput.equals(">")));

                if (userInput.equals("<")){
                    wishMax = newGuess-1;
                }else if(userInput.equals(">")){
                    wishMin = newGuess+1;
                }else{
                    newGuess = 0;
                }

            }
        }while(newGuess!=0);

        scanner.close();
    }
}
