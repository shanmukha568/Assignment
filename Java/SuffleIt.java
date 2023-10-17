package practicePrograms;

import java.util.Random;
import java.util.Scanner;

public class SuffleIt 
{
	
	public static int [] suffleIt(int arr []) 
	{
		int n = arr.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
		
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		suffleIt(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
