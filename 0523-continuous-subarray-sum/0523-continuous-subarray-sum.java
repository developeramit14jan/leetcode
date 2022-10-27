class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int sum = 0;
         map.put(0,0);
        for(int i = 0 ; i< nums.length ; i++){
          sum +=nums[i];
            if(map.containsKey(sum % k)){
                if(map.get(sum %k) < i){
                    return true;
                }
               
            }else{
                map.put(sum %k , i+1);
            }
            
        }
        return false;
        
    }
}