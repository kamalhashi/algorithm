package search;

public class BinarySearch {

    public static int solution(int arr[], int element) {

        //
        int lowIndex = 0;
        int highIndex = arr.length;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == arr[midIndex]) {
                return element;
            } else if (element < arr[midIndex]) {
                highIndex = midIndex - 1;
            } else if (element > arr[midIndex]) {
                lowIndex = midIndex + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {


        int a[] = {20, 23, 27, 38, 42};
        System.out.println(solution(a, 27));
    }
}
