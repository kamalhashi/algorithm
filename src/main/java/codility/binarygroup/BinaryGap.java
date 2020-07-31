package codility.binarygroup;

public class BinaryGap {
    public static int solution(int N) {
        final String binary = Integer.toBinaryString(N);
        int current = 0;
        int best = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                //we have found, now let's start counting it
                if (current > best) {
                    best = current;
                }
                current = 0;
            } else {
                current = current + 1;
            }
        }
        return best;
    }

    public static  void main (String args[]){
        System.out.println(solution(1041));
    }
}
