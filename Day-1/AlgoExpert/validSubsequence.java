import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    
		int aIndex = 0;
		int sIndex = 0;
		
		while(aIndex < array.size() && sIndex < sequence.size())
		{
			if(array.get(aIndex) == sequence.get(sIndex))
			{
				aIndex++; 
				sIndex++;
			}
			else
			{
				aIndex++;
			}
		}
		
		return sIndex == sequence.size();
  }
}