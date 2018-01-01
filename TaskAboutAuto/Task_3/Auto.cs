using System;
using System.Text;
using System.Text.RegularExpressions;

namespace Task_3
{
  /// <summary>
  /// Representation of auto.
  /// </summary>
  public class Auto : IComparable
  {
    public string mark { get; private set; }
    public string model { get; private set; }
    public string type { get; private set; }
    public double price { get; private set; }

    /// <summary>
    /// Creates an instance of Auto.
    /// </summary>
    /// <param name="mark">Mark of auto</param>
    /// <param name="model">Model of auto</param>
    /// <param name="type">Type of auto</param>
    /// <param name="price">Price of auto</param>
    public Auto(string mark, string model, string type, double price)
    {
      if (verify(mark, model, type, price))
      {
        this.mark = mark;
        this.model = model;
        this.type = type;
        this.price = price;
      }
      else
      {
        throw new ArgumentException();
      }
    }

    private bool verify(string mark, string model, string type, double price)
    {
      return (isCorrect(mark) && isCorrect(type) && isCorrect(model)) && priceIsPositive(price);
    }

    private bool isCorrect(String value)
    {
      return !Regex.IsMatch(value, "^(\\d*|\\W*)$");
    }

    private bool priceIsPositive(double price)
    {
      return price > 0;
    }

    /// <summary>
    /// Returns a string that represents the current object.
    /// </summary>
    /// <returns>String that represents the current object.</returns>
    public override string ToString()
    {
      StringBuilder result = new StringBuilder();
      result.Append("Mark :").Append(mark).AppendLine();
      result.Append("Model :").Append(model).AppendLine();
      result.Append("Type :").Append(type).AppendLine();
      result.Append("Price :").Append(price).AppendLine();
      return result.ToString();
    }

    /// <summary>
    /// Compares the current instance with another object.
    /// </summary>
    /// <param name="obj">An object to compare with current instance.</param>
    /// <returns>Integer value that indicates the relative order of the object being compared.</returns>
    public int CompareTo(object obj)
    {
      Auto otherAuto = null;
      if (obj is Auto)
      {
        otherAuto = (Auto)obj;
      }
      else
      {
        throw new ArgumentException();
      }

      if (!this.price.Equals(otherAuto.price))
      {
        return this.price.CompareTo(otherAuto.price);
      }
      else if (!this.type.Equals(otherAuto.type) && this.price.Equals(otherAuto.price))
      {
        return this.type.CompareTo(otherAuto.type);
      }
      else if (!this.mark.Equals(otherAuto.mark) && this.type.Equals(otherAuto.type) && this.price.Equals(otherAuto.price))
      {
        return this.mark.CompareTo(otherAuto.mark);
      }          
      return this.model.CompareTo(otherAuto.model);                    
    }
  }
}