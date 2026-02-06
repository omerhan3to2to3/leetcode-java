class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        boolean flag_not_check = true;
        int[] targets = new int[2];
        while(flag_not_check){
            if(nums[i]+nums[j] == target){
                flag_not_check = false;
                targets[0] = i;
                targets[1] = j;
            }
            i++;
            if(i == j){
                i=0;
                j++;
            }
        }
        return targets;
    }
}