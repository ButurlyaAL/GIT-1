using NUnit.Framework;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Test of landing page of the site.
  /// </summary>
  class LangingPageTests : TestBase
  {
    private IWebDriver webDriver;
    private LandingPage landingPage;
    private string userName;
    private string password;
    private string email;

    [Test]
    public void TestJumpToRegistePage()
    {

      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickRegisterAsSuscriberPageButton();
      IWebElement entryTitle = webDriver.FindElement(By.XPath("//h1[@class = 'entry-title']"));
      Assert.AreEqual(entryTitle.Text.ToString(), "Register as suscriber.");
    }

    [Test]
    public void TestJumpToMyPhotosPage()
    {
      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickMyPhotosPageButton();
      IWebElement entryTitle = webDriver.FindElement(By.XPath("//h1[@class = 'entry-title']"));
      Assert.AreEqual(entryTitle.Text.ToString(), "My photos.");
    }

    [Test]
    public void TestJumpToLogInPage()
    {
      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickLoginPageButton();
      IWebElement entryTitle = webDriver.FindElement(By.XPath("//h1[@class = 'entry-title']"));
      Assert.AreEqual(entryTitle.Text.ToString(), "Log In");
    }

    [Test]
    public void TestJumpToAboutMePage()
    {

      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickAboutMePageButton();
      IWebElement entryTitle = webDriver.FindElement(By.XPath("//h1[@class = 'entry-title']"));
      Assert.AreEqual(entryTitle.Text.ToString(), "About me");
    }

    [Test]
    public void TestJumpToCommentPost()
    {
      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.ClickCommentLink();
      Assert.IsTrue(IsElementOnPage("//div[@id = 'respond']"));
    }

    [Test]
    public void TestLoginWithVidget()
    {
    
      landingPage = new LandingPage(webDriver);
      landingPage.Open();
      landingPage.TypeUserNameOrEmail("uuu");
      landingPage.TypePassword("1111");
      landingPage.ClickLoginButton();
      IWebElement alertElement = webDriver.FindElement(By.XPath("//h3[@class = 'widget-title']/following-sibling::p[1]"));
      Assert.IsTrue(alertElement.Text.ToString().Contains("You are currently logged in as uuu. "));
    }

    [SetUp]
    public void BeforeTest()
    {
      webDriver = new ChromeDriver();
    }

    /// <summary>
    /// Checks if element locates on page.
    /// </summary>
    /// <param name="xpath">Xpath of element.</param>
    /// <returns>True if element locates on page;otherwise false.</returns>
    public bool IsElementOnPage(string xpath)
    {
      try
      {
        this.webDriver.FindElement(By.XPath(xpath));
        return true;
      }
      catch (NoSuchElementException e)
      {
        return false;
      }
    }
  }
}