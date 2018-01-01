using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_10
{

  /// <summary>
  /// Entry point of program.
  /// </summary>
  class EntryPoint
  {
    static void Main(string[] args)
    {
      DataProvider provider = new DataProvider();
      CombinerOfArrays combiner = new CombinerOfArrays();
      List<double[]> arrays = provider.CreateListOfRandomArrays(1000, 100);
      double[] array = combiner.GetUnionOfArrays(arrays);
      for (int i = 0; i < array.Length; i++)
      {
        Console.WriteLine(array[i]);
      } 
    }
  }
}
