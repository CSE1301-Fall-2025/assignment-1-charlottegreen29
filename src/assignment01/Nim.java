// import java.util.Scanner;

import java.util.Scanner;

public class Nim {

    public static void main(String[] args) {

        int numSticks=7;
        boolean personTurn = true;
        int sticksTaken;
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Nim!");

        while (numSticks>0) {
            if (personTurn==true) {
                if (numSticks==1){
                    System.out.println("It's your turn, but because there's only one stick left, you must take it.");
                }
                else {
                    System.out.println("It is your turn. Would you like to take 1 or 2 sticks from the pile?");
                }
                sticksTaken = scan.nextInt();
                if (sticksTaken != 1 && sticksTaken != 2){
                    System.out.println("You didn't type 1 or 2, which are your only 2 options, so you will be taking 1 stick from the pile.");
                    sticksTaken = 1;
                }
                if (sticksTaken == 2 && numSticks == 1){
                    System.out.println("There's only one stick left, so you have to take one stick this time!");
                    sticksTaken = 1;
                }
                numSticks-=sticksTaken;
                personTurn=false;
            }
            else {
                System.out.println("Now it's my turn.");
                if (numSticks!=1) {
                    sticksTaken = (int)(Math.random()*2)+1;
                }
                else {
                    sticksTaken=1;
                }
                System.out.println("I'm going to take " + sticksTaken + " sticks.");
                numSticks-=sticksTaken;
                personTurn=true;
            }
             System.out.println("There are now " + numSticks + " sticks in the pile.");
        }
            if (personTurn==true) {
                System.out.println("I just took the last stick, so you win!");
            }
            else {
                System.out.println("You just took the last stick, so I win!");
            }
    }
}
