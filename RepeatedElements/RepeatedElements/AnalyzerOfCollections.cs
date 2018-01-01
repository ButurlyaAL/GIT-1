using System.Collections;

namespace RepeatedElements
{
  /// <summary>
  /// Analyzes collections on repeated elements.
  /// </summary>
  public class AnalyzerOfCollections
  {
    /// <summary>
    /// Returns count of repeated elements in collection.
    /// </summary>
    /// <param name="collection">Collection to analyze.</param>
    /// <returns>Count of Repeated elements.</returns>
    public int GetCountOfRepeatedElements(ArrayList collection)
    {
      if (collection.Count < 2)
      {
        return 0;
      }
      else if (collection.Count == 2)
      {
        if (collection[0].Equals(collection[1]))
        {
          return 1;
        }
        else
        {
          return 0;
        }
      }
      int count = 0;
      collection.Sort();
      for (int i = 1; i < collection.Count - 1; i++)
      {
        if (collection[i].Equals(collection[i - 1]) && !collection[i].Equals(collection[i + 1]))
        {
          count++;    
        }
      }
      if (collection[collection.Count - 1].Equals(collection[collection.Count - 2]))
      {
        count++;
      }
      return count;
    }
  }
}
