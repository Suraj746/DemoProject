package InterviewQ;

import java.util.Arrays;

public class Sorting {
    public static void main(String args[]) {
        int[] x = {1, 23, 6, 87, 45, 56};

        int len = x.length / 2;
        System.out.println("Length" + len);
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }

            }
            for (int k = len; k < x.length - 1; k++) {
                if (x[k] < x[k + 1]) {
                    int temp = x[k];
                    x[k] = x[k + 1];
                    x[k + 1] = temp;
                }

            }
        }
//            for (int k = len; k < x.length - 1; k++) {
//                for (int j = len; j < x.length - 1; j++) {
//                    if (x[j] < x[j + 1]) {
//                        int t = x[j];
//                        x[j] = x[j + 1];
//                        x[j + 1] = t;
//                    }
//                }
//            }
//            Arrays.sort(x);

            for (int n : x
            ) {
                System.out.print(n + " ");
            }

           System.out.println("Remove duplicate elements in string");
           String s="SSSIIJISNINISsnknksnkdfknsdkfndkfdfdffkk";
           s.toLowerCase().toCharArray();
        }
    }

