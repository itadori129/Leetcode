class Solution {
    public int numIdenticalPairs(int[] arr) {
        int count = 0;
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1 ; j <arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
        }
        return count;
        
    }
}