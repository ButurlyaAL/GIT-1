using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace DEV_11
{
  /// <summary>
  /// Translits text.
  /// </summary>
  class Transitor
  {
    private Data_Provider dataProvider;
    private Dictionary<string, string> dictionary;

    /// <summary>
    /// Creates Translitor.
    /// </summary>
    public Transitor()
    {
      dataProvider = new Data_Provider();      
    }

    /// <summary>
    /// Returns translited text.
    /// </summary>
    /// <param name="text">Text to translit.</param>
    /// <returns>Trabslited text.</returns>
    public string TranslitText(string text)
    {
      dictionary = dataProvider.GetDictionary(this.IndentificationOfText(text));
      StringBuilder result = new StringBuilder();
      StringBuilder symbol = new StringBuilder();
      //maxLengthOfSymbol is max length of symbol in dictionary.
      int maxLengthOfSymbol = 5;
      for (int i = 0; i < text.Length; i++)
      {
        symbol.Clear();
        maxLengthOfSymbol = 5;
        if (Regex.IsMatch(text[i].ToString(), "\\W|\\d"))
        {
          result.Append(text[i]);
          continue;
        }
        else if (!dictionary.ContainsKey(text[i].ToString()))
        {
          result.Append("");
          continue;
        }
        if (i + maxLengthOfSymbol > text.Length)
        {
          maxLengthOfSymbol = text.Length - i;
        }
        //Recognizes symbol.
        while (!dictionary.ContainsKey(symbol.ToString()))
        {
          symbol.Clear();
          symbol.Append(text.Substring(i, maxLengthOfSymbol));
          maxLengthOfSymbol--;
        }
        result.Append(dictionary[symbol.ToString()]);
        i += maxLengthOfSymbol;
      }
      return result.ToString();
    }

    /// <summary>
    /// Indentificates type of text(Cyrillic or Latin).
    /// </summary>
    /// <param name="text">Text to indentificate.</param>
    /// <returns>True if text type is Cyrillic;false otherwise</returns>
    private bool IndentificationOfText(string text)
    {
      if (Regex.IsMatch(text, @"[А-Яа-я]+|\\d*|\\W*$"))
      {
        return true;
      }
      else if (Regex.IsMatch(text, @"[A-Za-z]+|\\d*|\\W*$"))
      {
        return false;
      }
      throw new ArgumentException("You have entered string in wrong format.");
    }  
  }
}
