using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium;

namespace WebTests
{

  /// <summary>
  /// Representation of post page.
  /// </summary>
  class PostPage : PageBase
  {
    private IWebDriver webDriver;

    [FindsBy(How = How.XPath, Using = "//a[text()=' Previous']")]
    public IWebElement previousPostButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//a[text()=' Next']")]
    public IWebElement nextPostButton { get; set; }

    [FindsBy(How = How.XPath, Using = "//label[text()='Comment']/following-sibling::textarea[1]")]
    public IWebElement commentTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//label[text()='Name ']/following-sibling::input[1]")]
    public IWebElement nameTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//label[text()='Email ']/following-sibling::input[1]")]
    public IWebElement emailTextField { get; set; }

    [FindsBy(How = How.XPath, Using = "//input[@value = 'Post Comment']")]
    public IWebElement postCommentButton { get; set; }

    /// <summary>
    /// Constructor.
    /// </summary>
    /// <param name="webDriver">Instance of WebDriver</param>
    public PostPage(IWebDriver webDriver) : base(webDriver)
    {
      this.webDriver = webDriver;
      PageFactory.InitElements(this.webDriver, this);
    }

    /// <summary>
    /// Clicks button previous post.
    /// </summary>
    public void ClickPreviousPostButton()
    {
      previousPostButton.Click();
    }

    /// <summary>
    /// Clicks button next post.
    /// </summary>
    public void ClickNextPostButton()
    {
      nextPostButton.Click();
    }

    /// <summary>
    /// Types comment content.
    /// </summary>
    /// <param name="comment">Comment content.</param>
    public void TypeComment(string comment)
    {
      commentTextField.SendKeys(comment);
    }

    /// <summary>
    /// Types name to nameTextField.
    /// </summary>
    /// <param name="name">Name to type.</param>
    public void TypeName(string name)
    {
      nameTextField.SendKeys(name);
    }

    /// <summary>
    /// Types email to emailTextField.
    /// </summary>
    /// <param name="email">Email to type.</param>
    public void TypeEmail(string email)
    {
      emailTextField.SendKeys(email);
    }

    /// <summary>
    /// Clicks post comment button.
    /// </summary>
    public void ClickPostCommentButton()
    {
      postCommentButton.Click();
    }
  }
}
