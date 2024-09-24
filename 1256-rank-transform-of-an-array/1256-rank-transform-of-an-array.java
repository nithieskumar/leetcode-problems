class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[]a=arr.clone();
       Arrays.sort(a);
        Map<Integer,Integer> mp=new HashMap<>();
       int k=1;
       for(int i=0;i<n;i++)
       { 
        if(!mp.containsKey(a[i]))
        {
             mp.put(a[i],k++);
        }   

       }
       for(int i=0;i<n;i++)
       {
        arr[i]=mp.get(arr[i]);
       }
       return arr;
    }
}