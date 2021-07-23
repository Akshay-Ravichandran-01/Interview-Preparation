import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    
		int[] left = new int[array.length];
		int[] right = new int[array.length];
		int[] result = new int[array.length];
		
		int leftProduct = 1;
		for(int i = 0; i < array.length; i++)
		{
			left[i] = leftProduct;
			leftProduct *= array[i];
		}
		
		int rightProduct = 1;
		for(int i = array.length - 1; i >= 0; i--)
		{
			right[i] = rightProduct;
			rightProduct *= array[i];
		}
		
		for(int i = 0; i < array.length; i++)
		{
			result[i] = left[i] * right[i];
		}
		
		return result;
  }
}

