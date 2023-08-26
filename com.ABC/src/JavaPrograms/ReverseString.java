package JavaPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s1="mom";
		String rev="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			//System.out.println(rev);
		}
		
		System.out.println(rev);
		System.out.println("hi");
		if (s1.equals(rev))
		{
			System.out.println("its an polyndron string");
		}
		else
		{
			System.out.println("its not a polyndrom");
		}
	}
}
