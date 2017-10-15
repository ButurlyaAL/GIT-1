using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_11
{
  /// <summary>
  /// Entry point of program.
  /// </summary>
  class Program
  {
    static void Main(string[] args)
    {
      Transitor translitor = new Transitor();
      try
      {
        Console.WriteLine("Enter a text :");
        string text = Console.ReadLine();
        Console.WriteLine(translitor.TranslitText(text));
      }
      catch (ArgumentException exception)
      {
        Console.WriteLine(exception.Message);
      }     
    }
  }
}
