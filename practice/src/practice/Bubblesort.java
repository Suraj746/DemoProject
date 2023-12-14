package practice;

public class Bubblesort {
	public static void main(String[] args) {
		int[] a= {38,4,54,36,14,7,2,39};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}

}
