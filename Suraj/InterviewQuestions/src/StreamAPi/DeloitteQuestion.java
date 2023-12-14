package StreamAPi;

public class DeloitteQuestion {

    public static int maxDiff(int N, int[] A, int[] B) {
        if (N <= 0 || A == null || B == null || A.length != N || B.length != N) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxAbsoluteDiff = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int absoluteDiff = Math.abs(A[i] - B[i]);
            maxAbsoluteDiff = Math.max(maxAbsoluteDiff, absoluteDiff);
        }

        return maxAbsoluteDiff;
    }
    public static void main(String[] args) {
        int N = 3;
        int[] A = {4, 5, 1};
        int[] B = {8, 7, 6};

        int result = maxDiff(N, A, B);

        int result1= minDiff(N,A,B);
        System.out.println("Maximum Absolute Height Difference: " + result);
        System.out.println("Minimum Absolute Height Difference: " + result1);
    }

    public static int minDiff(int N, int[] A, int[] B) {
        if (N <= 0 || A == null || B == null || A.length != N || B.length != N) {
            throw new IllegalArgumentException("Invalid input");
        }

        int minAbsoluteDiff = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int absoluteDiff = Math.abs(A[i] - B[i]);
            minAbsoluteDiff = Math.min(minAbsoluteDiff, absoluteDiff);
        }

        return minAbsoluteDiff;
    }

}
