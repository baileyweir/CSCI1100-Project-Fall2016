import java.util.Random;//import random class

public class randomSayingWrong{
      //created saying as strings to put in array
      String say1, say2, say3, say4, say5;
      say1 = "I can see you're not the sharpest tooth in the t-rex's mouth";
      say2 = "Your answers are almost as scary as the TERROR-dactyl.";
      say3 = "Your answers are a tyrannosaurus WRECK!";
      say4 = "If you keep this up you soon will be extinct..";
      say5 = "You starting to become quite the hot messosaurus."; 
      String [] sayings = {say1, say2, say3, say4, say5};
      
      //generates a random number then prints the string at the index in the array of the random number
      Random r = new Random();
      int i = r.nextInt(4);
      System.out.print("\n" + sayings[i]);
   }
}      
  
