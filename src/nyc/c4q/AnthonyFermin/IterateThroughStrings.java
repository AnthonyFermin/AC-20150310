package nyc.c4q.AnthonyFermin;

/**Anthony Fermin
 * This program searches through a grace Hopper Quote and counts how many times the word "data" appears in the quote
 * Created by c4q-anthonyf on 3/10/15.
 */
public class IterateThroughStrings {

    public static void main(String[] args){
        String graceHopperQuote = "We must include in any language with which we hope to describe complex data-processing situations the capability for describing data. We must also include a mechanism for determining the priorities to be applied to the data. These priorities are not fixed and are indicated in many cases by the data. Thus we must have a language and a structure that will take care of the data descriptions and priorities, as well as the operations we wish to perform. If we think seriously about these problems, we find that we cannot work with procedures alone, since they are sequential. We need to define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has been studying the structure of languages that can be used to describe data-processing problems. The Group started out by trying to design a language for stating procedures, but soon discovered that what was really required was a description of the data and a statement of the relationships between the data sets. The Group has since begun writing an algebra of processes, the background for a theory of data processing. Clearly, we must break away from the sequential and not limit the computers. We must state definitions and provide for priorities and descriptions of data. We must state relationships, not procedures.";
        String wordToFind = "data";
        char word0 = wordToFind.charAt(0);
        char word1 = wordToFind.charAt(1);
        char word2 = wordToFind.charAt(2);
        char word3 = wordToFind.charAt(3);


        int wordCount = 0;

        //loop that iterates through each character in graceHopperQuote
        for (int i = 0; i < (graceHopperQuote.length() - wordToFind.length()); i++){
            if(graceHopperQuote.charAt(i) == word0 && graceHopperQuote.charAt(i+1) == word1 && graceHopperQuote.charAt(i+2) == word2 && graceHopperQuote.charAt(i+3) == word3){
                wordCount++;
            }
        }

        System.out.println("The amount of times the word \"" + wordToFind + "\" appears is: " + wordCount);

    }

}
