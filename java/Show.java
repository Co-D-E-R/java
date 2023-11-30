
import java.util.*;

public class Show {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings, one per line (press Enter to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }
        System.out.println("Unsorted:-"+list);

        System.out.println(list.size());
        System.out.println(list.get(1));
        Collections.sort(list);

        System.out.println("Sorted:-"+list);

        scanner.close();
    }
}

    
           
    


