using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.IO;


namespace DEV_11
{
  /// <summary>
  /// Provides data.
  /// </summary>
  class Data_Provider
  {
    /// <summary>
    /// Creates dictionary from file.
    /// </summary>
    /// <param name="isCyirillic">Determinates type of dictionary.</param>
    /// <returns>Dictionary.</returns>
    public Dictionary<string, string> GetDictionary(bool isCyirillic)
    {
      string path = "";
      string patternForKey = "";
      string patternForValue = "";
      if (isCyirillic)
      {
        path = Path.GetFullPath(@"..\\..\\DictionaryCyrillicIntoLatin.txt");
        patternForKey = "[A-Za-z]*";
        patternForValue = "[А-Яа-яёЁ]*";
      }
      else
      {
        path = Path.GetFullPath(@"..\\..\\DictionaryLatinIntoCyrillic.txt");
        patternForKey = "[А-Яа-яёЁ]*";
        patternForValue = "[A-Za-z]*";
        
      }

      Dictionary<string, string> dictionary = new Dictionary<string, string>();
      string[] lines= File.ReadAllLines(path, Encoding.Default);
      
      for (int i = 0; i < lines.Length; i++)
      { 
        dictionary.Add(Regex.Replace(lines[i], patternForKey, ""), Regex.Replace(lines[i], patternForValue, ""));
      }
      return dictionary; 
    }
  }
}
