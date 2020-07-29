package codesignal.com;


import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;

/**
 * Given a string s consisting of small English letters,
 * find and return the first instance of a non-repeating character in it.
 * If there is no such character, return '_'.
 * <p>
 * For s = "abacabad", the output should be
 */
public class FirstNotRepeatingCharacter {

    /**
     * Lets first try with Brute-Force algorithm the easiest
     * This solution will not be accepted because it takes long computation
     */
    public static char solutionOne(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean seen = false;
            char c = s.charAt(i);
            //Check I'th character plus one
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c && (i != j))
                    seen = true;
            }
            if (!seen)
                return c;
        }
        //None repeating characters return '_'
        return '_';
    }

    //Space complexity  using HashMap
    public static char solutionTwo(String s) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        // Count each Character occurrences and store into map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (occurrences.containsKey(c))
                occurrences.put(c, occurrences.get(c) + 1);
            else
                occurrences.put(c, 1);
        }

        System.out.println(occurrences);
        //return the fist non repeating by looping over the array
        for (int i=0 ; i < s.length() ; i++ ) {
            char c = s.charAt(i);
            if (occurrences.get(c) ==1)
                return c;
        }
        return '_';
    }

    public static void main(String args[]) {
        String s = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        System.out.println(solutionTwo(s));
    }
}
