using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace DEV_10
{

  /// <summary>
  /// Combines arrays.
  /// </summary>
  class CombinerOfArrays
  {
    private Sorter sorter;

    /// <summary>
    /// Creates combiner of arrays.
    /// </summary>
    public CombinerOfArrays()
    {
      sorter = new Sorter();
    }

    /// <summary>
    /// Returns array with elements wich repeated more than once in different arrays.
    /// </summary>
    /// <param name="listOfArrays">Arrays to combine.</param>
    /// <returns>Returns array with elements wich repeated more than twice.</returns>
    public double[] GetUnionOfArrays(List<double[]> listOfArrays)
    {
      List<double> result = new List<double>();
      for (int i = 0; i < listOfArrays.Count; i++)
      {
        listOfArrays[i] = this.GetSortedArrayWhithoutRepeat(listOfArrays[i]);
        result.AddRange(listOfArrays[i]);
      }
      return this.GetRepeatedElements(sorter.MergeSort(result).ToArray<double>());
    }

    /// <summary>
    /// Returns array with elements wich repeated more than once in the array.
    /// </summary>
    /// <param name="array">Source array.</param>
    /// <returns>Array with elements wich repeated more than once in the array.</returns>
    public double[] GetRepeatedElements(double[] array)
    {
       List<double> result = new List<double>();
       if (array.Length == 1)
       {
         return array;                                       
       }
       for (int i = 0; i < array.Length - 1; i ++)
       {                
         if(this.CompareDoubles(array[i], array[i + 1]) && !result.Contains(array[i]))
         {
           result.Add(array[i]);     
         }
       }
       if (this.CompareDoubles(array[array.Length - 1],array[array.Length - 2]) && !result.Contains(array[array.Length - 1]))
       {
         result.Add(array[array.Length - 1]);
       }
       return result.ToArray<double>();
     }
    
    /// <summary>
    /// Returns array without repeated elements.
    /// </summary>
    /// <param name="sortedArray">Source array.</param>
    /// <returns>Array without repeated elements.</returns>
    public double[] GetSortedArrayWhithoutRepeat(double[] array)
    {
      List<double> result = sorter.MergeSort(array.ToList<double>());
      if (array.Length == 1)
      {
        return array;
      }

      for (int i = 0; i < result.Count - 1; i++)
      {
        if (this.CompareDoubles(result[i], result[i + 1]))
        {
          result.Remove(result[i + 1]);
        }
      }
      return result.ToArray<double>();
    }

    /// <summary>
    /// Return the result of compare to double values.
    /// </summary>
    /// <param name="x">First value</param>
    /// <param name="y">Second value</param>
    /// <returns>True if x equals to y;false otherwise</returns>
    public bool CompareDoubles(double x, double y)
    {
      double eps = Math.Min(x, y) * 10e-20;
      if (Math.Abs(x - y) < eps)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
  }
}
