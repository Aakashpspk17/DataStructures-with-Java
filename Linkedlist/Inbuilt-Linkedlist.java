import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
  public static void main(String[] args) {
    
    LinkedList<Integer> cars = new LinkedList<Integer>();
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of the Linked list:\n");
   int n = sc.nextInt();
    
   System.out.println("Enter the elements of the Linked list:\n");
    for(int i=0;i<n;i++) {
    	int item = sc.nextInt();
    	cars.add(item);
    }
    sc.close();
    
    System.out.println("Elements of the Linked list:\n");
    for(int i = 0; i < cars.size(); i++) {
        System.out.println( cars.get(i));
    
  }
}
}
