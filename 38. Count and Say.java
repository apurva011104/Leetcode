class Solution {
    public static void fillStack(Stack<Character> stack,int n){
        if(n==1) {
            stack.push('1');
            return;
        }
        fillStack(stack,n-1);
        Stack <Character> help=new Stack<>();
        int count=1;
        while(!stack.isEmpty()){
            help.push(stack.pop());
        }
        stack.push(help.pop());
        while (!help.isEmpty()){
            if(stack.peek()!=help.peek()){
                stack.push(Integer.toString(count).charAt(0));
                stack.push(help.pop());
                count=1;
            }
            else{
                help.pop();
                count++;
            }
        }
        stack.push(Integer.toString(count).charAt(0));
    }
    public String countAndSay(int n) {
        Stack<Character> stack=new Stack<>();
        fillStack(stack,n);
        String answer="";
        while(!stack.isEmpty()){
            answer+=stack.pop();
        }
        return answer;
    }
}
