using System;
using System.Collections.Generic;

namespace Task_3
{
  /// <summary>
  /// Entry point.
  /// </summary>
  class Program
  {     
    static void Main(string[] args)
    {
      List<Auto> listOfAuto = new List<Auto>();
      DataProvider provider = new DataProvider();   
      provider.EnterDataToList(listOfAuto);
      listOfAuto.Sort();
      foreach (Auto auto in listOfAuto)
      {
        Console.WriteLine(auto.ToString());
      }
    }
  }
}
