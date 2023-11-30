import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class file2 {
    public static void main(String[] args) {
        int sum=0;
        String s = "";
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader("re.txt"));
            String line = reader.readLine();
            while (line != null) {
                s+=line;
                line = reader.readLine();
            }
            reader.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(s);
        ArrayList<Integer> list = new ArrayList<>();
        for(String str:s.split(" ")){
            list.add(Integer.parseInt(str));
            sum+=Integer.parseInt(str);
        }
        System.out.println(list);
        System.out.println("Sum of the elements is ::"+sum);
        // try{
        //     FileWriter fw = new FileWriter("re.txt");
        //     // fw.write("Sum of all elements is");
        //     fw.append("\nNew Line");
        //     fw.append("\n"+sum);
        //     fw.close();
        // }catch(Exception e){
        //     System.out.println(e);
        // }
  }
}
    

