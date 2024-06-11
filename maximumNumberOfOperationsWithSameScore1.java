class Solution {
    public int maxOperations(int[] nums) {
        int counting=0, check=nums[1]+nums[0];
        if(nums.length%2==0){
            for(int i=0;i<nums.length;i=i+2){
                if(nums[i]+nums[i+1]==check)
                    counting++;
                else
                    break;
            }
        }
        else{
            for(int i=0;i<nums.length-1;i=i+2){
                if(nums[i]+nums[i+1]==check)
                    counting++;
                else
                    break;
            }
        }
        return counting;
    }
}
