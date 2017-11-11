using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PathValidation
{
  class Program
  {
    static void Main(string[] args)
    {
      PathValidator validator = new PathValidator("COM1");
      Console.WriteLine(validator.IsValidPath());
     
    }
  }
}
