import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();
		
		for(int idx = 0; idx < array.length - 2; idx++)
		{
			int left = idx + 1;
			int right = array.length - 1;
			while(left < right)
			{
				int currentSum = array[idx] + array[left] + array[right];
				if(currentSum == targetSum)
				{
					Integer[] newTriplet = {array[idx], array[left] ,array[right]};
					triplets.add(newTriplet);
					left++;
					right--;
				}
				else if(currentSum > targetSum)
				{
					right--;
				}
				else
				{
					left++;
				}
			}
		}
		
    return triplets;
  }
}

