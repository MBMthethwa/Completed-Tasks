

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.Arrays;


public class MyFile
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
         String line = "" ;
         int percent = 0;
        String function = ""; 
      
      	try 
         {
         File file = new File("input.txt");
           Scanner scannerR = new Scanner(file);
           Formatter f = new Formatter("output.txt");
	
          int min = 0,max = 0,average = 0,sum = 0, perc = 0;
            while(scannerR.hasNext())
            {
               line = scannerR.next();
              
               String[] splitedLine = line.split(":");
               function = splitedLine[0];
               String[] list =  splitedLine[1].split(",");
               
               
            System.out.println(function);
               
               int[] listInt = new int[list.length];
               
               for(int y = 0; y < list.length;y++)
               {
                  listInt[y] = Integer.parseInt(list[y]);
                  System.out.println(listInt[y]);
               }
               
               if(function.equals("min"))
               {
                  min = listInt[0];
                  
                  for(int i = 0;i < list.length;i++ )
                  {
                        min = Math.min(listInt[i],min);
                        System.out.println("Min : " + min);  
                  }
                  
                  f.format("%s%s%d%n","The min of ", Arrays.toString(list),min);
                   
               }
              else if(function.equals("max"))
               {
                  max = listInt[0];
                  
                  for(int i = 0;i < list.length ;i++ )
                  {
                     
                        max = Math.max(listInt[i],max);
                         System.out.println("Max : " + max); 
                     
                  }
                  
                  f.format("%s%s%d%n","The max of ", Arrays.toString(listInt),max);
                   
              }
              else if(function.equals("avg"))
              {
                  System.out.println("function : " + function);
                  
                  for(int i = 0;i < listInt.length;i++ )
                  {
                     sum = sum + listInt[i];
                      System.out.println("sum : " + sum); 
                  }
                  
                  average = sum / listInt.length;
                   System.out.println("avg : " + average); 
                  f.format("%s%s%d%n","The avg of ", Arrays.toString(listInt),average);
                   
               }
               else if(function.substring(0,1).equals("p"))
               {
                   
                  percent = Integer.parseInt(function.substring(1,3));
                  System.out.println(" percent " + percent);
                  System.out.println(" length " + listInt.length);
                  
                  double percD = ((Double.parseDouble(String.valueOf(percent)) / 100) * listInt.length);
                  
                  
                  System.out.println("p" + percD);
                  
                  f.format("%s%s%d%n","The " + percent + "th" +  " percentile of ", Arrays.toString(listInt),Math.round(percD));
                   
              }   

            }
            scannerR.close();
            f.close();
       } 
       catch (Exception e)
       {
            JOptionPane.showMessageDialog(null, e + " error \n" + e.getMessage());
       }

		
      
   }
}