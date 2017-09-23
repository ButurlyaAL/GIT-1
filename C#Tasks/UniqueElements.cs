using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AT
{
    class UniqueElements
    {
        static void Main(string[] args)
        {
            string[] array = {"1","2","1","5","6","5","3" };
            string[] newArray = UniqueElements.ArrayOfUniqueElements(array);
            for (int i = 0; i < newArray.Length; i++)
            {
                Console.Write(newArray[i] + " ");
            }
        }

        static string[] ArrayOfUniqueElements(string[] array)
        {
            string[] newArray = new string[array.Length];
            for (int i = 0,count = 0,number = 0; i < array.Length; i++)
            {
                for (int j = 0; j < array.Length; j++)
                {
                    if (array[i].Equals(array[j]))
                    {
                        count++;
                    }
                }
                if (count == 1)
                {
                    newArray[number] = array[i];
                    number++;
                }
                count = 0;
            }
            return newArray;
        }
    }
}
