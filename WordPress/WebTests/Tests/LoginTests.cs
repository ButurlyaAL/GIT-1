using NUnit.Framework;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Tests login to the site.
  /// </summary>
  class LoginTests
  {
    private IWebDriver webDriver;
    private LoginPage loginPage;

    [Test]
    public void LoginTestPositive()
    {
      loginPage.Open();
      loginPage.TypeUserNameOrEmail("uuu");
      loginPage.TypePassword("1111");
      loginPage.ClickLoginButton();
      IWebElement alertElement = webDriver.FindElement(By.XPath("//p[@class='wppb-alert']/strong"));
      Assert.True(alertElement.Text.ToString().Contains("You are currently logged in as uuu. "));
    }

    [SetUp]
    public void beforeTest()
    {
      webDriver = new ChromeDriver();
      loginPage = new LoginPage(webDriver);
    }

  }
}
