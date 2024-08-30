public class Demo {
    public static void main(String[] args) {
        // int n = 2;
        // String s = "";
        // while (n > 0) {
        // int rem=n%2;
        // s=rem+s;
        // n=n/2;
        // }
        // System.out.println(s);

        // int n=85273;
        // int ans=0;
        // int temp=1;
        // while(n>0)
        // {
        // int last=n&1;//0//1
        // ans=ans+(temp*last);//0+(1*0)=0//(0+10*1)=10
        // temp=temp*10;//1*10//10*10//100
        // n=n>>1;//1//0
        // }
        // System.out.println(ans);

        int n = 85273;
        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            int last = n & 1;
            ans.insert(0, last); 
            n = n >> 1; 
        }

        System.out.println(ans.toString());

        System.out.println(Integer.toBinaryString(85273));

    }
}
