class Solution {
    public int myAtoi(String s) {
        int idx=0;
        while(idx<s.length() && s.charAt(idx)==' ')     idx++;
        boolean flag=false;
        System.out.println(Integer.MAX_VALUE);
        if(idx<s.length() && s.charAt(idx)=='-'){
            idx++;
            flag=true;
        }
        else if(idx<s.length() && s.charAt(idx)=='+'){
            idx++;
        }
        StringBuilder num=new StringBuilder();
        while(idx<s.length() && s.charAt(idx)>='0' && s.charAt(idx)<='9'){
            num.append(s.charAt(idx));
            idx++;
        }
        if(num.length()==0)     return 0;
        idx=0;
        while(idx<num.length() && num.charAt(idx)=='0')     idx++;
        if(idx==num.length())       return 0;
        String no=num.toString().substring(idx);
        if(flag){
            if(no.length()>10)      return Integer.MIN_VALUE;
            long n=0-Long.parseLong(no);
            if(n<Integer.MIN_VALUE)     return Integer.MIN_VALUE;
            return (int)n;
        }
        if(no.length()>10)      return Integer.MAX_VALUE;
        long n=Long.parseLong(no.toString());
        if(n>Integer.MAX_VALUE)     return Integer.MAX_VALUE;
        return (int)n;
    }
}
