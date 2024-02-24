import java.util.Scanner;
class scan
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter 1st integer= ");
  int a= sc.nextInt();
  System.out.print("Enter 2nd integer= ");
  int b= sc.nextInt();
  System.out.println("DIFFERENCE="+(a-b));
}
}