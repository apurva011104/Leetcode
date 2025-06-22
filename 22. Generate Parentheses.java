class Solution {
    public void generate(String str, int left, int right, int n, List<String> list){
        if(left==n && right==n){
            list.add(str);
            return;
        }
        if(left<n)
            generate(str+'(',left+1,right,n,list);
        if(right<left)
            generate(str+')',left,right+1,n,list);
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate("",0,0,n,list);
        return list;
    }
}
