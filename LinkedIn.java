
public class LinkedIn {
	/*
	void *memmove(void *dest, const void *src, size_t n)
	{

	//abcdef
	 // implementation here
	 //casting void pointer to char pointer
	     *char newDest = dest; 
	     *char newSrc = src; 
	     
	     for(size_t i=0; i<n; i++)
	     {
	         if(*(newDest+i) == '\0')
	         {
	             break; 
	         }
	         else
	         {
	             *(newDest +i) = *(newSrc +i);
	         }
	     }
	 
	}
*/

//	============================================
	/**
	 * Given a nested list of integers, returns the sum of all integers in the list weighted by their depth
	 * For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1)
	 * Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, and one 6 at depth 3)
	 */
	 /*
	 
	public int depthSum (List<NestedInteger> input)
	{
	    //Implementation here
	    int depth =1; 
	    
	    if(input == null) return 0; 
	    else return computeSum(input, depth);
	}
	    

	public int computeSum(List <NestedInteger> input, int depth)
	{
	    int sum = 0; 
	   //check if it is an integer
	   //if yes perform math
	   for(NestedInteger i:input)
	   {
	        if(i.isInteger())
	        {
	            sum += i.getInteger()*depth;
	        }
	        else //if%20not%2C%20go%20one%20level%20down%2C%20increment%20depth
	        {
	            sum += computeSum(i, depth++);
	        }
	    }
	    return sum; 
	}*/
	 
	/**
	 * This is the interface that represents nested lists.
	 * You should not implement it, or speculate about its implementation.
	 */
	//public interface NestedInteger
	//{
	    /** @return true if this NestedInteger holds a single integer, rather than a nested list */
	    //boolean isInteger();
	 
	    /** @return the single integer that this NestedInteger holds, if it holds a single integer
	     * Return null if this NestedInteger holds a nested list */
	    //Integer getInteger();
	 //
	    /** @return the nested list that this NestedInteger holds, if it holds a nested list
	     * Return null if this NestedInteger holds a single integer */
	    //List<NestedInteger> getList();
	//}
	  
}
