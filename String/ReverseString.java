public class ReverseString{
    public static void main(String args[]){
        String str = "Prerit";
        char ch;
        String nstr = " ";
        
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
         System.out.println("Reversed word: "+ nstr);
        
    }
}
