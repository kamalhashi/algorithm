package codility.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int rotate = (i + K) % A.length;
            result[rotate] = A[i];
        }
        return result;
    }

    public static int[] solutionTwo(int[] A, int K) {
        if (A.length == 0)
            return A;
        LinkedList<Integer> linkedList = Arrays
                .stream(A)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        while (K > 0) {
            linkedList.addFirst(linkedList.getLast());
            linkedList.removeLast();
            K--;
        }
        return linkedList
                .stream()
                .mapToInt(value -> value).toArray();
    }

    public static void main(String args[]) {
        int[] A = {3, 8, 9, 7, 6};
        System.out.println(Arrays.toString(solutionTwo(A, 3)));
    }
}
