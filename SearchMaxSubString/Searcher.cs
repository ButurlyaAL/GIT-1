using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
                                          
namespace SearchMaxSubString
{
  /// <summary>
  /// Searchs common sub string in two strings with maximum length.
  /// </summary>
  class Searcher
  {
    /// <summary>
    /// Returns common sub string in two strings with maximum length.
    /// </summary>
    /// <param name="firstString">First string.</param>
    /// <param name="secondString">Second string.</param>
    /// <returns>Sub string  with maximum length.</returns>
    public string GetMaxCommonSubString(string firstString, string secondString)
    { 
      List<string> resultString = new List<string>();
      for (int i = 0, j = 0; i < secondString.Length; i++)
      {
        j = 1;
        while (i + j <= secondString.Length && SearchSubString(secondString.Substring(i, j), firstString) != 0)
        { 
          resultString.Add(secondString.Substring(i,j));
          j++;
        }
      }
      return this.GetMaxString(resultString);
    }

    /// <summary>
    /// Returns string with maximum length from array of strings.
    /// </summary>
    /// <param name="arrayOfStrings">Array of strings.</param>
    /// <returns>String with maximum length.</returns>
    public string GetMaxString(List<string> arrayOfStrings)
    {
      string maxString = arrayOfStrings[0];
      for (int i = 0; i < arrayOfStrings.Count; i++)
      {
        if (maxString.Length < arrayOfStrings[i].Length)
        {
          maxString = arrayOfStrings[i];
        }
      }
      return maxString;
    }

    /// <summary>
    /// Searchs sub string in string(KMP algorithm).
    /// </summary>
    /// <param name="subString">Sub string</param>
    /// <param name="str">String</param>
    /// <returns>Value of prefix function for sub string.</returns>
    public int SearchSubString(string subString, string str)
    {
      StringBuilder resultString = new StringBuilder(subString);
      resultString.Append(" ");
      resultString.Append(str);
      int[] prefixFunction = this.PrefixFunction(resultString.ToString());
      for (int i = 0; i < prefixFunction.Length; i++)
      {
        if (prefixFunction[i] == subString.Length)
        {
          return prefixFunction[i];
        }
      }
      return 0;
    }

    /// <summary>
    /// Returns prefix function(array).
    /// </summary>
    /// <param name="str">String from which prefix function creating</param>
    /// <returns>Array of values of prefix function.</returns>
    public int[] PrefixFunction(string str)
    {
      int[] prefixFunction = new int[str.Length];
      prefixFunction[0] = 0;
      for (int i = 1; i < str.Length; i++)
      {
        int previousPrefixFunction = prefixFunction[i - 1];
        while (true)
        {
          if (str[previousPrefixFunction].Equals(str[i]))
          {
            prefixFunction[i] = previousPrefixFunction + 1;
            break;
          }

          if (previousPrefixFunction == 0)
          {
            if (str[0].Equals(str[i]))
            {
              prefixFunction[i] = 1;
              break;
            }
            else
            {
              prefixFunction[i] = 0;
              break;
            }
          }
          previousPrefixFunction = prefixFunction[previousPrefixFunction - 1];
        }
      }
      return prefixFunction;
    }
  }
}
