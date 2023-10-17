package practicePrograms;

import java.util.HashMap;
import java.util.Scanner;

public class RownumToInt 
{
	public static int rownumTOInt(String str) 
	{
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=0;
		int lastValue=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			int value=map.get(ch);
			if(value<lastValue)
			{
				result-=value;
			}
			else {
				result+=value;
			}
			lastValue=value;
					
		}
		return result;
		
		
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(rownumTOInt(str));

	}

}
