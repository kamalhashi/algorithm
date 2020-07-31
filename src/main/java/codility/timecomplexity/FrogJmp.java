package codility.timecomplexity;

public class FrogJmp {

    public static int solution(int X, int Y, int D){
        return (int) Math.ceil((X-Y) / (double) D);
    }

    public static void main (String args[]){

        System.out.println(solution(85,10,30));
    }
}
