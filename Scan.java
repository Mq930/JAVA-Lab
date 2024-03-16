/*
 * Scanner Class
 */
import java.util.Scanner;
class Scan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Welcome "+name);
        sc.close();
    }
}