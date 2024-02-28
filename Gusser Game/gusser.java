import java.util.Scanner;
//guesser 
class Guesser{
    int guessNum;

   int guessNumber(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Gusser! Kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}
//player 
class Player1{
    int pguessNum;
    int guessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Palyer 1 Kindly guess the number");
        pguessNum=sc.nextInt();
        return pguessNum;

    }
}
class Player2{
    int pguessNum;
    int guessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Palyer 2 Kindly guess the number");
        pguessNum=sc.nextInt();
        return pguessNum;

    }
}
class Player3{
    int pguessNum;
    int guessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Palyer 3 Kindly guess the number");
        pguessNum=sc.nextInt();
        return pguessNum;

    }
}
//Umpire 
class Umpire{

    int numformGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void  collectNumfromGusser(){
        Guesser g=new Guesser();
        //
        numformGusser= g.guessNumber();
    }

   void collectNumfromPlayer(){
        Player1 p1=new Player1();
        Player2 p2=new Player2();
        Player3 p3=new Player3();
        numFromPlayer1= p1.guessNumber();
        numFromPlayer2= p2.guessNumber();
        numFromPlayer3= p3.guessNumber();

    }
// Compare 
    void compare(){

        if(numformGusser==numFromPlayer1){

            if(numformGusser==numFromPlayer2 && numformGusser ==numFromPlayer3){
                System.out.println("Sabne sahi ans diyaa!! all are winner");
            }
            else if(numformGusser==numFromPlayer2){
                System.out.println("player 1 aur player 2 jeet geya");
            }
            else if(numformGusser==numFromPlayer3){
                System.out.println("player 1 aur player 3 jeet geya");
            }
            else{

                System.out.println("Player 1 won the game");
            }


        }
        else if(numformGusser==numFromPlayer2){

            if(numformGusser==numFromPlayer3){
                System.out.println("player 2 aur player 3 jeet geya");

            }
            else{

                System.out.println("Player 2 won the game");
            }

            
        }
        else if(numformGusser==numFromPlayer3){
            System.out.println("Player 3 won the game");

        }
        else{
            System.out.println("sab k sab galat hai....");
        }

    }


}


public class gusser
{
    public static void main(String[] args) {
        System.out.println("Game startted..");
        Umpire u=new Umpire();
        u.collectNumfromGusser();
        u.collectNumfromPlayer();
        u.compare();

    }

}