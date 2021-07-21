import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
		Arrays.sort(array);
		
		int low = 0;
		int high = array.length - 1;
		
		while(low < high)
		{
			int currentSum = array[low] + array[high];
			if(currentSum == targetSum)
				return new int[] {array[low], array[high]};
			else if(currentSum > targetSum)
				high--;
			else
				low++;
		}

    return new int[] {};
  }
}