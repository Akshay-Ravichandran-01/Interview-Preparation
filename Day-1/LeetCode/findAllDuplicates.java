class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int idx : nums)
        {
            idx = Math.abs(idx) - 1;
            if(nums[idx] > 0) 
            {
                nums[idx] *= -1; 
            }
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                result.add(i + 1);
            }
        }
        
        return result;
        
    }
}