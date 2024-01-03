import java.util.*;

// import java.lang.*;
public class CamelCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int terms = 1;
        for (int i = 0; i < s.length(); i++) {
            String temp = Character.toString(s.charAt(i));
            if (temp == temp.toUpperCase()) {
                terms++;
            }
        }

        System.out.print("Number of words in the string " + s + " is: " + terms);
    }
}
