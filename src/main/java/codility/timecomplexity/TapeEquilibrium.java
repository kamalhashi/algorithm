package codility.timecomplexity;

public class TapeEquilibrium {

    public static int solution(int[] A){
        int sumLeft = A[0];
        int sumRight= 0;

        for (int i =1 ; i < A.length  ; i ++){
            sumRight += A[i];
        }
        int minimal = Math.abs(sumLeft - sumRight);

        for (int i = 1; i <A.length -1 ; i++) {
            System.out.println("sumRight:" + sumRight);
            sumLeft +=A[i];
            sumRight -=A[i];
            final int current = Math.abs(sumLeft - sumRight);
            if(current < minimal)
                minimal= current;
        }
        return minimal;
    }

    public static void main(String[] args){
        int[] A= {3, 1, 2, 4, 3};
        System.out.println("\n minimal:" + solution( new int[]{3, 1, 2, 4, 3}));
    }
}
