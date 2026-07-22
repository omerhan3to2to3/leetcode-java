class Solution {
    public int arraySign(int[] nums) {
        int i = 0, currValue = 1;
        while(nums.length>i){
            if(nums[i]<0){
                currValue = currValue * (-1);
            }else if(nums[i] == 0){
                currValue=0;
                i = nums.length;
            }
            i++;
        }
        return currValue;
    }
}