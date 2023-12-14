package InterviewQ;

public class AlternateNoPrint {
    public static void main(String[] args) {

        int[] ar={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Alternate numbers");
        for(int i=0;i<ar.length;i=i+2){
            System.out.print(ar[i]+ " ");
        }

        int num1=3;
        int num2=7;
        System.out.println("Before "+"num1::"+num1 + " num2::" + num2);
        num1= num1 +  num2;
        num2= num1 - num2;
        num1= num1 - num2;
        System.out.println("After "+"num1::"+num1 + " num2::" + num2);
    }


}
