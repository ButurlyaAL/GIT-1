using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Representation of login page.
  /// </summary>
  class LoginPage : PageBase
  {
    private string url = "http://localhost:8083/?page_id=31";
    private IWebDriver webDriver;

    [FindsBy(How = How.XPath, Using = "//*[text()='Username or Email']/following-sibling::input")]
    public IWebElement userNameOrEmailTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//*[text()='Password']/following-sibling::input")]
    public IWebElement passwordTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//input[@value='Log In']")]
    public IWebElement loginButton { get; set; }

    /// <summary>
    /// Constructor.
    /// </summary>
    /// <param name="webDriver">Instance of WebDriver.</param>
    public LoginPage(IWebDriver webDriver) : base(webDriver)
    {
      this.webDriver = webDriver;
      PageFactory.InitElements(this.webDriver, this);   
    }

    public override string URL
    {
      get
      {
        return this.url;
      }

      set
      {
        this.url = value;
      }
    }

    /// <summary>
    /// Sends keys to userNameOrEmailTextField.
    /// </summary>
    /// <param name="userNameOrEmail">Keys to send.</param>
    public void TypeUserNameOrEmail(string userNameOrEmail)
    {
      userNameOrEmailTextField.SendKeys(userNameOrEmail);
    }

    /// <summary>
    /// Sends keys to passwordTextField.
    /// </summary>
    /// <param name="password">Keys to send.</param>
    public void TypePassword(string password)
    {
      passwordTextField.SendKeys(password);
    }

    /// <summary>
    /// Clicks loginButton.
    /// </summary>
    public void ClickLoginButton()
    {
      loginButton.Click();
    }
  }
}
