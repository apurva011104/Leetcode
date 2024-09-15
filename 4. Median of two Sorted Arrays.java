class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int comb[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length ||  j<nums2.length){
            if(i==nums1.length){
                comb[k]=nums2[j];
                j++;
            }
            else if(j==nums2.length){
                comb[k]=nums1[i];
                i++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    comb[k]=nums1[i];
                    i++;
                }
                else{
                    comb[k]=nums2[j];
                    j++;
                }
            }
            k++;
        }
        if(comb.length%2==0){
            double med=comb[(comb.length/2)-1]+comb[comb.length/2];
            return med/2;
        }
        else
            return comb[comb.length/2];
    }
}
