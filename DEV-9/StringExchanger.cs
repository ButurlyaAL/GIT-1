using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_9
{
  /// <summary>
  /// Class wich inserts sub strings to strings.
  /// </summary>
  class StringExchanger
  {
    private Random random;

    /// <summary>
    /// Constructor.
    /// </summary>
    public StringExchanger()
    {
      this.random = new Random();
    }

    /// <summary>
    /// Inserts random subString in str at random position.
    /// </summary>
    /// <param name="str">String in wich subString is inserting.</param>
    /// <param name="subString">subString wich is inserting in string</param>
    /// <returns>Source string with subSting in it.</returns>
    public string InsertSubStringInString(string str, string subString)
    {
      if (str.Length == 0)
      {
        throw new ArgumentException("One of the strings is empty.");
      }
      int begin = random.Next(0, str.Length - 1);
      int end = random.Next(begin, str.Length - 1);
      char[] arrayOfString = new char[str.Length + (subString.Length - (end - begin))];
      int count = 0;

      for (int i = 0; i < begin; i++)
      {
        arrayOfString[count] = str[i];
        count++;
      }
      for (int j = 0; j < subString.Length; j++)
      {
        arrayOfString[count] = subString[j];
        count++;
      }
      for (int i = end; i < str.Length; i++)
      {
        arrayOfString[count] = str[i];
        count++;
      }
      return new string(arrayOfString);
    }

    /// <summary>
    /// Creates sub string from random position in source string.
    /// </summary>
    /// <param name="str">String from wich sub string is creating</param>
    /// <returns>Sub string from random position.</returns>
    public string RandomSubStringFromString(string str)
    {
      int begin = random.Next(0, str.Length - 1);
      int end = random.Next(begin, str.Length - 1);
      return str.Substring(begin,end - begin);
    }
  }
}
