import java.util.Arrays;
import java.util.Scanner;

public class SortInsArrayA2 {
	
	private int a[];
	private int size;
	
	public SortInsArrayA2(int x[], int size) {
		a=x;
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void createArr(Scanner s) {
	
		//Scanner scan = new Scanner(System.in);
		int x[], len;
		
		do {
			System.out.print("Enter the size of the Array(>0): ");
			len=s.nextInt();
	
			if(len<=0)
				System.out.println("Size of an Array can't be less than 1. Please Retry.");
			else {
	
				x=new int[len];
				for (int i=0; i<len; i++) {
	
					System.out.print("\tEnter Value a["+i+"]: ");
					x[i]=s.nextInt();
				}
				a=x;
				size=len;
				System.out.println("\nYour Array has been created.");
			}
		} while(len<=0);
		//scan.close();
	}
	
	public void displayArray() {
		for(int i: a) 
			System.out.print(i+"    ");
		System.out.println("\n");
	}
	
	public void reverseArr() {
		for (int i=0; i<a.length/2; i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
	}
		
	public void sortAsc() {
		Arrays.sort(a);
	}
	
	public void sortDesc() {
		Arrays.sort(a);
		reverseArr();
	}
	
	public void insert(int el, int pos) {
		int b[]=new int[size+1];
		
		for(int i=0;i<pos;i++)
			b[i]=a[i];
		b[pos]=el;
		for(int i=pos+1;i<size+1;i++)
			b[i]=a[i-1];
		a=b;
		size++;
	}

}