using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Crap
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
            int dice1 = 0;
            int dice2 = 0;
            int roll = 0;
            int point = 0;
            int count = 0;

            Console.WriteLine("Do you want to play y/n");
            Char option = Console.ReadKey(true).KeyChar;

            while (Char.ToUpper(option) == 'Y')
            {
                Console.WriteLine("Press (R) to roll ");
                string play = Console.ReadLine();

                while ((play.ToUpper()).Equals("R"))
                {
                 
                    dice1 = rand.Next(6) + 1;
                    dice2 = rand.Next(6) + 1;
                    roll = dice1 + dice2;
                    count++;

                    Console.WriteLine("You rolled :  " + roll + " Die 1 = " + dice1 + " Die 2 = " + dice2);

                    if(roll == 7 || roll == 11)
                    {
                        if (count == 1)
                        {
                            Console.WriteLine("You won ");
                            count = 0;
                            break;
                        }
                        else
                        {
                            Console.WriteLine("You lose ");
                            count = 0;
                            break;
                        }
                    }

                    if (roll == 2 || roll == 3 || roll == 12)
                    {
                        if(count == 1)
                        {
                            Console.WriteLine("You lose ");
                            count = 0;
                            break;
                        }
                        
                    }

                    
                    if (count == 1)
                    {
                            point = roll;
                    }
                    else
                    {
                        
                        if(point == roll)
                        {
                           Console.WriteLine("You won");
                           count = 0;
                            break;
                         }
                    }

                    
                    

                    Console.WriteLine("Press (R) to roll ");
                    play = Console.ReadLine();
                }
                Console.WriteLine("Do you want to play y/n");
                option = Console.ReadKey(true).KeyChar;
            }

                 
               
        }



        
    }
}
