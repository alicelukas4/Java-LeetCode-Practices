import java.io.*;
public class test2 {
	

	
	public static void main(String args[]) throws IOException {
	   String a1 = "cornfield";//"manhours";
	   String a2 = "corn1field";//"manhole";
	   String a3 = "hello, hella";
			   
	   String a  = lcs(a1, a2); 
	   System.out.println(a);
	   
	   String[] namesList = a3.split(",");
	   System.out.println(namesList[0]);
	   System.out.println(namesList[1]);
	}
	
	/** function lcs **/
    public static String lcs(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1;
        
        System.out.println("str1 len "+l1 +"   str2 len "+ l2);
        
        for (int x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                        //System.out.println("-- arr[x][y]"+ arr[x][y]);
                        if (arr[x][y] > len)
                        {
                            len = arr[x][y];
                            pos = x;
                        }               
                }
                else
                {
                    arr[x][y] = 0;
                }
                System.out.println("arr["+x+"]["+y+"]"+ arr[x][y] +" --- "+str1.charAt(x - 1) +" --- "+ str2.charAt(y - 1));
            }
        }        
        System.out.println("pos "+pos +"len "+ len);
        //String substring(int startIndex, int endIndex):
        String answer = str1.substring(pos - len, pos);
        if (str1.endsWith(answer))
        {
        	return answer; 
        }
        else {
        	return "NULL"; 
        }
        
    }

}
