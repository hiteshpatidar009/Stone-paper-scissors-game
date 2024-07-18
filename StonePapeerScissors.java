import java.util.*;
public class StonePapeerScissors {
    public static void game(int input ,int rand_int1){

        if(input == rand_int1){
            System.out.print("Game draw ");

        }
        else if ( input == 0&&rand_int1 ==1){
            System.out.print("win paper,winner is computer");
        }
        else if ( input == 1&&rand_int1 ==2){
            System.out.print("win scissors,winner is computer");
        }
        else if ( input == 2&&rand_int1 ==0){
            System.out.print("win stone,winner is computer");
        }
        else if ( input == 0&&rand_int1 ==2){
            System.out.print("win stone,winner is you");
        }
        else if ( input == 1&&rand_int1 ==0){
            System.out.print("win paper,winner is you ");
        }
        else if ( input ==2&&rand_int1 ==1){
            System.out.print("win scissors, winner is you");
        }
        else {System.out.print("input is encorrect");}
        
    }
    public static void main (String args[]){
        System.out.println("\n\n"+"Enter your given number in the following "+"\n");
        System.out.println("stone = enter 0 , paper = enter 1 , scissors = enter 2 " );
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
       //System.out.println(input);
        Random rand = new Random();
        int rand_int1 = rand.nextInt(3);
       System.out.println(rand_int1);
       game(input,rand_int1);
    }
    
}