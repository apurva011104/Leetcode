class Solution {
    public String longestPalindrome(String s) {
        String res=s.charAt(0)+"";
        int maxLen=1;
        for(int i=1;i<s.length()-1;i++){
            int l=i,r=i;
            while(l!=-1 && r!=s.length()){
                if(s.charAt(l)!=s.charAt(r))
                    break;
                l--;
                r++;
            }
            maxLen=Math.max(maxLen,r-l-1);
            if(maxLen==r-l-1){
                res=s.substring(l+1,r);
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int l=i,r=i+1;
                while(l!=-1 && r!=s.length()){
                    if(s.charAt(l)!=s.charAt(r))
                        break;
                    l--;
                    r++;
                }
                maxLen=Math.max(maxLen,r-l-1);
                if(maxLen==r-l-1){
                    res=s.substring(l+1,r);
                }
            }
        }
        return res;
    }
}
