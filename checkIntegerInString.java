public class checkIntegerInString
{
	public static void main(String[] args) {
		String str = "ABC65D19HY09";
		
		for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                continue;
            }
            else
            {
                System.out.print(i);
            }
		}	
	}
}
