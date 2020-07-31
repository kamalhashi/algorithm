package codility.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        final Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (!set.add(i))
                set.remove(i);
        }
        System.out.println(set);

        return set.iterator().next();
    }

    public static void main(String args[]) {
        int[] A = {9, 3, 9, 3, 9, 7};
        System.out.println(solution(A));
    }
}
