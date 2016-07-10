package hash;

import java.util.HashSet;


public class hashyest {

	public hashyest(){}
	
    @SuppressWarnings("null")
	public int singleNumber(int[] nums) {
        HashSet<Integer> x = new HashSet<Integer>();
        
        for(int a = 0; a<nums.length; a++)
        {
            if(x.contains(nums[a]))
            {
                x.remove(nums[a]);
            }
            else{x.add(nums[a]);}
        }
        Object[] a = x.toArray();
        
        return (Integer) a[0];
        
    }
	
}
