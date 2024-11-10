import java.util.Scanner;

class DoCondition {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = "";

      // Using do-while loop to ensure the user is prompted at least once
      do {
         System.out.println("Enter your name:");
         name = sc.nextLine();
      } while (name.isBlank()); // Keep asking until the user enters a non-blank name

      System.out.println("Hello " + name);

      sc.close(); // Close the Scanner to avoid resource leaks
   }
}
