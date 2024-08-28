public class StringDemo {
    public static void main(String[] args) {
        // int a[]={1,2,3};
        // System.out.println(a);

        // String a="abc";
        // String b="abc";
        // String a=new String("abc");
        // String b=new String("abc");
        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        // if(a==b){
        // System.out.println("a is equal to b");
        // }
        // else{
        // System.out.println("a is not equal to b");
        // }
        // if(a.equals(b)){
        // System.out.println("a is equal to b");
        // }
        // else{
        // System.out.println("a is not equal to b");
        // }
        // String a=" ";
        // System.out.println(a.isBlank());
        // //! return true if no character and whitespace

        // String b="";
        // System.out.println(b.isEmpty());
        // ! Return true is length is 0
        // ! Program 1
        // String s = "       Hardwork never fails         ";
        // System.out.println(s);
        // int i = 0, j = s.length() - 1;
        // for (int m = 0; m <s.length(); m++) {
        //     if (s.charAt(i) == ' ') {
        //         i++;
        //     }
        //     if (s.charAt(j) == ' ') {
        //         j--;
        //     }
        // }
        // for (int k = i; k <= j; k++) {
        //     System.out.print(s.charAt(k));
        // }

        // ! program 2
        String s="sunday is funday";
        int end=s.length()-1;
        int start=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
            {
                start=i+1;
                printReverse(s, start, end);//10,15
                end=i-1;
            }
        }
        printReverse(s, 0, end);

    }
    public static void printReverse(String s,int start,int end)
    {
        String s1="";
        for(int i=start;i<=end;i++)
        {
            s1+=s.charAt(i);
        }
        s1+=" ";
        System.out.print(s1);
    }
}