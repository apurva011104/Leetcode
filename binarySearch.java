class Solution {
    public int search(int[] nums, int target) {
        return usingRecursion(nums,0,nums.length-1,target,-1);
    }
    public static int usingRecursion(int []nums, int start, int end , int target, int index){
        int mid=start+(end-start)/2;
        if(start>end)
            return index;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]<target){
            return usingRecursion(nums,mid+1,end,target,index);
        }
        else
            return usingRecursion(nums,start,mid-1,target,index);
    }
}
