using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Task_3.Tests
{
  [TestClass]
  public class AutoTests
  {
    [TestMethod]
    [ExpectedException(typeof(ArgumentException))]
    public void TestAutoConstructorOnInvalidStringArguments()
    {
      Auto auto = new Auto("/45", "[]", "5678", 2.4);
    }

    [TestMethod]
    [ExpectedException(typeof(ArgumentException))]
    public void TestAutoConstructorOnInvaliDoubleArgument()
    {
      Auto auto = new Auto("mark", "model", "price", -2.4);
    }

    [TestMethod]
    public void TestCompareToWithDifferentTypeButWithSamePrice()
    {
      Auto firstAuto = new Auto("mark", "model", "a", 3000);
      Auto secondAuto = new Auto("mark", "model", "b", 3000);
      Assert.IsTrue(firstAuto.CompareTo(secondAuto) < 0);
    }

    [TestMethod]
    public void TestCompareToWithDifferentMarkButWithSameType()
    {
      Auto firstAuto = new Auto("e", "model", "a", 3000);
      Auto secondAuto = new Auto("w", "model", "a", 3000);
      Assert.IsTrue(firstAuto.CompareTo(secondAuto) < 0);
    }

    [TestMethod]
    public void TestCompareToWithDifferentMarkAndWithDifferentModel()
    {
      Auto firstAuto = new Auto("e", "t", "a", 3000);
      Auto secondAuto = new Auto("w", "b", "a", 3000);
      Assert.IsFalse(firstAuto.CompareTo(secondAuto) > 0);
    }

    [TestMethod]
    public void TestCompareToWithDifferentTypeAndWithDifferentMark()
    {
      Auto firstAuto = new Auto("a", "t", "b", 3000);
      Auto secondAuto = new Auto("b", "b", "a", 3000);
      Assert.IsFalse(firstAuto.CompareTo(secondAuto) < 0);
    }

    [TestMethod]
    public void TestCompareToWithDifferentPrice()
    {
      Auto firstAuto = new Auto("a", "t", "b", 2345);
      Auto secondAuto = new Auto("b", "b", "a", 3000);
      Assert.IsFalse(firstAuto.CompareTo(secondAuto) > 0);
    }
  }
}
