class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        while(index<nums2.length){
            int index2=m-1+index;
            nums1[m+index]=nums2[index];
            while(index2>=0){
                if(nums2[index]<nums1[index2]){
                    nums1[index2+1]=nums1[index2];
                    nums1[index2]=nums2[index];
                    index2--;
                }
                else{
                    break;
                }
            }
            index++;
        }
        for(int i:nums1)
        System.out.print(i+" ");
    }
}
