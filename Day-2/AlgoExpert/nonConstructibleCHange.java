import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
    int changeCreated = 0;
		
		for(int coin : coins)
		{
			if(coin > changeCreated + 1)
			{
				return changeCreated + 1;
			}
			changeCreated += coin;
		}
    return changeCreated + 1;
  }
}