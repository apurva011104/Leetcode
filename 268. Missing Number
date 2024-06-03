class Solution {
    public static boolean usingRecursion(int []nums, int start, int end , int target){
        int mid=start+(end-start)/2;
        if(start>end)
            return false;
        if(nums[mid]==target)
            return true;
        else if(nums[mid]<target){
            return usingRecursion(nums,mid+1,end,target);
        }
        else
            return usingRecursion(nums,start,mid-1,target);
    }
    public static int missingNumber(int []nums){
        Arrays.sort(nums);
        int c=-1;
        for(int i=0;i<=nums.length;i++){
            if(usingRecursion(nums,0,nums.length-1,i)==false)
                return i;

        }
        return c;
    }
}
