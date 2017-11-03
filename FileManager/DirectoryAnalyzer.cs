using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace FileManager
{
  /// <summary>
  /// Analyzes directory.
  /// </summary>
  class DirectoryAnalyzer
  {
    private string[] pathesOfFiles;
    private int count;


    public DirectoryAnalyzer(string directoryPath)
    {
      pathesOfFiles = Directory.GetFiles(directoryPath);
      count = 0;
    }

    /// <summary>
    /// Returns information about existing of next file in directory.
    /// </summary>
    /// <returns>True if directory has next file.False otherwise.</returns>
    public bool DirectoryHasNextFile()
    {
      return count < pathesOfFiles.Length;
    }

    /// <summary>
    /// Returns information about next file.
    /// </summary>
    /// <returns>String with information about next file.</returns>
    public string GetInformationAboutNextFile()
    {
      StringBuilder result = new StringBuilder();
      FileInfo fileInfo = new FileInfo(pathesOfFiles[count]);
      result.Append("Path of file :");
      result.Append(pathesOfFiles[count]).Append(",");
      result.Append("Creation time of file :");
      result.Append(File.GetCreationTime(pathesOfFiles[count])).Append(", ");
      result.Append("Size of file : ");
      result.Append(fileInfo.Length).Append(" bytes");
      count++;
      return result.ToString();
    }
  }
}
