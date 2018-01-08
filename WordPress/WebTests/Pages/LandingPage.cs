using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Representation of landing page.
  /// </summary>
  class LandingPage : PageBase
  {
    private string url = "http://localhost:8083";
    private IWebDriver webDriver;

    [FindsBy(How = How.XPath, Using = "//a[text()='Home']")]
    public IWebElement homePageButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text()='About me']")]
    public IWebElement aboutMePageButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text()='Log In']")]
    public IWebElement loginPageButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text()='My photos.']")]
    public IWebElement myPhotosPageButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text()='Register as suscriber.']")]
    public IWebElement registerAsSuscriberPageButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//h1[@class = 'entry-title']/a[1]")]
    public IWebElement pageOfPostLink { get; set; }

    [FindsBy(How = How.XPath, Using = "//div[@class = 'comments-link']/a[1]")]
    public IWebElement commentLink { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text() = ' Older posts']")]
    public IWebElement olderPostsButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//span[text() = 'Leave a reply']")]
    public IWebElement leaveAReplyButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//label[text()='Username or Email']/following-sibling::input[1]")]
    public IWebElement userNameOrEmailTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//label[text()='Password']/following-sibling::input[1]")]
    public IWebElement passwordTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//input[@value='Log In']")]
    public IWebElement loginButton { get; set; }

    /// <summary>
    /// Contructor.
    /// </summary>
    /// <param name="webDriver">Instance of WebDriver.</param>
    public LandingPage(IWebDriver webDriver) : base(webDriver)
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

    /// <summary>
    /// Clicks homePageButton.
    /// </summary>
    public void ClickHomePageButton()
    {
      homePageButton.Click();
    }

    /// <summary>
    /// Clicks aboutMePageButton.
    /// </summary>
    public void ClickAboutMePageButton()
    {
      aboutMePageButton.Click();
    }

    /// <summary>
    /// Clicks myPhotosPageButton.
    /// </summary>
    public void ClickMyPhotosPageButton()
    {
      myPhotosPageButton.Click();
    }

    /// <summary>
    /// Clicks loginPageButton.
    /// </summary>
    public void ClickLoginPageButton()
    {
      loginPageButton.Click();
    }

    /// <summary>
    /// Clicks registerAsSuscriberPageButton.
    /// </summary>
    public void ClickRegisterAsSuscriberPageButton()
    {
      registerAsSuscriberPageButton.Click();
    }

    /// <summary>
    /// Clicks pageOfPostLink.
    /// </summary>
    public void ClickPageOfPOstLink()
    {
      pageOfPostLink.Click();
    }

    /// <summary>
    /// Clicks commentLink.
    /// </summary>
    public void ClickCommentLink()
    {
      commentLink.Click();
    }

    /// <summary>
    /// Clicks olderPostsButton.
    /// </summary>
    public void ClickOlderPostsButton()
    {
      olderPostsButton.Click();
    }

    /// <summary>
    /// Clicks leaveAReplyButton.
    /// </summary>
    public void ClickLeaveAReaplyButton()
    {
      leaveAReplyButton.Click();
    }
  }
}
