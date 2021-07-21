static void maximumAdjacent(int sizeOfArray, int arr[]){
        
    for(int i = 0; i < sizeOfArray - 1; i++)
    {
        int max = Math.max(arr[i],arr[i+1]);
        System.out.print(max + " ");
    }
    
}