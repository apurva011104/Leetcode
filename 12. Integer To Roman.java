class Solution {
    public String intToRoman(int num) {
        int []val={1,5,10,50,100,500,1000};
        String []rom={"I","V","X","L","C","D","M"};
        StringBuilder roman = new StringBuilder();
        int i=val.length-1;
        while(num!=0){
            int c=num/val[i];
            //System.out.println(num+" "+val[i]);
            if(c==1 && Integer.toString(num).charAt(0)=='9'){
                roman.append(rom[i-1]);
                roman.append(rom[i+1]);
                num=num%val[i-1];
            }
            else if(c==4){
                roman.append(rom[i]);
                roman.append(rom[i+1]);
                num=num%val[i];
            }
            else{
                for(int j=0;j<c;j++){
                    roman.append(rom[i]);
                }
                num=num%val[i];
            }
            //System.out.println(num+" "+val[i]);
            i--;
        }
        return roman.toString();
    }
}
