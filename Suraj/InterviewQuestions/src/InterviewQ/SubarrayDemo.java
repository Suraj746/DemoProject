package InterviewQ;

public class SubarrayDemo {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int startIndex=1;
        int endIndex=7;
        int subarraylength=endIndex-startIndex;
        int[] subarray= new int[subarraylength];

        System.arraycopy(originalArray, startIndex, subarray, 0, subarraylength);
        System.out.println("Subarray");
        System.out.println("Suraj Pradhan");
        for (int a:subarray
             ) {
            System.out.print(a + " ");
        }

    }
}

