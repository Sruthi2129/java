import java.util.Scanner;
class Multiple
{
public static void main(String args[])
{
int n;
Scanner Sc=new Scanner(System.in);
System.out.println("enter the value of n");
n=Sc.nextInt();
if (n%4==0)
{
System.out.print("leap year");
}
else
{
System.out.print("not a leap year");
}
}
}