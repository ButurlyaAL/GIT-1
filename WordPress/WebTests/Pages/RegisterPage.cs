using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Representation of register page.
  /// </summary>
  class RegisterPage : PageBase
  {
    private IWebDriver webDriver;
    private string url = "http://localhost:8083/?page_id=29";

    [FindsBy(How = How.XPath, Using = "//*[text()='Username']/following-sibling::input")]
    public IWebElement userNameTextField { get; private set; }

    [FindsBy(How = How.XPath, Using = "//*[text()='E-mail']/following-sibling::input")]
    public IWebElement emailTextField { get; private set; }

    [FindsBy(How = How.XPath, Using = "//*[text()='Password']/following-sibling::input")]
    public IWebElement passwordTextField { get; private set; }

    [FindsBy(How = How.XPath, Using = "//*[text()='Repeat Password']/following-sibling::input")]
    public IWebElement repeatPasswordlTextField { get; private set; }

    [FindsBy(How = How.XPath, Using = "//input[@value='Register']")]
    public IWebElement addUserButton { get; private set; }


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
    /// Construtor.
    /// </summary>
    /// <param name="webDriver">Instance of WebDriver.</param>
    public RegisterPage(IWebDriver webDriver) : base(webDriver)
    {
      this.webDriver = webDriver;
      PageFactory.InitElements(this.webDriver, this);
    }

    /// <summary>
    /// Sends keys to userNameTextField.
    /// </summary>
    /// <param name="userName">Keys to send.</param>
    public void TypeUserName(string userName)
    {
      userNameTextField.SendKeys(userName);
    }

    /// <summary>
    /// Sends keys to emailTextField.
    /// </summary>
    /// <param name="email">Keys to send.</param>
    public void TypeEmail(string email)
    {
      emailTextField.SendKeys(email);
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
    /// Send keys to repeatPasswordTextField.
    /// </summary>
    /// <param name="password">Keys to send.</param>
    public void TypeRepeatPassword(string password)
    {
      repeatPasswordlTextField.SendKeys(password);
    }

    /// <summary>
    /// Clicks addUserButton.
    /// </summary>
    public void ClickAddUserButton()
    {
      addUserButton.Click();
    }
  }
}
