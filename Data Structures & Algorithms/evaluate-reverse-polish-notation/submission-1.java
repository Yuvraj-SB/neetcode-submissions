class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int res =0;
        for(String token : tokens){
            if(token.equals("+")){
                res = stack.pop() + stack.pop();
                stack.push(res);
            }
            else if(token.equals("*")){
                res = stack.pop() * stack.pop();
                stack.push(res);
            }
            else if(token.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }
            else if(token.equals("/")){
                int num3 = stack.pop();
                int num4 = stack.pop();
                stack.push(num4/num3);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
