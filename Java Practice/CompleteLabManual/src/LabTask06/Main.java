package LabTask06;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int in, flag=0;
        colors.add("blue");
        colors.add("red");
        colors.add("pink");
        colors.add("green");
        colors.add("yellow");
        while(flag != 1){
        System.out.println("Operations");
        System.out.println("1. Add Color");
        System.out.println("2. Remove Color");
        System.out.println("3. Update Color");
        System.out.println("4. Sort Colors");
        System.out.println("5. Exit\n");
            System.out.println("Enter your No. of Operation you want to perform: ");
        in = scan.nextInt();
        switch(in){
            case 1:
                System.out.println("Add color: ");
                colors.add(scan.next());
                for(String c:colors)
                    System.out.println(c);
                break;
            case 2:
                System.out.println("Remove colors");
                for(String c:colors)
                    System.out.println(c);
                System.out.println("Which one you want to remove");
                colors.remove(scan.next());
                 for(String c:colors)
                    System.out.println(c);
                 break;
            case 3:
                System.out.println("Update Colors");
                System.out.println("Which color you want to update");
                 for(String c:colors)
                    System.out.println(c);
                 colors.set(scan.nextInt(), scan.next());
                  for(String c:colors)
                    System.out.println(c);
                 break;
            case 4:
                System.out.println("Before Sorting");
                for(String c:colors)
                    System.out.println(c);
               Collections.sort(colors);
               System.out.println("After Sorting");
                for(String c:colors)
                    System.out.println(c);
                break;
            case 5:
                flag =1;
                break;
            default:
                System.out.println("Invalid Operation");
                break;}}}
    
}
