public static ArrayList<Integer>
    Unionarray(int arr1[], int arr2[],
               int n, int m)
    {
        TreeSet<Integer> set = new TreeSet<>();
         
        // Remove the duplicates from arr1[]
        for (int i : arr1)
            set.add(i);
       
        // Remove duplicates from arr2[]
        for (int i : arr2)
            set.add(i);
       
        // Loading set to array list
        ArrayList<Integer> list
            = new ArrayList<>();
        for (int i : set)
            list.add(i);
 
        return list;
    }
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Intersection of tywo arrays
 static void print_intersection(int arr1[], int arr2[],
                                   int m, int n)
    {
        // set for handling duplicate elements in
        // intersection list
        Set<Integer> s = new TreeSet<Integer>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
 
                s.add(arr2[j++]); // insertion in set s
                i++;
            }
        }
        for (int element :
             s) // printing intersection set list
        {
 
            System.out.print(element + " ");
        }
        System.out.println("");
    }
 
