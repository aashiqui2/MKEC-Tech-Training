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
        // int last=n&1;
        // ans=ans+(temp*last);
        // temp=temp*10;
        // n=n>>1;
        // }
        // System.out.println(ans);

        // !program 2
        // int n = 85273;
        // StringBuilder ans = new StringBuilder();
        // while (n > 0) {
        // int last = n & 1;
        // ans.insert(0, last);
        // n = n >> 1;
        // }
        // System.out.println(ans.toString());
        // System.out.println(Integer.toBinaryString(85273));

        // !program 3
        // int a=1,b=1;
        // while (b!=0) {
        // int carry=a&b;

        // a=a^b;
        // b=carry<<1;
        // }
        // System.out.println(a);

        int n = 6;
        int opt1 = 1;
        int opt2 = 2;
        System.out.println(addSub(n, opt1));
        System.out.println(addSub(n, opt2));
    }

    public static int addSub(int n, int opt) {
        int result = 0;
        if (opt == 1) {

                for (int i = n; i >= 1; i--) {
                    if (i % 2 == 0) {
                        result -= i;
                    } else {
                        result += i;
                    }
                }
            result = Math.abs(result);
        } else if (opt == 2) {
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        result -= i;
                    } else {
                        result += i;
                    }
                }
                result = n - result;
            } else {
                for (int i = 1; i < n; i++) {
                    if (i % 2 == 0) {
                        result += i;
                    } else {
                        result -= i;
                    }
                }
                result = n + result;
            }
        }
        return result;
    }
}
