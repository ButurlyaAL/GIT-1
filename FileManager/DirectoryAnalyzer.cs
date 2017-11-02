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
    private FileInfo fileInfo;  

    /// <summary>
    /// Retuns string with information about files in directory.
    /// </summary>
    /// <param name="directoryPath">Path of direcory</param>
    /// <returns>String with information.</returns>
    public string GetInformationAboutDirectory(string directoryPath)
    {
      StringBuilder result = new StringBuilder();
      string[] pathesOfFiles = Directory.GetFiles(directoryPath);
      for (int i = 0; i < pathesOfFiles.Length; i++)
      {
        fileInfo = new FileInfo(pathesOfFiles[i]);
        result.AppendLine(GetInformationAboutFile(pathesOfFiles[i]));
      }
      return result.ToString();
    }

    private string GetInformationAboutFile(string path)
    {
      StringBuilder result = new StringBuilder();

      result.Append("Path of file :").Append(path).Append(", ");
      result.Append(path).Append(",");
      result.Append("Creation time of file :");
      result.Append(File.GetCreationTime(path)).Append(", ");
      result.Append("Size of file : ");
      result.Append(fileInfo.Length).Append(" bytes");

      return result.ToString();
    }

      
    
  }
}
