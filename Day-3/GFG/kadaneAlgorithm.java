static int maxSum(int arr[], int n)
{
    int res = arr[0];

    int maxEnding = arr[0];

    for(int i = 1; i < n; i++)
    {
        maxEnding = Math.max(maxEnding + arr[i], arr[i]);

        res = Math.max(maxEnding, res);
    }
    
    return res;
}
