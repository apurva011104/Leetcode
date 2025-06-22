class Solution {
    public static void combinations(String digits, String ans, ArrayList<String> list){
        String []keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            list.add(ans);
            return;
        }
        String str=keypad[digits.charAt(0)-'0'];
        for(int i=0;i<str.length();i++){
            combinations(digits.substring(1),ans+str.charAt(i),list);
        }
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> letters=new ArrayList<>();
        if(digits.length()==0)
        return letters;
        combinations(digits,"",letters);
        return letters;

    }
}
