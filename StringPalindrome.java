import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*@FunctionalInterface
public interface Predicate<String>
{
	boolean Test<String s>;
}*/
public class StringPalindrome
{
	public static boolean isPalindrome(String input)
	{
		StringBuilder input1=new StringBuilder();
		input1.append(input);
		input1=input1.reverse();
		return input.equalsIgnoreCase(input1.toString());
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> strings = new ArrayList<String>();
		List<String> result;
		Predicate<String> predicate=StringPalindrome::isPalindrome;      //(s)->s.equalsIgnoreCase
		int noOfStrings;
		
		System.out.print("Enter no of strings : ");
		noOfStrings = sc.nextInt();
		
		System.out.println("Enter strings");
		for(int iter=1;iter<=noOfStrings;iter++)
		{
			strings.add(sc.next());
		}
		
		result=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(result);
	}
}