class Solution {
    public  static  int lastOccurence(int nums[],int target){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                if(mid==nums.length-1)
                    return mid;
                else if(nums[mid+1]==target)
                    start=mid+1;
                else
                    return mid;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static int firstOccurrence(int nums[],int target){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                if(mid==0)
                    return 0;
                else if(nums[mid-1]==target)
                    end=end-1;
                else
                    return mid;
            }
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static int[] searchRange(int []nums, int target){
        int arr[]={firstOccurrence(nums,target),lastOccurence(nums,target)};
        return arr;
    }
}
