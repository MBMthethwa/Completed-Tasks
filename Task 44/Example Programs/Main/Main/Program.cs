/*
IN THIS EXAMPLE, A CERTAIN TRANSPORTATION COMPANY IS USING A SOFTWARE
FOR MANAGING THEIR DELIVERY BOXES BEFORE THEY SHIP THEM TO WHERE THEY ARE NEEDED.
THIS PROGRAM HELPS THEM TO MAKE SURE THE BOX IS FULL BEFORE BEING SENT AWAY.
A BOX REQURES 10 ITEMS TO GET FULL
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Main
{
    class Program
    {
        //The two variables below are known as global variables - they can be accessed
        //and changed anywhere in this class.
        static double Totalweight = 0;
        static string contents = "";   //A STRING IS USED FOR STORING ITEM NAMES

        static void Main(string[] args)
        {
            bool full = false;
            int itemCounter = 0;

            while(full ==false){

                string item;
                double weight;

                Console.WriteLine("Input item name");
                item = Console.ReadLine();
                Console.WriteLine("Input " + item + "'s weight");
                weight = Double.Parse(Console.ReadLine());

                ///function overloading
                Add(item);
                Add(weight);

                itemCounter +=1;

                /*checks if storage box is full or what
                *sets full = true if the box is full else keep adding
                */
                if(itemCounter < 5)
                    Console.WriteLine("Box is not full, please input other items");

                else if(itemCounter ==5)
                        full = true;

            }

            ///display loaded items and weight
            Console.WriteLine("You have fully loaded the box with a weight of " + Totalweight + "kg");
            Console.WriteLine("Items loaded: " + contents);
            Console.ReadLine();
        }


        //THIS ONE ADDS THE ITEM NAME
        private static void Add(string item)
        {

            contents += item;
            contents += " ";

        }

        //this one adds the item weight to the total weight loaded
        private static void Add(double itemweight)
        {

            Totalweight += itemweight;

        }
    }
}
