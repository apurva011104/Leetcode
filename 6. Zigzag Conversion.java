class Solution {
    public static String convert(String s, int numRows) {
        if(s.length()<=2 || numRows==1)
        return s;
        Queue<Character> que=new LinkedList<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            que.add(s.charAt(i));
        }
        int index=0;
        for(int i=0;i<s.length();i++){
            if(index==0) {
                ans += que.remove();
                index++;
            }
            else if(index==2*(numRows-1)-1){
                que.add(que.remove());
                index=0;
            }
            else{
                index++;
                que.add(que.remove());
            }

        }
        numRows--;
        while(numRows!=1){
            index=0;
            int len=que.size();
            for(int i=0;i<len;i++){
                if(index==0) {
                    ans += que.remove();
                    index++;
                }
                else if(index==2*(numRows-1)) {
                    ans+=que.remove();
                    index=0;
                }
                else{
                    index++;
                    que.add(que.remove());
                }
            }
            numRows--;
        }
        while(!que.isEmpty())
            ans+=que.remove();
        return ans;
    }
}
