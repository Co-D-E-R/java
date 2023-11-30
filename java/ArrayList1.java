
import java.util.*;
public class ArrayList1 {

        public static void main(String[] args) {
                    ArrayList<Integer> list = new ArrayList<>();
                    
                    try (Scanner sc = new Scanner(System.in)) {
                        Scanner sc1 = new Scanner(sc.nextLine());
                        while (sc1.hasNextInt()) {
                            int num = sc1.nextInt();
                            list.add(num);
                        }
                    }
                    
                    // print the list
                    System.out.println(list);
                    System.out.println(list.get(1));

                    // sort the list
                    Collections.sort(list);
                    System.out.println("After Sorted :- "+list);
        }
}
           
    
