import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    // ! program 1
    // int[] arr1 = { 1, 2, 3 };
    // int[] arr2 = { 4, 5, 6 };
    // int[] result = new int[arr1.length + arr2.length];
    // for (int i = 0; i < arr1.length; i++) {
    // result[i] = arr1[i];
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // result[arr1.length + i] = arr2[i];
    // }
    // System.out.print("Joined Array: ");
    // for (int i = 0; i < result.length; i++) {
    // System.out.print(result[i] + " ");
    // }

    // !program 2
    // int a[] = { 1, 2, 3,};
    // int b[] = { 1, 2, 3,4,5 };
    // int small, large;
    // large = (a.length > b.length) ? a.length : b.length;
    // small = (a.length < b.length) ? a.length : b.length;
    // int c[] = new int[large];

    // for (int i = 0; i < small; i++) {
    // c[i] = a[i] * b[i];
    // }
    // for (int i = small; i < large; i++) {
    // if (a.length > b.length) {
    // c[i] = a[i];
    // } else if (b.length > a.length) {
    // c[i] = b[i];
    // }
    // }
    // for (int i : c) {
    // System.out.println(i);
    // }

    // ! program 3:
    // Scanner sc = new Scanner(System.in);
    // int n = 4;
    // int a[] = new int[n + 1];
    // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextInt();
    // }
    // int pos = sc.nextInt();
    // int val = sc.nextInt();
    // for (int i = n - 1; i > (pos - 1); i--) {
    // a[i + 1] = a[i];
    // }
    // a[pos] = val;
    // for (int i : a) {
    // System.out.println(i);
    // }

    // ! program4
    // int a[] = { 1, 2, 3, 4, 5 };
    // int n = 2;
    // for (int i = 0; i < n; i++) {
    // int key = a[a.length-1];
    // for (int j = a.length-1; j > 0; j--) {
    // a[j] = a[j - 1];
    // }
    // a[0] =key;
    // }
    // for(int i:a)
    // {
    // System.out.print(i+" ");
    // }

    // !program 5
    // int a[] = { 1, 2, 3, 4, 5 };
    // int n = 1;
    // for (int i = 0; i < n; i++) {
    // int key = a[0];
    // for (int j =0; j <a.length-1; j++) {
    // a[j] = a[j +1];
    // }
    // a[a.length-1] =key;
    // }
    // for(int i:a)
    // {
    // System.out.print(i+" ");
    // }

    // ! program 6
    // int a[] = { 1, 0, 2, 0, 3 };
    // int idx = 0;
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] != 0) {// 1!=0//0!=0
    // int temp=a[i];
    // a[i] = a[idx];
    // a[idx]=temp;
    // idx++;
    // }
    // }
    // for (int i : a) {
    // System.out.println(i);
    // }

    // ! program 7,8
    // int a[]={1,2,2};
    // boolean b[]=new boolean[a.length];
    // int duplicateCount=0;
    // for(int i=0;i<a.length;i++)
    // {
    // if(!b[i])
    // {
    // int count=0;
    // for(int j=0;j<a.length;j++)
    // {
    // if(a[i]==a[j])
    // {
    // count++;
    // b[j]=true;
    // }
    // }
    // if(count>1)
    // {
    // // System.out.println(a[i]+" comes "+count+" times");
    // // System.err.println(count);
    // duplicateCount+=1;
    // }
    // }
    // }
    // System.out.println(duplicateCount);

    // ! program 9
    // int a[] = { 12, 3, 45, 7 };
    // int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] > first) {
    // second = first;
    // first = a[i];
    // } else if (a[i] > second ) {
    // second = a[i];
    // }
    // }
    // System.out.println(second);

    // !program 10
    // String s1="100";
    // String s2="10";
    // char c[]=s1.toCharArray();
    // char c1[]=s2.toCharArray();
    // int count=0;
    // int count1=0;
    // for(int i=0;i<c.length;i++)
    // {
    // count=count*10+(c[i]-'0');//2
    // }
    // for(int i=0;i<c1.length;i++)
    // {
    // count1=count1*10+(c1[i]-'0');//3
    // }
    // System.out.println(count*count1);

    // !program 11
    // String s = "google";
    // char c[] = s.toCharArray();
    // int i = 0, j = s.length() - 1;
    // while (i < j) {
    // while (i < j && !isvowels(c[i])) {
    // i++;
    // }
    // while (i < j && !isvowels(c[j])) {
    // j--;
    // }
    // if(i<j)
    // {
    // char temp=c[i];
    // c[i]=c[j];
    // c[j]=temp;
    // i++;
    // j--;
    // }
    // }
    // String str=new String(c);
    // System.out.println(str);

    // ! program 12
    // for (int i = 2; i <= 10; i++) {
    // int count = 0;
    // for (int j = 2; j <= i / 2; j++) {
    // if (i % j == 0)
    // break;
    // else
    // count++;
    // }
    // if (count == (i / 2) - 1)
    // System.out.println(i);
    // }

    // ! program 13
    // int n = 1010;
    // int countComma = 0;
    // for (int i = 1; i <= n; i++) {
    // String str = String.valueOf(i);
    // int len = str.length();

    // countComma += (len - 1) / 3;
    // }
    // System.out.println(countComma);

    // ! program 14
    // String s="PROGRAM";
    // int length = s.length();
    // int middleIndex = length / 2;
    // String temp = "";
    // for (int i = middleIndex; i < length; i++) {
    // System.out.print(s.substring(middleIndex, i + 1)+"\n");
    // temp = s.substring(middleIndex, i + 1);
    // }

    // for (int i = 0; i < middleIndex; i++) {
    // System.out.print(temp + s.substring(0, i + 1)+"\n");
    // }

    // ! program 15
    // int[] arr = { 1, 2, 3, 4, 5 };
    // if (arr.length == 0) {
    //   return;
    // }
    // long sum = 0, max = arr[0], min = arr[0];
    // for (int i = 0; i < arr.length; i++) {
    //   sum += arr[i];
    //   if (arr[i] < min) {
    //     min = arr[i];
    //   }
    //   if (arr[i] > max) {
    //     max = arr[i];
    //   }
    // }
    // System.out.printf("%d %d", (sum - max), (sum - min));
  }

  // public static boolean isvowels(char c) {
  // return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
  // c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  // }

}