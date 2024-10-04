import java.util.Scanner;
import java.util.Arrays;
public class Reverse
{
public static void main(String[]args)
{
int s=0;
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
int n=a.length-1;
for(int i=0;i<a.length;i++)
{
System.out.println("enter numbers:");
a[i] = sc.nextInt();
}
while(s<n)
{
int temp=a[s];
a[s]=a[n];
a[n]=temp;
s++;
n--;
}
System.out.println("the reverse numbers are:");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}
}
}
