using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Transpose
{
    class Program
    {
        static void Main(string[] args)
        {

            int[,] marksA = new int[,]
            {{10,20,30,40,50,60},
            {80,90,100,10,20,30},
            {50,60,70,80,90,100},
            {20,30,40,50,60,70},
            {90,100,10,20,30,40},
            {60,70,80,90,100,10}};

            int[,] marksB = new int[6, 6];
            int x1 = 0, y1 = 0;

            for (int x = 5; x >= 0;x-- )
            {
                
                for (int y = 0; y <= 5; y++)
                {
                    marksB[x1, y1] = marksA[y, x];
                

                    y1 = y1 + 1;
                }
                x1++;
                y1 =0;
              
            }

            Console.WriteLine("Mark A");
            for (int x = 0; x <= 5; x++)
            {


                for (int y = 0; y <= 5; y++)
                {
                    Console.Write(marksA[x,y] + " : ");
                }
                Console.WriteLine();
            }

            Console.WriteLine("Mark B");

            for (int x = 0; x <= 5; x++)
            {


                for (int y = 0; y <= 5; y++)
                {
                    Console.Write(marksB[x, y] + " :");
                }
                Console.WriteLine();
            }
            
             
            Console.ReadLine();
        }
    }
}
