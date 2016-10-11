using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
           
            int guess = 0;

            
           int number = rand.Next(50);

           Boolean found = false;

            for (int i = 0; i < 10; i++ )
            {
                Console.WriteLine("Enter your guess number between 1 and 50 ");
                guess = int.Parse(Console.ReadLine());
                
                
                if(guess < 0 || guess > 50)
                {
                    Console.WriteLine("You must enter your guess number between 1 and 50 ");
                    i--;
                }
                else if (guess == number)
                {

                    found = true;
                    break;
                }
                else if (guess < number)
                {
                    Console.WriteLine("Guess High");
                    found = false;

                }
                else if (guess > number)
                {
                    Console.WriteLine("Guess Lower");
                    found = false;
                }


                
                
            }


            if (found)
            {
                Console.WriteLine("You won ");
            }
            else {
                Console.WriteLine("You lose ");
            }
            Console.ReadLine();


        }
    }
}
