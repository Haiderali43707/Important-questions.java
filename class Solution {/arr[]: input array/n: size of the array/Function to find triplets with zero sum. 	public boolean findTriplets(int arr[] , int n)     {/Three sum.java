class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        boolean flag=false;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                if(arr[i]+arr[l]+arr[r]==0)
                {
                     flag=true;
                     return flag;
                }
                if(arr[i]+arr[l]+arr[r]<0)
                {
                    l++;
                    
                }
                else
                {
                    r--;
                }
            }
        }
        return flag;
    }
}
