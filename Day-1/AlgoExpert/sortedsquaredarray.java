import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    
		int[] result = new int[array.length];
		
		int low = 0;
		int high = array.length - 1;
		int index = array.length - 1;
		
		while(low <= high)
		{
			if(Math.abs(array[low]) > Math.abs(array[high]))
			{
				result[index] = array[low] * array[low];
				low++;
				index--;
			}
			else
			{
				result[index] = array[high] * array[high];
				high--;
				index--;
			}
		}
		
    return result;
  }
}

