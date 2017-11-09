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
    private List<string> pathesOfFiles;

    /// <summary>
    /// Returns information about files in directory and sub directories.
    /// </summary>
    /// <param name="directoryPath">Path of directory.</param>
    /// <returns>List of strings with iformation about files in directory and sub dirctories.</returns>
    public List<string> GetFullInformationAboutDirectory(string directoryPath)
    {    
      int numberOfDirectory = 0;
      List<string> result = new List<string>();
      List<string> pathesOfDirectories = Directory.GetDirectories(directoryPath).ToList();
      pathesOfFiles = Directory.GetFiles(directoryPath).ToList();

      result.AddRange(GetInformationAboutFilesInDirectory(directoryPath));
      while (pathesOfDirectories.Count != 0 && numberOfDirectory < pathesOfDirectories.Count)
      {
        result.AddRange(GetFullInformationAboutDirectory(pathesOfDirectories[numberOfDirectory]));
        numberOfDirectory++;
      }
      return result;
    }

    private List<string> GetInformationAboutFilesInDirectory(string directoryPath)
    {
      int numberOfFile = 0;
      List<string> result = new List<string>();
      while (numberOfFile < pathesOfFiles.Count)
      {
        result.Add(GetInformationAboutFile(numberOfFile));
        numberOfFile++;
      }
      return result;
    }

    private string GetInformationAboutFile(int numberOfFile)
    {
      StringBuilder result = new StringBuilder();
      FileInfo fileInfo = new FileInfo(pathesOfFiles[numberOfFile]);
      result.Append("Path of file :");
      result.Append(pathesOfFiles[numberOfFile]).Append(",");
      result.Append("Creation time of file :");
      result.Append(File.GetCreationTime(pathesOfFiles[numberOfFile])).Append(", ");
      result.Append("Size of file : ");
      result.Append(fileInfo.Length).Append(" bytes");
      return result.ToString();
    }
  }
}
