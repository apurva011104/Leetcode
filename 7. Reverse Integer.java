class Solution {
    public int reverse(int x) {
        long rev=0;
        int length=Integer.toString(x).length()-1;
        if(x<0){
            length--;
        }
        while(x!=0){
            rev+=(x%10)*(long)Math.pow(10,length);
            x/=10;
            length--;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
            return 0;
        else
            return (int)rev;
    }
}
