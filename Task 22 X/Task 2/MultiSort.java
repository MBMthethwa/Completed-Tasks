import java.util.Random;
public class MultiSort
{
   public static void main(String[] args)
   {
      int[][] twoDimessionArrays = new int[7][7]; 
      
      Random rand = new Random();
      
      for(int i = 0 ;i < 7; i++)
      {
          for(int x = 0; x < 7; x++)
          {
            twoDimessionArrays[i][x] = rand.nextInt(100) + 1;
            
          }
      
      }
      
      int temp = 0;
      System.out.println("Sort ascending order according to row column value");
      for(int i = 0 ;i < 7; i++)
      {
          for(int x = 0; x < 7; x++)
          {
            for(int z = 0;z < 6; z++)
            {
               // 5 4 6 10
                  if(twoDimessionArrays[i][z] > twoDimessionArrays[i][z+1] )
                  {
                     temp = twoDimessionArrays[i][z];
                     twoDimessionArrays[i][z] = twoDimessionArrays[i][z + 1];
                     twoDimessionArrays[i][z+1] = temp; 
               
                  }
            
            }
            
          }
          
      }
      
      String rowV ="";
      String row = "Row : " ;
      
      for(int i = 0 ;i < 7; i++)
      {
          for(int x = 0; x < 6; x++)
          {
            rowV =  rowV + " " + twoDimessionArrays[i][x];            
          }
          System.out.println(row + i +" "+rowV);
          rowV = "";
          
      }
      
       System.out.println("Sort all rows based on their columns’ totals in descending order");
       int[] totalCol0 = new int[]{0,0,0,0,0,0,0};
       int pos =0;
      for(int i = 0 ;i < 7; i++)
      {
          for(int x = 0; x < 7; x++)
          {
            
               totalCol0[x] = totalCol0[x] + twoDimessionArrays[i][x];
            
                        
            
          }
          
         
          
      }
      
      System.out.println( " Before sort" );

     for(int i = 0; i < 7; i++)
     {
         System.out.print(totalCol0[i] + " " );
     }
     
      System.out.println( " " );
    

      
    int temp2 = 0; 
    for(int i = 0; i < 7; i++)
    {
       for(int x = 0; x < 6; x++)
       {
            if(totalCol0[x] < totalCol0[x + 1])
            {
               temp2 = totalCol0[x];
               totalCol0[x] = totalCol0[x + 1];
               totalCol0[x + 1] = temp2;
                
            }
       }
    }
    
    
    System.out.println( " After sort" );
     for(int i = 0; i < 7; i++)
     {
         System.out.print(totalCol0[i] + " " );
     }
    
   }
}