import java.util.Scanner;

public class SortInsArrayDemoA2 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		int op, el, pos, x[]={0},size=1;
		SortInsArrayA2 obj = new SortInsArrayA2(x,size);
		
		do {
			
			System.out.println("******* ARRAY OPERATIONS *******");
			System.out.println("1. Create a new Array");
			System.out.println("2. Display Array");
			System.out.println("3. Reverse Array");
			System.out.println("4. Sort Array - Ascending Order");
			System.out.println("5. Sort Array - Descending Order");
			System.out.println("6. Insert Element");
			System.out.println("7. Exit");
			System.out.print("Enter Your Option(1-7): ");
			op=s.nextInt();
			
			switch(op) {
			
			case 1:
				obj.createArr(s);
				System.out.print("Array: ");
				obj.displayArray();
				break;
				
			case 2:
				System.out.print("Array: ");
				obj.displayArray();
				break;
			
			case 3:
				obj.reverseArr();
				System.out.println("The Array has been reversed.");
				System.out.print("Array: ");
				obj.displayArray();
				break;
				
			case 4:
				obj.sortAsc();
				System.out.println("The Array has been sorted in an Ascending Order.");
				System.out.print("Array: ");
				obj.displayArray();
				break;
				
			case 5:
				obj.sortDesc();
				System.out.println("The Array has been sorted in a Descending Order.");
				System.out.print("Array: ");
				obj.displayArray();
				break;
				
			case 6:
				do {
					System.out.print("Enter the Element to be inserted in the Array: ");
					el=s.nextInt();
					System.out.print("Enter the Index No. where the Element needs to be inserted(0-"+obj.getSize()+"): ");
					pos=s.nextInt();
					if(pos>=0 && pos<=obj.getSize())
						obj.insert(el,pos);
					else
						System.out.println("Incorrect Index Number. Please Try Again ...");
				} while(pos<0 || pos>obj.getSize());
				System.out.println("The Element "+el+" has been inserted in the array at position "+pos);
				System.out.print("Array: ");
				obj.displayArray();
				break;
				
			case 7:
				System.out.println("Thank you for using the Application. Good Bye ...");
				break;
				
			default:
				System.out.println("Invalid Option. Please Try Again ...");
				break;
			}
			
		} while(op!=7);
		
		s.close();
	}

}
