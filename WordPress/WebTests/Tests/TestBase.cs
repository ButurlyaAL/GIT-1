using System;

namespace WebTests
{
  /// <summary>
  /// Representation of base test.
  /// </summary>
  class TestBase
  {
    protected Random random;

    /// <summary>
    /// Generates random string.
    /// </summary>
    /// <param name="length">Length of string to generate.</param>
    /// <returns>Random string</returns>
    public string GetRandomString(int length)
    {
      char[] result = new char[length];
      for (int i = 0; i < length; i++)
      {
        result[i] = ((char)random.Next(97, 123));
      }
      return new string(result);
    }
  }
}
