using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FileManager
{
  /// <summary>
  /// Entry point.
  /// </summary>
  class Program
  {
    static void Main(string[] args)
    {
      Console.WriteLine("Please enter path of directory :");
      string direcoryPath = Console.ReadLine();

      DirectoryAnalyzer analyzer = new DirectoryAnalyzer();
      Console.WriteLine("Information about directory :");
      List<string> informationAboutDirectory = analyzer.GetFullInformationAboutDirectory(direcoryPath);
      foreach (string informationAboutFile in informationAboutDirectory)
      {
        Console.WriteLine(informationAboutFile);
      }
    }
  }
}
