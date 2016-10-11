import java.util.Random;

public class NoDups
{
   public static int[] removeDuplicate(int[] array)
   {
		//find the highest value in array
		int high = array[0];
		
		for(int x = 0; x < array.length; x ++)
		{
			if(high < array[x])
			{
				high = array[x];
			}
		}
		// declare a number that does not exist in the original array
		int dupI = high + 5;
		//Two loops so that each number is checked against all the numbers
		
		for(int a = 0; a < array.length; a ++)
		{
			for(int b = 0; b < array.length - 1; b ++)
			{
				//check if value is not already indicated as duplicate
				if(array[a] != dupI)
				{
					//Do not check againt itself
					if(a != b)
					{
						//check for duplicate
						if(array[a] == array[b])
						{
							//give the duplicate found the value of non existing number
							array[b] = dupI;
						}
					}
				}	
				
			}
		}
		
		//count all unique numbers
		int count = 0;
		for(int i = 0 ;i < array.length; i ++)
		{
			if(array[i] != dupI)
			{
				count ++;
			}
			
		}
		
		//create new array that will hold unique numbers
		int noDup[] = new int[count];
		count = 0;
		//populate the new array
		for(int i = 0 ;i < array.length; i ++)
		{
			if(array[i] != dupI)
			{
				noDup[count] = array[i];
				count++;
			}
			
		}
		
		return noDup; 
   }
   
   public static void main(String[] args)
   {
		int nmbrs[] = new int[]{20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
		
		System.out.println("Before removing duplicates");
		for(int i = 0 ; i < nmbrs.length;i ++)
		{
			System.out.print(" : "+nmbrs[i]);
			
		}
		System.out.println();
		System.out.println("After removing duplicates");
		int[] array = NoDups.removeDuplicate(nmbrs);
		
		for(int i = 0; i < array.length; i++)
		{
			
			System.out.print(array[i] + " : " );
		}
   }
   
}