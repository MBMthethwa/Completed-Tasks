using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;



namespace PlayingWithFiles
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {

                String namePath = @"C:\Users\Programming\Dropbox\Mbali Mthethwa-5095\Certified Software Developer MicroDegree\Task 42\Task 1\my_name.txt";
                String kingPath = @"C:\Users\Programming\Dropbox\Mbali Mthethwa-5095\Certified Software Developer MicroDegree\Task 42\Task 1\king.txt";
                String numberPath = @"C:\Users\Programming\Dropbox\Mbali Mthethwa-5095\Certified Software Developer MicroDegree\Task 42\Task 1\number.txt";
                String myNumberPath = @"C:\Users\Programming\Dropbox\Mbali Mthethwa-5095\Certified Software Developer MicroDegree\Task 42\Task 1\myNumber.txt";
                TextWriter myWriter = File.CreateText(namePath);

                
                myWriter.WriteLine("Mbali");
                myWriter.Close();
               

                TextWriter kingWriter = File.AppendText(kingPath);
                kingWriter.WriteLine(" King");
                kingWriter.Close();

                TextReader myReader = null;
                myReader = File.OpenText(numberPath);

                String[] numbers = File.ReadAllLines(numberPath);

               

                TextWriter myNumbersFile = File.CreateText(myNumberPath);

                String number = null;
                for (int y = 0; y < numbers.Length;y++ )
                {
                    number = numbers[y];



                    myNumbersFile.WriteLine(number);
                        
                     

                }
               
                myNumbersFile.Close();
                
            }
            catch(IOException io)
            {
                Console.WriteLine(io.Message);
            }

           
        }
    }
}
