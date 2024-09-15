class Solution {
    public static long check(int[]arr, long sum, int index){
        if(index<2)
            return -1;
        if(sum>arr[index]){
            return sum+arr[index];
        }
        return check(arr, sum-arr[index-1],index-1);
    }
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length-1;i++)
            sum=sum+nums[i];
        return check(nums,sum,nums.length-1);
    }
}
