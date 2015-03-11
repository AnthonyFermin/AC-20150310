package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 * The very famous Fizz Buzz program! Prints numbers from 1 to 100 and prints Fizz when divisible by 3
 * and prints Buzz when divisible by 5. It prints FizzBuzz when divisible by 3 and 5.
 * Created by c4q-anthonyf on 3/10/15.
 */
public class FizzBuzz {

    public static void main(String[] args){

        //loops from 1 to 100
        for(int i = 1; i <= 100; i++){

            //prints Fizz if i is divisible by 3
            if(i % 3 == 0)
                System.out.print("Fizz");
            //prints Buzz if i is divisible by 5
            if(i % 5 == 0)
                System.out.print("Buzz");
            //prints i number if not divisible by 3 or 5
            if(i % 3 != 0 && i %5 != 0)
                System.out.print(i);
            //goes to next line
            System.out.println();

        }

    }

}
