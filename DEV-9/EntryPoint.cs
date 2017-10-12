using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_9
{
  /// <summary>
  /// Entry point of program.
  /// </summary>
  class EntryPoint
  {
    static void Main(string[] args)
    {     
      Console.WriteLine("Enter first string : ");
      string firstString = Console.ReadLine();
      Console.WriteLine("Enter second string : ");
      string secondString = Console.ReadLine();
      StringExchanger strExchanger = new StringExchanger();
      try
      {
        Console.WriteLine("Changed first string : " + strExchanger.InsertSubStringInString(firstString, strExchanger.RandomSubStringFromString(secondString)));
        Console.WriteLine("Changed second string : " + strExchanger.InsertSubStringInString(secondString, strExchanger.RandomSubStringFromString(firstString)));
      }
      catch (ArgumentException exception)
      {
        Console.WriteLine(exception.Message);
      }
    }
  }
}
