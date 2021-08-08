import java.util.ArrayList;

public class Arraylist {
   public static void main(String[] args){
       ArrayList<Integer> list1 = new ArrayList<>();
       System.out.println("Enter a number");
       list1.add(16);
       list1.add(17);
       list1.add(18);
       list1.add(10);
       for(int a=0;a<list1.size();a++){
        System.out.println(list1.get(a)+" ");
       }
       System.out.println(list1);
       System.out.println(list1.size());
   } 
}
