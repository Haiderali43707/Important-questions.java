class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
          HashSet<Integer> set = new HashSet<>();
        int[] result  = new int[2];
        //check duplicate
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                result[0]=arr[i];
            }   
            set.add(arr[i]);
        }
        //check smallest positive missing number
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
