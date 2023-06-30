class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int n  =arr.length;
        int max = arr[0];
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
            for(int j = 0 ; j < n ; j++){
                if(arr[j] + extraCandies>= max){
                    ans.add(true);
                }else {
                    ans.add(false);
                }
            }
            
        
        return ans;
        
    }
}