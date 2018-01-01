using System;
using System.Collections.Generic;

namespace Task_3
{
  /// <summary>
  /// Provider of data.
  /// </summary>
  public class DataProvider
  {
    /// <summary>
    /// Adds data to list of auto.
    /// </summary>
    /// <param name="listOfAuto"></param>
    public void EnterDataToList(List<Auto> listOfAuto)
    {           
      do
      {
        listOfAuto.Add(GetNewAuto());
        Console.WriteLine("If you want to finish press ENTER.Otherwise press anything else.");
      } while (Console.ReadKey().Key != ConsoleKey.Enter);
    }
    
    private Auto GetNewAuto()
    {
      try
      {
         Console.WriteLine("Enter mark of auto : ");
         string mark = Console.ReadLine();
         Console.WriteLine("Enter model of auto : ");
         string model = Console.ReadLine();
         Console.WriteLine("Enter type of auto : ");
         string type = Console.ReadLine();
         Console.WriteLine("Enter price of auto : ");
         double price = double.Parse(Console.ReadLine());
         return new Auto(mark, model, type, price);
       }
       catch(ArgumentException)
       {
         Console.WriteLine("Wrong format.Try again.");
         return GetNewAuto();
       }
     }
   }
}
