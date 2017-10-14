import java.util.List;

public class SumOfNestedInteger2 {

	public int SumOfNestedInteger2(List<NestedInteger> input){
	
		if (input ==null)
			return 0; 
		else
			return getSumAndDepth(input, 0);
		
	}
	
	public int getSumAndDepth(List<NestedInteger> input, int sum)//, boolean depthReached)
	{
		boolean depthIncrementFlag = true; 
		for(NestedInteger nested: input)
		{
			if(depthIncrementFlag == true)
			{
				sum+=sum;
			}
			if(nested.isInteger())
			{
				sum += nested.getInteger(); 
			}
			else
			{	
				if(depthIncrementFlag == false) {
					sum += getSumAndDepth(nested.getList(), 0);
				}
				else 
					sum += getSumAndDepth(nested.getList(), sum);
			}
			if(depthIncrementFlag == true)
			{
				depthIncrementFlag = false; 
			}
		}
		return sum; 
	}
	
	
}
