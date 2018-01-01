using System.Collections;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace RepeatedElements.Tests
{
  [TestClass]
  public class AnalyzerOfCollectionTests
  {
    private AnalyzerOfCollections analyzerOfCollections = new AnalyzerOfCollections();

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnDoubleValues()
    {
      ArrayList collection = new ArrayList() { 0.335000, 0.123, 0.3350000001, 0.12300};
      Assert.AreEqual(1, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnIntegerValues()
    {
      ArrayList collection = new ArrayList() { 1, 2, 4, 2, 1 };
      Assert.AreEqual(2, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnStrings()
    {
      ArrayList collection = new ArrayList() { "", "alexey", "*DF", " ", "*DF"};
      Assert.AreEqual(1, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnChars()
    {
      ArrayList collection = new ArrayList() { '/', 'a', '*', ' ', '*' };
      Assert.AreEqual(1, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnEmptyCollection()
    {
      ArrayList collection = new ArrayList();
      Assert.AreEqual(0, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnCollectioWitOneElement()
    {
      ArrayList collection = new ArrayList() {"*"};
      Assert.AreEqual(0, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }


    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnCollectioWitOnlyRepeatedElements()
    {
      ArrayList collection = new ArrayList() {"*", "*", "*", "*"};
      Assert.AreEqual(1, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnCollectioWitOnlyNotRepeatedElements()
    {
      ArrayList collection = new ArrayList() {"*", "k", "i", "%"};
      Assert.AreEqual(0, analyzerOfCollections.GetCountOfRepeatedElements(collection));
    }

    [TestMethod]
    public void TestGetCountOfRepeatedElementsOnCollectioWithTwoElements()
    {
      ArrayList firstCollection = new ArrayList() {"*", "k"};
      ArrayList secondCollection = new ArrayList() {"*", "*" };
      Assert.AreEqual(0, analyzerOfCollections.GetCountOfRepeatedElements(firstCollection));
      Assert.AreEqual(1, analyzerOfCollections.GetCountOfRepeatedElements(secondCollection));
    }
  }
}
