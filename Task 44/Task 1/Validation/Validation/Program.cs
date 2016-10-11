using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Validation
{
    class Program
    {
        static Random rand = new Random();
        static String username = "";
        static String password = "";
        static Boolean vld = false;

         public static Boolean getDetails()
            {
                Console.WriteLine("Enter the username, numbers between 5 and 10 ");
                username =  Console.ReadLine();

                
                    if(username.Length > 4 && username.Length < 11)
                    {
                         vld = true;
                    }
                    else
                    {
                        vld = false;
                    }
                

                return vld;
            }

            public static void DisplayData()
            {
                if (getDetails())
                {
                    for (int i = 0; i < 5; i++)
                    {
                        String p = "" + rand.Next(5);
                        password = password + p;
                    }
                    Console.WriteLine("username : " + username + "\n" + "password : " + password + "\n" + "Welcome, you have successful created a new account ");
                }
                else 
                {
                    Console.WriteLine("username : " + username );
                }
                
            }

        static void Main(string[] args)
        {

            Validation.Program.DisplayData();
            Console.ReadLine();
        }
        
    }
}
