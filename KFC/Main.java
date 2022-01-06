package KFC;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);


        final FastFood fastFood = new FastFood("KFC");


        while (true) {
            System.out.println("Kolik chces koupit kurat");
            String input = sc.nextLine();
            System.out.println("---------------------");
            if(input.toUpperCase(Locale.ROOT).equals("END")) {
                break;
            }

            fastFood.sellChicken(Integer.parseInt(input));
        }



    }
}
