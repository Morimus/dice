import java.util.Scanner;
import java.util.Random;

class dice
{
   public static void main(String args[]) 
   {
      boolean quit = false;

      while(!quit) 
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Guess the sum for two dicerolls: ");
         while(!input.hasNextInt())
         {
            System.out.println("Please make sure your guess is an integer.");
            input.next();
         }

         int sum = input.nextInt();

         Random roller = new Random();
         int d1 = roller.nextInt(6) + 1;
         int d2 = roller.nextInt(6) + 1;
         int dSum = d1+d2;

         System.out.println();
         System.out.println("----------");
         System.out.println("Roll 1: " + d1);
         System.out.println("Roll 2: " + d2);
         System.out.println("----------");
         System.out.println();
         System.out.println("You guessed: " + sum);
         System.out.println("Sum: " + dSum);
         System.out.println();

         if (sum == dSum)
         {
            System.out.println("You win!");
         }
         else
         {
            System.out.println("Sorry, better luck next time!");
         }

         System.out.println("----------");
         System.out.println();

         System.out.print("Do you to continue? (y/n): ");
         Scanner answer = new Scanner(System.in);

         boolean ask = true;
         while (ask)
         {
            String ans = answer.nextLine();
            switch (ans)
            {
               case "y":   System.out.println();
                           ask = false;
                           break;
    
               case "n":   quit = true;
                           ask = false;
                           break;

               default :   System.out.println("Invalid choice");
                           System.out.print("Do you want to continue? (y/n): ");
                           break;
            }
         }
      }
   }
}