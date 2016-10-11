public class ThreeDim
{
   public static void main(String[] args)
   {
      int threeD[][][] = new int[10][10][10];
		
		
		for(int x=0; x<10; x++)
			for(int y=0; y<10; y++)
				for(int z=0; z<10; z++)
					threeD[x][y][z] = x + y + z;
	
		for(int x=0; x<10; x++) {
			for(int y=0; y<10; y++) {
				for(int z=0; z<10; z++)
					System.out.print( threeD[x][y][z] + " ");
				System.out.println();
			}
		System.out.println();
		}

   }
}