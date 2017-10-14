import java.util.ArrayList;
import java.util.List;

public class SumOfNestedInteger{
	
	public SumOfNestedInteger(List<NestedInteger> input)
	{
		SumOfNestedInteger(input);
	}
	 
	public int SumOfNestedInteger(List<NestedInteger> input) {
		 if(input == null) return 0; 
		 else return getSum(input, 1);
	 }
	private int getSum(List <NestedInteger> input, int depth) {
		 int sum = 0; 
		 
		 for(NestedInteger nested: input)
		 {
			 if(nested.isInteger())
				 sum += nested.getInteger()*depth; 
			 else
				 sum += getSum(nested.getList(), depth++);
		 }
		 
		 return sum; 
	 }
		
	
	public static void main(String[] args) {
		List<NestedInteger> input1 = new ArrayList<NestedInteger>();
		SumOfNestedInteger sum = new SumOfNestedInteger(input1); 
		
	}
}
