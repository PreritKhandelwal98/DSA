public class AlterStringSame
{
	public static void main(String[] args) {
		String str = "PRERIT";
		char demo =str.charAt(0);
		int flag = 0 ;
		for(int i=0;i<str.length();i=i+2){
            if(demo == str.charAt(i))
            {
                flag =1;
            }
            else
            {
                flag=0;
            }
		}
		if(flag==1){
		    System.out.print(1);
		}else{
		    System.out.print(0);
		}
		
	}
}
