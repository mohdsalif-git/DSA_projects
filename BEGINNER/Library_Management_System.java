package BEGINNER;
import java.util.*;

class Book{
	 int id;
	 String title;
	 String author;
	 boolean isavail;
	 
	 Book(int id,String title,String author,boolean isavail){
		  this.id = id;
		  this.title = title;
		  this.author = author;
		  this.isavail = isavail;
	 }
	 
	 public String toString() {
		 
		 return "ID: "+id +", Title: "+title+", Author: "+author+", isavail: "+ (isavail?"Yes":"No");
	 }
}

public class Library_Management_System {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Book> library = new HashMap<>();
		
		library.put(101,new Book(101,"java programming","james Goslin",true));
		library.put(102,new Book(102,"python programming","Mohamed Salif",true));
		library.put(103, new Book(103,"C Programming","Dennise ritchie",false));
		
//		System.out.println(library.get(103));
	
		boolean run = true;
		while(run) {
			System.out.println("1. addbook 2. display_Book 3. search_Book ");
			System.out.println("Enter the options: ");
			int n = scan.nextInt();
			switch(n) {
			case 1:
				System.out.print("Enter the book ID :");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.print("Enter the Title :");
				String title = scan.nextLine();
				System.out.print("Enter the Author:");
				String author = scan.nextLine();
				System.out.print("Enter the Available:");
				boolean isavail = scan.nextBoolean();
				library.put(id, new Book(id,title,author,isavail));
				break;
			case 2:
				for(Book b:library.values()) {
					System.out.println(b);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Enter the searching ID");
				int Id = scan.nextInt();
				Book b = library.get(Id);
				if( b!= null)System.out.println("Title: "+b.title);
				else System.out.println("ID is not found");
				break;
			}
			
				
		}
	}

	

}
