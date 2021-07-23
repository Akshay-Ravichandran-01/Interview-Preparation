static void reverseArr(int arr[],int low,int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low ++;
            high --;
        }
            
        
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        reverseArr(arr,0,d-1);
        reverseArr(arr,d,n-1);
        reverseArr(arr,0,n-1);
    }