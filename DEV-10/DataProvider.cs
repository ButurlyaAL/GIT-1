using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DEV_10
{
  /// <summary>
  /// Creates double arrays.
  /// </summary>
  class DataProvider
  {
    private Random random;

    /// <summary>
    /// Makes data provider.
    /// </summary>
    public DataProvider()
    {
      random = new Random();
    }

    private double[] CreateRandomArray(int size)
    {
      double[] result = new double[size];
      for (int i = 0; i < size; i++)
      {
        result[i] = random.NextDouble();
      }
      return result;
    }

    /// <summary>
    /// Creates list of random double arrays.
    /// </summary>
    /// <param name="number">Number of arrays.</param>
    /// <param name="size">Size of arrays</param>
    /// <returns>List of double arrays;</returns>
    public List<double[]> CreateListOfRandomArrays(int number,int size)
    {
      List<double[]> result = new List<double[]>();
      for (int i = 0; i < number; i++)
      {
        result.Add(this.CreateRandomArray(size));
      }
      return result;
    }
  }
}
