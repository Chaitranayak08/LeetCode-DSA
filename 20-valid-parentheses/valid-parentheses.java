class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(ch=='('||ch=='{'|| ch=='['){
                stack.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if (stack.isEmpty()) {
                         return false;
                }
                if(ch=='}' && stack.peek()!='{'|| 
                    ch==')' && stack.peek()!='(' ||
                    ch==']' && stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }

        }

        return stack.size()==0;
    }
}