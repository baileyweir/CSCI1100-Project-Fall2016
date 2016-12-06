import java.util.Random;//import random class

public class randomSayingCorrect{
      //created saying as strings to put in array
      String say1, say2, say3, say4, say5;
      say1 = "CONGRATULATIONS STEGOSAURUS, YOU'RE THE SPIKIEST ;)";
      say2 = "CONGRATUALTIONS TYRANNOSAURUS REX, YOU'RE THE KING OF THE DINO WORLD";
      say3 = "ARE YOU A PTERODACTYL? BECAUSE YOU'RE FLYING HIGH!";
      say4 = "YOU ARE ALMOST AS SHARP AS A DINO'S TEETH";
      say5 = "WOW! YOU'RE LEARNING ALMOST AS FAST AS A VELOCIRAPTOR CAN RUN!"; 
      String [] sayings = {say1, say2, say3, say4, say5};
      
      //generates a random number then prints the string at the index in the array of the random number
      Random r = new Random();
      int i = r.nextInt(4);
      System.out.print("\n" + sayings[i]);
   }
}   
