import java.io.*;
import java.util.*;

public class file1{
    public static void main(String[] args){
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader("re.txt");
            int data = fr.read();
            while(data != -1){
                s += (char)data;
                data = fr.read();
            }
            System.out.println(s);
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        Scanner sc = new Scanner(s);
        while(sc.hasNextInt()){
           int num =sc.nextInt();
           list.add(num);
        }
       
        int sum=0;
        for(int pr:list){
            sum+=pr;
        }
        System.out.println(list);
        System.out.println(list.get(1));
        Collections.sort(list);
        System.out.println("After Sorted :- "+list);

        System.out.println("Sum of all elements is "+sum);
        try{
            FileWriter fw = new FileWriter("re.txt");
            // fw.write("Sum of all elements is");
            fw.append("\nNew Line");
            fw.append("\n"+sum);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
    }
}