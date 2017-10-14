import java.io.IOException;

public class test3 {

	public static void main(String args[]) throws IOException {
		   
		 String s = "12467930";
		 insertOperator(s);
		}
	
	public static void insertOperator(String s)
    {
		StringBuilder new_str = new StringBuilder(); 
		char[] str_ch = s.toCharArray(); 
		
		new_str.append(str_ch[0]);
		for(int i = 1; i < str_ch.length; i++)
		{
			int current = Character.getNumericValue(str_ch[i]);
			int prev = Character.getNumericValue(str_ch[i-1]);
			//System.out.println(current +" "+prev); 
			//even and even
			if(current != 0)
			{
				if(current%2 == 0 && prev%2 == 0)
				{
					new_str.append('*');
					new_str.append(str_ch[i]);
				}
				//odd and odd
				else if(current%2 == 1 && prev%2 == 1)
				{
					new_str.append('-');
					new_str.append(str_ch[i]);
				}
				//odd and even
				else if(current%2 == 1 && prev%2 == 0)
				{
					new_str.append(str_ch[i]);
				}
				else if(current%2 == 0 && prev%2 == 1)
				{
					new_str.append(str_ch[i]);
				}
			}
			else 
			{
				new_str.append(str_ch[i]);
			}
		}
		System.out.println(new_str); 
    }
}
