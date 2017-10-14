import java.io.*;

public class HirevueTest1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
    
    int sq = square(s);
    System.out.println(sq);
  }
}
 public static int square(String s)
{
	  int sq = Integer.parseInt(s)*Integer.parseInt(s);
	  return sq;
}
  
}