//Welcome to the Advanced Arrays task 

/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
 

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM
   ************************************
*/

public class example
{
	
	
	public static void main(String args[])
	{
		/*
			In Java, multidimensional arrays are actually arrays of arrays. These, as you might expect, look
			and act like regular multidimensional arrays. However, as you will see, there are a couple
			of subtle differences. To declare a multidimensional array variable, specify each additional
			index using another set of square brackets. For example, the following declares a twodimensional
			array variable called twoD:
		*/
		
		int twoD[][]= new int[4][5];
		
		/*
			This allocates a 4 by 5 array and assigns it to twoD. Internally, this matrix is implemented as an array of arrays of int.
			
			The following code, assigns values to each element in the array from left to right, top to bottom, and then displays these values:
		*/
		
		int i, j, k = 0;
		
		
		for(i=0; i<4; i++)
			for(j=0; j<5; j++) {
				twoD[i][j] = k;
				k++;
		}
		
		
		for(i=0; i<4; i++) {
			for(j=0; j<5; j++)
				System.out.print(twoD[i][j] + " ");
		   System.out.println();
		}
      System.out.println();

		/*
			This program will generate the output:
			0 1 2 3 4
			5 6 7 8 9
			10 11 12 13 14
			15 16 17 18 19
		
			When you allocate memory for a multidimensional array, you need only specify the memory for the first (leftmost) dimension. You can allocate the remaining dimensions separately.
		
			The use of uneven (or irregular) multidimensional arrays may not be appropriate for many applications, because it runs contrary to what people expect to find when a multidimensional array is encountered. 
			
			However, irregular arrays can be used effectively in some situations. For example, if you need a very large two-dimensional array that is sparsely populated (that is, one in which not all of the elements will be used), then an irregular array might be a perfect solution. It is possible to initialize multidimensional arrays. 
			
			To do so, simply enclose each dimension’s initializer within its own set of curly braces. The following program creates a matrix where each element contains the product of the row and column indexes. Also notice that you can use expressions as well as literal values inside of array initializers.
		*/
		
		double multi[][] = {
		{ 0*0, 1*0, 2*0, 3*0 },
		{ 0*1, 1*1, 2*1, 3*1 },
		{ 0*2, 1*2, 2*2, 3*2 },
		{ 0*3, 1*3, 2*3, 3*3 }
		};
		
		int m, n;
		
		for(m=0; m<4; m++) {
			for(n=0; n<4; n++)
				System.out.println(multi[m][n] + " ");
			System.out.println();
		}
		System.out.println();
			
		/*
			This program will generate the output:
			0.0 0.0 0.0 0.0
			0.0 1.0 2.0 3.0
			0.0 2.0 4.0 6.0
			0.0 3.0 6.0 9.0
			
			Each row in the array is initialized as specified in the initialization lists.
		
			The following program creates a 3 by 4 by 5, three-dimensional array. It then loads each element with the product of its indexes. Finally, it displays these products.
		*/
		
		int threeD[][][] = new int[3][4][5];
		int x, y, z;
		
		for(x=0; x<3; x++)
			for(y=0; y<4; y++)
				for(z=0; z<5; z++)
					threeD[x][y][z] = x * y * z;
	
		for(x=0; x<3; x++) {
			for(y=0; y<4; y++) {
				for(z=0; z<5; z++)
					System.out.print(threeD[x][y][z] + " ");
				System.out.println();
			}
		System.out.println();
		}
	}
}

/*
			================ COMPULSORY TASK 1 ===================
		
		   1. Create a new file called ThreeDim.java
	
		   2. Within the main method, create a 10x10x10 three dimensional array. 
	
		   3. By making the use of nested for loops, store the value of the sum of each of its coordinate positions. For example:
		        position (3,4,8) = 3 + 4 + 5 = 15
					
           4. Print the array out to the user.

           5. Compile, save and run your file.

		   
		   ================ COMPULSORY TASK 2 ====================
		   
		   1. Create a new file called MultiSort.java
	
		   2. Within the main method, create a 7x7 two dimensional array.
	
           3. Assign random values in the range of 1 to 100 (inclusive) to each position of the array.
					
           4. Next, sort the values of the array in the following way:
                Sort each row based on their column values in ascending order
                Sort all rows based on their columns’ totals in descending order


           5. Example:
                (8,9) = Row total is higher (17>7). 8 swapped with 9 (8<9).
                (3,4) = Row total is lower (descending). 3 was swapped with 4 (3<4).

           6. Print the array out to the user.

           7. Compile, save and run your file.

*/