using System;
using NUnit.Framework;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Tests of registration on web site.
  /// </summary>
  [TestFixture]
  class RegistrationTests : TestBase
  {
    private IWebDriver webDriver;
    private RegisterPage registerPage;
    private string userName;
    private string password;
    private string email;

    
    [Test]
    public void PositiveTestRegistration()
    {
      email = GetRandomString(10) + "@mail.com";
      registerPage = new RegisterPage(webDriver);
      registerPage.Open();
      registerPage.TypeUserName(userName);
      registerPage.TypeEmail(email);
      registerPage.TypePassword(password);
      registerPage.TypeRepeatPassword(password);
      registerPage.ClickAddUserButton();
      IWebElement alertElement = webDriver.FindElement(By.XPath("//p[@id = 'wppb_form_success_message']/strong"));
      Assert.AreEqual(alertElement.Text.ToString(), "The account " + userName +" has been successfully created!");
      
    }

    [Test]
    public void NegativeTestRegistrationWithDifferentPasswordAndRepeatPasswordValues()
    {
      email = GetRandomString(10) + "@mail.com";
      registerPage = new RegisterPage(webDriver);
      registerPage.Open();
      registerPage.TypeUserName(userName);
      registerPage.TypePassword(password);
      registerPage.TypeEmail(email);
      registerPage.TypeRepeatPassword(GetRandomString(5));
      registerPage.ClickAddUserButton();
      System.Threading.Thread.Sleep(10000);
      IWebElement alertElement = webDriver.FindElement(By.XPath("//p[@id = 'wppb_general_top_error_message']/strong"));
      Assert.AreEqual(alertElement.Text.ToString(), "There was an error in the submitted form");      
    }

    [SetUp]
    public void beforeTest()
    {
      webDriver = new ChromeDriver();
      random = new Random();
      webDriver.Manage().Window.Maximize();
      userName = GetRandomString(10);
      password = GetRandomString(10);
    }
  }
}
