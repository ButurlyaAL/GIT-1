using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PathValidation
{
  class PathValidator
  {
    private string path;
    private char[] prohibitedSymbols; 
    private string[] prohibitedFileNames;
    private const char firstSeparator = (char)47;
    private const char secondSeparator = (char)92;
    private const char dot = '.';
    private const char space = ' ';
    private const char colon = ':';

    public PathValidator(string path)
    {
      this.path = path;
      prohibitedSymbols = new char[] {'<', '>', '"', '|', '?', '*'};
      prohibitedFileNames = new string[] {"CON","PRN","AUX","NUL","COM1","COM2","COM3","COM4","COM5","COM6","COM7",
                                     "COM7","COM8","COM9","LPT1","LPT2","LPT3","LPT4","LPT5","LPT6","LPT7","LPT8",
                                     "LPT9"};
     

    }

    public bool IsValidPath()
    {    
      if (!(path.Contains(firstSeparator) || path.Contains(secondSeparator)))
      {
        return IsValidString(path) && IsValidLength();
      }

      foreach (char symbol in path)
      {
        if (prohibitedSymbols.Contains(symbol))
        {
          return false;
        }
      }
      return IsValidBegining() && IsValidLength() && AreValidStrings();     
    }
    
    private bool AreValidStrings()
    {
      List<string> listOfNames = GetListOfNames();
      for (int i = 1; i < listOfNames.Count; i++)
      {
        if (prohibitedFileNames.Contains(listOfNames[i]) || !IsValidString(listOfNames[i]))
        {
          return false;
        }
      }
      return true;
    }

    private bool IsValidString(string str)
    { 
      if (IsLetterInString(str))
      {
        return !(str[0] == dot || str[0] == space || str[str.Length - 1] == dot || str[str.Length - 1] == space) && !prohibitedFileNames.Contains(str);
      }
      return !str.Contains(colon);
    }

    private bool IsLetterInString(string str)
    {
      foreach (char symbol in str)
      {
        if (Char.IsLetter(symbol))
        {
          return true;
        }
      }
      return false;
    }

    private bool IsValidLength()
    {
      return path.Length > 0 && path.Length < 32767;
    }

    private List<string> GetListOfNames()
    {
      int startIndex = 0;
      List<string> listOfNames = new List<string>();
      for (int i = 0; i < path.Length; i++)
      {
        if (path[i] == firstSeparator || path[i] == secondSeparator)
        {
          listOfNames.Add(path.Substring(startIndex, i - startIndex));
          startIndex = i + 1;       
        }
        else if (i == path.Length - 1)
        {
          listOfNames.Add(path.Substring(startIndex, i - startIndex + 1));
        }
      }
      return listOfNames;
    }

    private bool IsValidBegining()
    {
      if (GetListOfNames()[0].Contains(colon) && GetListOfNames()[0].Length == 2)
      {
        return LetterIsLatin(path[0]);
      }
      return path[0] == firstSeparator || path[0] == secondSeparator || path[0] == dot;   
    }

    private bool LetterIsLatin(char letter)
    {
      return (letter > 96 && letter < 123) || (letter > 64 && letter < 91);
    }   
  }
}

