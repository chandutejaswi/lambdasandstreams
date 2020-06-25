import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageOfIntegers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfIntegers,avgOfIntegers;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		System.out.print("Enter number of elements:");
		noOfIntegers=sc.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=noOfIntegers;iter++)
		{
			integers.add(sc.nextInt());
		}
		avgOfIntegers=avgOfListOfIntegers(integers,( a, b)->a+b,(a,b)->a/b);
		System.out.println("Average of given integers is : "+avgOfIntegers);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> integers,BiFunction<Integer,Integer,Integer> biFunction,BiFunction<Integer,Integer,Integer> division)
	{
		int sum=0,average;
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=division.apply(sum,integers.size());
		return average;
	}
	
}