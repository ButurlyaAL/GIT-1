using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;];
using NUnit.Framework;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Test of landing page of the site.
  /// </summary>
  class PostPageTests : TestBase
  {
    private IWebDriver webDriver;
    private LoginPage loginPage;

    [Test]
    public void TestPreviousPostsButtonPositive()
    {
      
    }

    [Test]
    public void TestNextPostsButtonPositive()
    {

    }

    [SetUp]
    public void beforeTest()
    {
      
    }
  }
}
