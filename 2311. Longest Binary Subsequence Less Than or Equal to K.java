class Solution {
    public int longestSubsequence(String s, int k) {
        int len=0;
        long num=0;
        boolean flag=true;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='0')     len++;
            else if(flag){
                long n=(long)Math.pow(2,len);
                if(num+n<=k){
                    num+=n;
                    len++;
                }
                else{
                    flag=false;
                }
            }
        }
        return len;
    }
}
