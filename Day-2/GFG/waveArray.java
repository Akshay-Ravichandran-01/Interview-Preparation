public static void convertToWave(int arr[], int n){
        
    for(int i = 0; i < n; i += 2)
    {
        if(i == n-1) return;
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    
}