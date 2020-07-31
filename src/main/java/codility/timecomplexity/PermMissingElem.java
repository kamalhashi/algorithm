package codility.timecomplexity;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static int solution(int[] A) {
        final Set<Integer> set = new HashSet<>();

        int minimal = 1;

        for (int i : A) {
            set.add(i);
        }

        while (set.contains(minimal)) {
            minimal = minimal + 1;
        }
        return minimal;
    }

    //Brute force solution
    public static synchronized int solution2(int[] A) {
        int missNumber = 0;
        for (int i = 1; i <= A.length; i++) {
            boolean found = false;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == i ) {
                    found = true;
                }

            }
            if (!found) {
                missNumber = i;
                break;
            }
        }

        return missNumber;
    }

    public static int solution3 (int[] A){
        int missingNumber = 0;
        int sum =0;
        int sumInput=0;
        for (int i=0; i < A.length ; i++){
            sumInput += A[i];
        }
        for (int i=1; i <= A.length+1 ; i++){
            sum += i;
        }
        return sum - sumInput;
    }

    public static void main(String args[]) {
        int[] A = { 4, 3, 5, 1};
        System.out.println(solution3(A));
    }
}
