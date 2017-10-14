using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SearchMaxSubString
{
  class Program
  {
    static void Main(string[] args)
    {
      Searcher seatcher = new Searcher();
      try
      {
        Console.WriteLine(seatcher.GetMaxCommonSubString("rhhfghSAMt", "teSAMfghte"));
      } 
      catch (ArgumentOutOfRangeException exception)
      {
        Console.WriteLine("No matches.");
      }
    }
  }
}
