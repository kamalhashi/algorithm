package codesignal.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Find the first duplicate number for which the second occurrence has the minimal index.
 */
public class FirstDuplicate {

    //Brute Force Algorithm O(ON2), takes long to execute
    static int solutionOne(int a[]) {
        int minSecondIndex = a.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    minSecondIndex = Math.min(minSecondIndex, j);
            }
        }

        if (minSecondIndex == a.length) return -1;
        else
            return a[minSecondIndex];
    }

    // Faster but it uses Space time complexity
    public static int solutionTwo(int a[]) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (seen.contains(a[i]))
                return a[i];
            else
                seen.add(a[i]);
        }
        return -1;
    }


    public static void main(String args[]) {
        int a[] = {2, 1, 3, 5, 3, 2};
        System.out.println(solutionTwo(a));
    }
}
