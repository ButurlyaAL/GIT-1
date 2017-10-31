using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace SortFile
{
  /// <summary>
  /// Sorts strings in file.
  /// </summary>
  class FileSorter
  {
    private FileStream fileStream;
    private static const char firstEndOfFileSymbol = '\r';
    private static const char secondEndOfFileSymbol = '\n';

    /// <summary>
    /// Returns string from file.
    /// </summary>
    /// <returns>string</returns>
    private string ReadLine()
    {
      StringBuilder line = new StringBuilder();
      char symbol;
      while ((symbol = (char)fileStream.ReadByte()) != firstEndOfFileSymbol || (symbol = (char)fileStream.ReadByte()) != secondEndOfFileSymbol)
      {
        if (fileStream.Position == fileStream.Length)
        {
          break;
        }
        line.Append(symbol);
      }
      return line.ToString();
    }

    /// <summary>
    /// Sorts strings in file.
    /// </summary>
    /// <param name="path">Path of file to sort.</param>
    public void SortStringsInFile(string path)
    {
      using (fileStream = new FileStream(path, FileMode.OpenOrCreate))
      {
        string previousString = String.Empty;
        string currentString = String.Empty;
        bool wasChanged = false;

        do
        {
          wasChanged = false;
          while ((currentString = this.ReadLine()) != String.Empty)
          {
            if (String.Compare(previousString, currentString) > 0)
            {
              this.ReplaceStrings(previousString, currentString);
              wasChanged = true;
            }
            else
            {
              previousString = currentString;
            }
          }
          fileStream.Seek(0, SeekOrigin.Begin);
          previousString = String.Empty;
        } while (wasChanged);
      }
    }

    /// <summary>
    /// Replaces strings in file.
    /// </summary>
    /// <param name="firstString">First string</param>
    /// <param name="secondString">Second string.</param>
    private void ReplaceStrings(string firstString, string secondString)
    {
      byte[] space = Encoding.Default.GetBytes("\r\n");
      byte[] bytesOfFirstString = Encoding.Default.GetBytes(firstString);
      byte[] bytesOfSecondString = Encoding.Default.GetBytes(secondString);
      
      fileStream.Seek(-(bytesOfFirstString.Length + bytesOfSecondString.Length + space.Length * 2), SeekOrigin.Current);   
      fileStream.Write(bytesOfSecondString, 0, bytesOfSecondString.Length);    
      fileStream.Write(space, 0, space.Length);  
      fileStream.Write(bytesOfFirstString, 0, bytesOfFirstString.Length);
      fileStream.Write(space, 0, space.Length);     
    }
  }
}
  

