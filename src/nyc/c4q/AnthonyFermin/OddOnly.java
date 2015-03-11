package nyc.c4q.AnthonyFermin;

/**Anthony Fermin
 * The program prints odd numbers from 1 to 20
 * Created by c4q-anthonyf on 3/10/15.
 */
public class OddOnly {

    public static void main(String[] args){

        /* The following loop does the same thing as this loop:
        for (int i = 0; i <= 20; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
         */

        //Prints odd numbers from 1 to 20
        for (int i = 0; i <= 20; i++){
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }

}
