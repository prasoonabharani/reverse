import java.util.*;
class Stringrev
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
str=sc.nextLine();
String ch[]=str.split(" ");
int l=ch.length;
for(int i=0;i<l;i++)
{
String s=ch[i];
int r=s.length();
for(int j=r-1;j>=0;j--)
System.out.print(s.charAt(j));  
System.out.print(" ");
}
}
}
