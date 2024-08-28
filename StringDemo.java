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
        // String s = " Hardwork never fails ";
        // System.out.println(s);
        // int i = 0, j = s.length() - 1;
        // for (int m = 0; m <s.length(); m++) {
        // if (s.charAt(i) == ' ') {
        // i++;
        // }
        // if (s.charAt(j) == ' ') {
        // j--;
        // }
        // }
        // for (int k = i; k <= j; k++) {
        // System.out.print(s.charAt(k));
        // }

        // ! program 2
        // String s="sunday is funday";
        // int end=s.length()-1;
        // int start=0;
        // for(int i=s.length()-1;i>=0;i--){
        // if(s.charAt(i)==' ')
        // {
        // start=i+1;
        // printReverse(s, start, end);//10,15
        // end=i-1;
        // }
        // }
        // printReverse(s, 0, end);

        // ! program 3
        // String s="Today is holiday";
        // String s1="is";
        // boolean isfound=false;
        // for(int i=0;i<s.length();i++)
        // {
        // if(s.charAt(i)==s1.charAt(0))
        // {
        // int count=0;
        // for(int j=0;j<s1.length();j++)
        // {
        // if(s.charAt(i)==s1.charAt(j))
        // {
        // count++;
        // i++;
        // }
        // }
        // if(count==s1.length())
        // {
        // isfound=true;
        // System.out.println("YES");
        // break;
        // }
        // }
        // }
        // if(isfound==false)
        // {
        // System.out.println("NO");
        // }

        // ! program 4 HW
        // ? Move the "x" to the end of String s
        // String s="axbxcd";

        // ! program 5
        // anagram
        // String s = "racee";
        // String s1 = "caree";
        // if (isanagram(s, s1)) {
        // System.out.println("anagram");
        // } else {
        // System.out.println("not anagram");
        // }

        // String s = "race";
        // String s1 = "cate";
        // if (s.length() == s1.length()) {
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // int index = s1.indexOf(c);
        // if (index != -1) {
        // s1=s1.substring(0,index)+s1.substring(index+1);
        // }
        // }
        // if(s1.isEmpty())
        // {
        // System.out.println("anagram");
        // }
        // else{
        // System.out.println("Not an anagram");
        // }
        // } else {
        // System.out.println("Not a anagram");
        // }

        // ! Program 6
        int nums[] = { 3, 1, 2, 4 };

        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] % 2 == 0) {
                i++;
            }
            while (i < j && nums[j] % 2 != 0) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        for(int k:nums)
        {
            System.out.print(k+" ");
        }

    }

    // public static boolean isanagram(String s1, String s2) {
    // int count[] = new int[256];
    // int count1[] = new int[256];
    // char c[]=s1.toCharArray();//['c','a','r','e']
    // char c1[]=s2.toCharArray();
    // if(c.length!=c1.length)
    // return false;
    // for(int i=0;i<c.length && i<c1.length;i++)
    // {
    // count[c[i]]++;
    // count1[c1[i]]++;
    // }
    // for(int i=0;i<256;i++)
    // {
    // if(count[i]!=count1[i])
    // {
    // return false;
    // }
    // }
    // return true;
    // }
    // public static void printReverse(String s,int start,int end)
    // {
    // String s1="";
    // for(int i=start;i<=end;i++)
    // {
    // s1+=s.charAt(i);
    // }
    // s1+=" ";
    // System.out.print(s1);
    // }
}