import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < array[i-1])
			{
				isIncreasing = false;
			}
			if(array[i] > array[i-1])
			{
				isDecreasing = false;
			}
		}
		
		return isIncreasing || isDecreasing;
		
  }
}