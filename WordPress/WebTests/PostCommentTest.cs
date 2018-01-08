using System;
using NUnit.Framework;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Tests ability to post comments.
  /// </summary>
  class PostCommentTest : TestBase
  {
    private IWebDriver webDriver;
   
    private LandingPage landingPage;
    private PostPage postPage;
    private string commentContent;
    private string name;
    private string email;

    [Test]
    public void TestCommentPostPositive()
    {
      email = GetRandomString(10) + "@mail.com";
      postPage.TypeComment(commentContent);
      postPage.TypeName(name);
      postPage.TypeEmail(email);
      postPage.ClickPostCommentButton();
      IWebElement commentElement = webDriver.FindElement(By.XPath("//div[@class = 'comment-content']/p"));
      Assert.AreEqual(commentElement.Text.ToString(), commentContent);
    }

    [Test]
    public void TestCommentPostWithWrongEmail()
    {
      email = GetRandomString(10);
      postPage.TypeComment(commentContent);
      postPage.TypeName(name);
      postPage.TypeEmail(email);
      postPage.ClickPostCommentButton();
      IWebElement errorElement = webDriver.FindElement(By.XPath("//body/p[2]"));
      Assert.AreEqual(errorElement.Text.ToString(), "ERROR: please enter a valid email address.");
    }

    [SetUp]
    public void SetUp()
    {    
      webDriver = new ChromeDriver();
      random = new Random();
      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickPageOfPOstLink();
      postPage = new PostPage(webDriver);
      commentContent = GetRandomString(20);
      name = GetRandomString(10);
    }
  }
}
