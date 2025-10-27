import java.util.*;

class SGA{
	//display 
	public void display(double mark[],String name[]) {
		
		for(int i=0;i<mark.length;i++) {
			System.out.println("Name :"+name[i]+", Marks :"+mark[i]);
		}
	}
  //avarage
	public void avarage(double mark[],String name[]) {
		double sum = 0;
		for(int i=0;i<mark.length;i++) {
			sum = sum + mark[i];
		}
		sum /= mark.length;
		System.out.println("The avarage in marks :"+sum);
		height(mark,name);
		low(mark,name);
	}
	//heightest
	public void height(double mark[],String name[]) {
		
		double max = 0;
		String hname = "";
		for(int i=0;i<mark.length;i++) {
			if(max < mark[i]) {
				max  = mark[i];
				hname = name[i];
			}
			
		}
		System.out.println("The heightest mark :"+hname +" : "+max);
	}
  //lowest
	public void low(double mark[],String name[]) {
		
		double min = Integer.MAX_VALUE;
		String mname = "";
		for(int i=0;i<mark.length;i++) {
			if(min > mark[i]) {
				min = mark[i];
				mname = name[i];
			}
		}
		System.out.println("The lowest mark :"+mname +" : "+min);
	}
  //searching
	public void searching(double mark[],String name[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Instruct Enter the name correctly depend on case sensitive");
		String n  = scan.nextLine();
		boolean bool = false;
		for(int i=0;i<mark.length;i++) {
			if(n.equals(name[i])) {
				System.out.println("Name : "+name[i]+" - Mark : "+mark[i]);
				bool = true;
				break;
			}
		}
		if(!bool) {
			System.out.println("Enter the valid name");
			display(mark,name);
			searching(mark,name);
			}
	}
  //sorting
	public void sorting(double mark[],String name[]) {
		double arr[] = mark.clone();
		Arrays.sort(arr);
		for(int i=mark.length -1;i>=0;i--) {
			for(int j = 0;j<mark.length;j++) {
				if(arr[i] == mark[j]) {
					System.out.println("Name :"+name[i]+" Mark :"+mark[i]);
				}
			}
		}
	}
}

//starting main 
public class sga_1 {
	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of array :");
		int max = scan.nextInt();
		scan.nextLine();
		
		String[] name = new String[max];
		double[] mark = new double[max];
		
		
		for(int i=0;i<max;i++) {
			System.out.print("Enter the Name :");
			name[i] = scan.nextLine();
			boolean run = true;
			while(run) {
				System.out.print("Enter the mark :");
				mark[i] = scan.nextInt();
				if(mark[i] <= 100 && mark[i] >= 0)run = false;
				else System.out.println("$-Warning ! Enter the mark 0 to 100");
				
			}
			scan.nextLine();	
			
		}
		boolean run = true;
		SGA sga = new SGA();
		while(run) {
			System.out.println();
			System.out.println("1. display, 2. Avarage, 3. height, 4. lowest, 5. searching, 6. sorting. 7 exit");
			int n = scan.nextInt();
			
			switch(n) {
			case 1:
				sga.display(mark,name);
				break;
			case 2:
				sga.avarage(mark,name);
				break;
			case 3:
				sga.height(mark,name);
				break;
			case 4:
				sga.low(mark,name);
				break;
			case 5:
				sga.searching(mark, name);
				break;
			case 6:
				sga.sorting(mark,name);
				break;
			case 7:
				run = false;
				break;
			default: System.out.println("Enter the valid key");
			
		}
	}
		System.out.println("Loop terminated");
	}
}
