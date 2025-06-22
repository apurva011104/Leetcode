class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)==false)
            return -1;
        int idx=0;
        while(haystack.length()>=needle.length()){
            if(haystack.substring(0,needle.length()).equals(needle))
                break;
            haystack=haystack.substring(1);
            idx++;
        }
        return idx;
    }
}
