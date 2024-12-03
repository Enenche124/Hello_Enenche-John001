import java.util.Scanner;


public class Greeter{

       public static void main(String[] args){

 

        Scanner usersInputs = new Scanner(System.in);

        

      System.out.println("""

        1. English
  
        2. Yoruba
  
        3. Hausa


  """);

   int choice  = usersInputs.nextInt();

switch(choice){

   case 1: System.out.println("Good evening ");

break;

case 2: System.out.println("e'karor oo");

break;

case 3:  System.out.println("Greet in hausa");

break;


default: System.out.println("Follow instruction please");



}




     }


}



