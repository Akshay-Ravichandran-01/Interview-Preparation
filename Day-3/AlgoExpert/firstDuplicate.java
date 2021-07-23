import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    
		for(int i = 0; i < array.length; i++)
		{
			int index = Math.abs(array[i]);
			if(array[index - 1] > 0) array[index - 1] *= -1;
			else return index;
		}
    return -1;
  }
}

/*
import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    HashSet<Integer> nums = new HashSet<>();
		
		for(int i : array)
		{
			if(nums.contains(i)) return i;
			else nums.add(i);
		}
    return -1;
  }
}
*/

