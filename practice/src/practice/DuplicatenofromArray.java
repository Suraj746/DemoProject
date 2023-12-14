package practice;

public class DuplicatenofromArray {
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,4,4,4,5,5,5};
		System.out.print(arr);
		int[] temp=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[k]=arr[i];
				k++;
			}
			
		}
		temp[k]=arr[arr.length-1];
		System.out.println("After removing duplicates :");
		for(int j=0;j<arr.length;j++) {
			System.out.print(temp[j]);
		}
	}

}
