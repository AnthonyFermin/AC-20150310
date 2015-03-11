package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 * The program asks the user for a starting number, ending number and the amount to increment by and lists all the numbers
 * Created by c4q-anthonyf on 3/10/15.
 */

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args){
        int start;
        int end;
        int increment;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the starting number: ");
        start = input.nextInt();

        System.out.print("Enter the end number: ");
        end = input.nextInt();

        System.out.print("Enter the amount to increment by: ");
        increment = input.nextInt();

        //loop prints from user inputted start, to user inputted end and increments by the amount the user inputted
        for(int i = start; i <= end; i+=increment){
            System.out.print(i);
            //if statement prints a comma after all numbers except for the last
            if( !(i+increment > end) ){
                System.out.print(", ");
            }
        }

    }
}
