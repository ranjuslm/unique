import java.io.*;
import java.util.*;
class qw
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int count=1;
int l=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]!='$')
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
count++;
a[j]='$';
}
}
System.out.println("count:"+a[i]+":"+count);
if(count==1)
{
b[i]=a[i];
System.out.println("b:"+b[i]);
break;
}
count=1;
}
}
}
}