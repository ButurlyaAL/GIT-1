using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace SortFile
{
  /// <summary>
  /// Entry point.
  /// </summary>
  class Program
  {
    static void Main(string[] args)
    {
      FileSorter sorter = new FileSorter();
      try
      {
        sorter.SortStringsInFile(Path.GetFullPath(@"..\\..\\Ftile.txt"));
      }
      catch (FileNotFoundException exception)
      {
        Console.WriteLine("File not found.");
      }
    }
  }
}
