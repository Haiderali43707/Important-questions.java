class Solution {
   public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(); 
        for (Map.Entry<Integer, Integer> i: mp.entrySet()) {
            if (i.getValue() >= 2) {
                ans.add(i.getKey()); 
            }
        }
        if (ans.isEmpty()) {
            ans.add(-1); 
        }
        return ans; 
    }
}
