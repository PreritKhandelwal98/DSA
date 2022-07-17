package String;

public class rotationOfString {

    public static boolean areRotations(String s1,String s2){
        return (s1.length() == s2.length()) &&  ((s1 + s1).indexOf(s2) != -1) ;
    }
    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "DBCA";

        if (areRotations(s1, s2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
