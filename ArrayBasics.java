import java.util.*;
public class ArrayBasics {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How large an array? ");
        int x = scanner.nextInt();
        
        int [] y = new int [x];
        int z = 1;
        for (int i = 0; i <= y.length; i++) {
          y[i] = z++;
          System.out.println(i + ": " + y[i]);
        }
    }
}
