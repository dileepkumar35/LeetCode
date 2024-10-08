class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i< nums.length; i++) {
          if(i > k)
            set.remove(nums[i-k-1]);
          
          if(!set.add(nums[i]))
            return true;
        }
        return false;

        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if(map.containsKey(nums[i])) {
        //       if(Math.abs(map.get(nums[i])-i) <= k) {
        //         return true;
        //       }
        //     }
        //     map.put(nums[i], i);
        // }
        // return false;
    }
}