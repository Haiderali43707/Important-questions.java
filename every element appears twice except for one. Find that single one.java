class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1); // if elemet not present put 1 ,if present increase the frequency by 1
            
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>i:map.entrySet())
        {
            if(i.getValue()==1)  //means frequency
            {
                ans=i.getKey(); // gave number which have one frequency
            }
        }
        return ans;
        
    }
}
