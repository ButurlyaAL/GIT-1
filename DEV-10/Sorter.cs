using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_10
{

  /// <summary>
  /// Sorts arrays.
  /// </summary>
  class Sorter
  {

    /// <summary>
    /// Bubble sort.
    /// </summary>
    /// <param name="array">Array to sort</param>
    /// <returns>Sorted array.</returns>
    public double[] BubbleSort(double[] array)
    {
      double value = 0;
      bool count = true;
      while (count)
      {
        count = false;
        for (int i = 0; i < array.Length - 1; i++)
        {
          if (array[i] > array[i + 1])
          {
            value = array[i];
            array[i] = array[i + 1];
            array[i + 1] = value;
            count = true;
          }
        }
      }
      return array;
    }

    /// <summary>
    /// Merge sort.
    /// </summary>
    /// <param name="array">Array to sort.</param>
    /// <returns>Sorted array.</returns>
    public List<double> MergeSort(List<double> array)
    {
      if (array.Count == 1)
      {
        return array;
      }
      List<double> left = new List<double>();
      List<double> right = new List<double>();
      int middle = array.Count / 2;
      for (int i = 0; i < middle; i++)
      {
        left.Add(array[i]);
      }
      for (int i = middle; i < array.Count; i++)
      {
        right.Add(array[i]);
      }
      return Merge(MergeSort(left), MergeSort(right));
    }

    private List<double> Merge(List<double> left, List<double> right)
    {
      int leftCount = 0;
      int rightCount = 0;
      List<double> result = new List<double>();
      while (leftCount < left.Count && rightCount < right.Count)
      {
        if (left[leftCount].CompareTo(right[rightCount]) < 0)
        {
          result.Add(left[leftCount]);
          leftCount++;
        }
        else
        {
          result.Add(right[rightCount]);
          rightCount++;
        }
      }
      if (right.Count > rightCount)
      {
        for (int i = rightCount; i < right.Count; i++)
        {
          result.Add(right[i]);
        }
      }
      else
      {
        for (int i = leftCount; i < left.Count; i++)
        {
          result.Add(left[i]);
        }
      }
      return result;
    }
  }
}
