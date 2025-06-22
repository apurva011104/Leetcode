class Solution {
    public static int [] twoSum(int[]arr, int target){
        int index[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        return index;
    }
}
