// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Problem1 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
       int currentSum = 0;
       int count = 0;
       map.put(0,1);

       for(int i = 0; i < nums.length; i++){
           currentSum += nums[i];
           if(map.containsKey(currentSum - k)){
               count += map.get(currentSum-k);
           }

           if(map.containsKey(currentSum)){
               int newCount = map.get(currentSum);
               newCount++;
               map.put(currentSum,newCount);
           } else {
                map.put(currentSum,1);
           }
       }
       return count;
    }
}
