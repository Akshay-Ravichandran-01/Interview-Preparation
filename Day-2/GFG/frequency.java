public static void frequencyCount(int arr[], int N, int P)
    {
        Arrays.sort(arr);
        
        for(int i = 0; i < N; i++)
        {
            arr[i] -= 1;
        }
        
        int idx = N;
        for(int i = 0; i < N; i++)
        {
            if(arr[i] >= N){
                if(idx == N)
                {
                    idx = i;
                }
                arr[i] = 0;
            }
        }
        
        for(int i = 0; i < idx; i++)
        {
            int index = arr[i]%N;
            arr[index] = arr[index] + N;
        }
        
        for(int i = 0; i < N; i++)
        {
            arr[i] = arr[i]/N;
        }
    }
