import java.util.Stack;

public class BasicCalculator {
    public static  int Calculator(String s)
    {
        Stack<Integer> stack=new Stack<>();
        int result=0;
        int num=0;
        int sign=1;
        stack.push(sign);
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');//1
            }
            else if(c=='(')
            {
                stack.push(sign);
            }
            else if(c==')')
            {
                stack.pop();
            }
            else if(c=='+'||c=='-')
            {
                result=result+num*sign;
                sign=(c=='+'?1:-1)*stack.peek();
                num=0;
            }
        }
        return result+num*sign;
    }
    public static void main(String[] args) {
        String s="(5-(4-7))";
        System.out.println(Calculator(s));
    }
}
