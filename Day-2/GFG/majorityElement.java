static int majorityElement(int a[], int size)
    {
        int result = a[0];
        int count = 1;
        
        for(int i = 1; i < size; i++)
        {
            if(a[i] == result) count++;
            else count--;
            
            if(count == 0) 
            {
                result = a[i];
                count = 1;
            }
        }
        
        result = checkMajority(a, size, result);
        return result;
    }
    
    static int checkMajority(int a[], int size, int result)
    {
        int count = 0;
        for(int i = 0; i < size; i++)
        {
            if(a[i] == result) count++;
        }
        if(count <= size/2) result = -1;
        
        return result;
    }