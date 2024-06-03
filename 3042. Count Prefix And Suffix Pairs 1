class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(checkIfMatch(words[i],words[j]))
                    count++;
            }
        }
        return count;
    }
    public static boolean checkIfMatch(String str1, String str2){
        if(str1.length()>str2.length())
            return false;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i))
                    return false;
            }
            return true;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i) || str1.charAt(i)!=str2.charAt(str2.length()-str1.length()+i))
                return false;
        }
        return true;
    }
}
