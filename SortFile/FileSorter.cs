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
              lineToWrite = GetLineToWrite(previousString, currentString);
              WriteLine(lineToWrite); 
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
    private string GetLineToWrite(string firstString, string secondString)
    {
      StringBuilder lineToWrite = new StringBuilder(secondString);
      lineToWrite.Append(firstEndOfFileSymbol);
      lineToWrite.Append(secondEndOfFileSymbol);
      lineToWrite.Append(firstString);
      lineToWrite.Append(firstEndOfFileSymbol);
      lineToWrite.Append(secondEndOfFileSymbol);

      return lineToWrite.ToString();    
    }

    private void WriteLine(string lineToWrite)
    {
      byte[] bytesOfLineToWrite = Encoding.Default.GetBytes(lineToWrite);
      fileStream.Seek(-(bytesOfLineToWrite.Length), SeekOrigin.Current);
      fileStream.Write(bytesOfLineToWrite, 0, bytesOfLineToWrite.Length);
    }
  }
}
  

