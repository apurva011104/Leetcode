class Solution {
    public static int removeDuplicates(int []nums){
        int lest=1,right=1;
        while(lest<nums.length){
            if(nums[lest]!=nums[lest-1]){
                nums[right]=nums[lest];
                right++;
            }
            lest++;
        }
        return right;
    }
}
