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
    /// <summary>
    /// Returns information about files in directory and sub directories.
    /// </summary>
    /// <param name="directoryPath">Path of directory.</param>
    /// <returns>List of strings with iformation about files in directory and sub dirctories.</returns>
    public List<string> GetInformationAboutDirectory(string directoryPath)
    {
      int countOfFiles = 0;
      int countOfDirectories = 0;
      List<string> result = new List<string>();
      List<string> pathesOfDirectories = Directory.GetDirectories(directoryPath).ToList();
      List<string> pathesOfFiles = Directory.GetFiles(directoryPath).ToList();
      do
      {
        while (countOfFiles < pathesOfFiles.Count)
        {
          result.Add(GetInformationAboutNextFile(countOfFiles, pathesOfFiles));
          countOfFiles++;
        }
        if (pathesOfDirectories.Count != 0)
        {
          result.AddRange(GetInformationAboutDirectory(pathesOfDirectories[countOfDirectories]));
          countOfDirectories++;
        }
      } while (countOfDirectories < pathesOfDirectories.Count);
      return result;
    }

    private string GetInformationAboutNextFile(int countOfFiles, List<string> pathesOfFiles)
    {
      StringBuilder result = new StringBuilder();
      FileInfo fileInfo = new FileInfo(pathesOfFiles[countOfFiles]);
      result.Append("Path of file :");
      result.Append(pathesOfFiles[countOfFiles]).Append(",");
      result.Append("Creation time of file :");
      result.Append(File.GetCreationTime(pathesOfFiles[countOfFiles])).Append(", ");
      result.Append("Size of file : ");
      result.Append(fileInfo.Length).Append(" bytes");
      count++;
      return result.ToString();
    }
  }
}
