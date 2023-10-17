package practicePrograms;

import java.util.Scanner;

public class Pangram 
{
	public static boolean panagram(String sen) 
	{
		boolean [] present=new boolean[26];
		
		sen=sen.toUpperCase();
		
		for(int i=0;i<sen.length();i++)
		{
			char ch=sen.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				int index=ch-'A';
				present[index]=true;
			}
		}
		
		for(boolean letterPresent:present)
		{
			if(!letterPresent)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String sen=s.nextLine();
		if(panagram(sen))
		{
			System.out.println("it is Pangram");
		}
		else {
			System.out.println("Not a Pangrm");
		}

	}

}
