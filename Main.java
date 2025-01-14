/* Ingredient Adjuster
   A cookie recipe calls for the following ingredients:
   - 1.5 cups of sugar
   - 1 cup of butter
   - 2.75 cups of flour

   The recipe produces 48 cookies with these amounts of the ingredients. Write the program that
   asks the user how many cookies they want to make, and then display the number of cups of each
   ingredient needed for the specified number of cookies.

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        final int ORIGINAL_COOKIES = 48;
        final double SUGAR = 1.5;
        final double BUTTER = 1.0;
        final double FLOUR = 2.75;

        Scanner input = new Scanner(System.in);
        System.out.println("How many cookies you'd like to make?");
        int cookies = input.nextInt();

        double adjustedSugar = SUGAR * cookies/ORIGINAL_COOKIES;
        double adjustedButter = BUTTER * cookies/ORIGINAL_COOKIES;
        double adjustedFlour = FLOUR * cookies/ORIGINAL_COOKIES;

        System.out.println("For " + cookies + " cookies, you will need: ");
        System.out.printf("%.2f cups of sugar%n", adjustedSugar);
        System.out.printf("%.2f cups of butter%n", adjustedButter);
        System.out.printf("%.2f cups of flour%n", adjustedFlour);

        input.close();







    }
}