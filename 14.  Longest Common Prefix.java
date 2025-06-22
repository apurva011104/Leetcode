class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int idx=0;
        int minLen=Math.min(strs[0].length(), strs[strs.length-1].length());
        while(idx<minLen && strs[0].charAt(idx)==strs[strs.length-1].charAt(idx))   idx++;
        return strs[0].substring(0,idx);
    }
}
