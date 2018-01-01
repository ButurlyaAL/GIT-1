using System;
using System.Collections;

namespace RepeatedElements
{
  /// <summary>
  /// Entry point.
  /// </summary>
  class Program
  {
     
    static void Main(string[] args)
    {
      AnalyzerOfCollections analyzer = new AnalyzerOfCollections();
      ArrayList collection = new ArrayList() { 1.2,1.2,1.2,1.2,1.3,1.4,1.4};

      try
      {
        int amount = analyzer.GetCountOfRepeatedElements(collection);
        Console.WriteLine("Amount of repeated elements in collection is " + amount);
      }
      catch (Exception)
      {
        Console.WriteLine("Collection is empty.");
      }
    }
  }
}
