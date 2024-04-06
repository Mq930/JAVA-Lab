import java.util.*;
class stringbuffer
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		StringBuffer sb= new StringBuffer("JAVA");
		System.out.println("Enter a String= ");
		String str=sc.nextLine();
		str.concat("LAB");
		System.out.println("string after concatenation= "+str);
		sb.append("LAB");
		System.out.println("string after appending= "+sb);
	}
}
