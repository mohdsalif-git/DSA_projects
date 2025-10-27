// LINKED LIST
import java.util.*;

class Node{
	int id;
	String name;
	int age;
	String course;
	Node next;
	Node(int id,String name,int age,String course){
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.next = null;
	}
}

class SRMS{
	
	Node head;
	Node tail;
	Scanner scan = new Scanner(System.in);
	void addstudent() {
		System.out.println("Enter the Information");
		System.out.print("Enter the id :");
		int id = scan.nextInt();
		scan.nextLine();
		// System.out.println();
		System.out.print("Enter the name :");
		String name = scan.nextLine();
		// System.out.println();
		System.out.print("Enter the age :");
		int age = scan.nextInt();
		scan.nextLine();
		// System.out.println();
		System.out.print("Enter the course :");
		String course = scan.nextLine();
		// System.out.println();
		Node node = new Node(id,name,age,course);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		tail = node;

	}
	void updatestudent(){
		System.out.print("Enter the id :");
		int id = scan.nextInt();
		scan.nextLine();
		Node temp = head;
		while(temp.next != null) {
			if(temp.id == id) {
				System.out.print("Enter the name :");
				temp.name = scan.nextLine();
				System.out.print("Enter the age :");
				temp.age = scan.nextInt();
				scan.nextInt();
				System.out.print("Enter the course name :");
				temp.course = scan.nextLine();
				return;
			}
		}
		System.out.println("Id :"+id+" not fount!");

	}
	void remove() {
		
		System.out.println("Enter the id :");
		int id = scan.nextInt();
		Node temp = head;
		
		while(temp.next != null) {
			if(temp.id == id) {
				temp = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		System.out.println("No id define");
		
	}
	void display(){

		if(head == null){
			System.out.println("No record fount");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.println("ID :"+temp.id+" Name :"+temp.name+" Age :"+temp.age+" Course :"+temp.course);
			temp = temp.next;
		}
	}
}
public class Student_Record_Management_System {
	
	public static void main(String...args){

		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		SRMS srms = new SRMS();
		while(run) {
			System.out.println();
			System.out.println("1. display, 2. addstudent, 3. updatestudent, 4. remove, 5. exit");
			int n = scan.nextInt();
			
			switch(n) {
			case 1:
				srms.display();
				break;
			case 2:
				srms.addstudent();
				break;
			case 3:
				srms.updatestudent();
				break;
			case 4:
				srms.remove();
				break;
			case 5:
				run = false;
				break;
			default: System.out.println("Enter the valid key");
			
		}
	}
	}

}

