public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        ArrayList<Integer> result = new ArrayList<Integer>(2);
        int largest = getLargest(arr);
        int secondLargest = -1;
        for(int i = 0; i < sizeOfArray; i++)
        {
            if(arr[i] != largest)
            {
                if(secondLargest == -1)
                    secondLargest = arr[i];
                else if(arr[i] > secondLargest)
                    secondLargest = arr[i];
            }
        }
        result.add(largest);
        result.add(secondLargest);
        return result;
    }
    
    public static int getLargest(int arr[])
    {
        int n = arr.length;
        int largest = arr[0];
        
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }