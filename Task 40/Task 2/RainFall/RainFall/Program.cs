using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RainFall
{
    class Program
    {
        static void Main(string[] args)
        {
            double[,] rainFall = new double[,] { 
            {6587235.0, 585.4, 787.3,888.1, 1254.5, 7080.8, 200.8, 5475.2, 7895.9, 96352.4, 4124.3, 4578.1 } , 
            {658722235.0,525.4,727.3,828.1,12254.5,7020.8,2020.8,54725.2,78925.9,962352.4,42124.3,45728.1},
            {65875235.0,555.4,577.3,588.1,12554.5,7005.8,2500.8,54575.2,78595.9,963552.4,41524.3,45578.1},
            {65872835.0,585.4,787.3,888.1,18254.5,7800.8,2080.8,54875.2,78895.9,968352.4,48124.3,45878.1},
            {65877235.0,575.4,777.3,878.1,12754.5,7700.8,2007.8,54775.2,78795.9,976352.4,41724.3,45778.1},
            {65872635.0,655.4,767.3,868.1,16254.5,7060.8,6200.8,54675.2,76895.9,966352.4,64124.3,46578.1}
            };

            double annualRainFallAvg = 0.0;
            double sumAnnualRainFall = 0.0;
            double monthRainFallAvg2000 = 0.0;
            double sumMonthRainFall2000 = 0.0;
            double monthRainFallAvg2001 = 0.0;
            double sumMonthRainFall2001 = 0.0;
            double monthRainFallAvg2002 = 0.0;
            double sumMonthRainFall2002 = 0.0;
            double monthRainFallAvg2003 = 0.0;
            double sumMonthRainFall2003 = 0.0;
            double monthRainFallAvg2004 = 0.0;
            double sumMonthRainFall2004 = 0.0;
            double monthRainFallAvg2005 = 0.0;
            double sumMonthRainFall2005 = 0.0;

            for(int x = 0; x <= 5; x++)
            {
                for (int y = 0; y <= 11; y++ )
                {
                    Console.Write(rainFall[x,y] + " ");
                }
                Console.WriteLine();

            }

            for (int x = 0; x <= 5; x++)
            {
                for (int y = 0; y <= 11; y++)
                {
                    sumAnnualRainFall = sumAnnualRainFall + rainFall[x, y];
                    

                }
                

            }

            annualRainFallAvg = sumAnnualRainFall / rainFall.Length;

            Console.WriteLine("annually rain fall average " + annualRainFallAvg);

            for (int x = 0; x <= 5; x++)
            {
                for (int y = 0; y <= 11; y++)
                {
                    if(x == 0)
                    {
                        sumMonthRainFall2000 = sumMonthRainFall2000 + rainFall[x, y];
                    }

                    if (x == 1)
                    {
                        sumMonthRainFall2001 = sumMonthRainFall2001 + rainFall[x, y];
                    }

                    if (x == 2)
                    {
                        sumMonthRainFall2002 = sumMonthRainFall2002 + rainFall[x, y];
                    }

                    if (x == 3)
                    {
                        sumMonthRainFall2003 = sumMonthRainFall2003 + rainFall[x, y];
                    }

                    if (x == 4)
                    {
                        sumMonthRainFall2004 = sumMonthRainFall2004 + rainFall[x, y];
                    }
                    if (x == 5)
                    {
                        sumMonthRainFall2005 = sumMonthRainFall2005 + rainFall[x, y];
                    }

                }

                Console.WriteLine();

            }

             double hightestRainFall = 0.0;

                for (int x = 0; x <= 5; x++)
                {
                    for (int y = 0; y <= 11; y++)
                    {
                        if(rainFall[x,y] > hightestRainFall)
                        {
                            hightestRainFall = rainFall[x,y];
                        }
                    }

                }




            monthRainFallAvg2000 = sumMonthRainFall2000 / 12;
            monthRainFallAvg2001 = sumMonthRainFall2001 / 12;
            monthRainFallAvg2002 = sumMonthRainFall2002 / 12;
            monthRainFallAvg2003 = sumMonthRainFall2003 / 12;
            monthRainFallAvg2004 = sumMonthRainFall2004 / 12;
            monthRainFallAvg2005 = sumMonthRainFall2005 / 12;

            Console.WriteLine("Month rain fall average 2000 " + monthRainFallAvg2000);
            Console.WriteLine("Month rain fall average  2001 " + monthRainFallAvg2001);
            Console.WriteLine("Month rain fall average 2002 " + monthRainFallAvg2002);
            Console.WriteLine("Month rain fall average 2003 " + monthRainFallAvg2003);
            Console.WriteLine("Month rain fall average 2004 " + monthRainFallAvg2004);
            Console.WriteLine("Month rain fall average 2005 " + monthRainFallAvg2005);
            Console.WriteLine("highest Month rain average fall " + hightestRainFall);

           
            Console.ReadLine();

            
        }
    }
}
