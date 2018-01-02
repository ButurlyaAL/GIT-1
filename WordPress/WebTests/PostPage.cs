using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium;

namespace WebTests
{
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

    public PostPage(IWebDriver webDriver) : base(webDriver)
    {
      this.webDriver = webDriver;
      PageFactory.InitElements(this.webDriver, this);
    }

    public void ClickPreviousPostButton()
    {
      previousPostButton.Click();
    }

    public void ClickNextPostButton()
    {
      nextPostButton.Click();
    }

    public void TypeComment(string comment)
    {
      commentTextField.SendKeys(comment);
    }

    public void TypeName(string name)
    {
      nameTextField.SendKeys(name);
    }

    public void TypeEmail(string email)
    {
      emailTextField.SendKeys(email);
    }

    public void ClickPostCommentButton()
    {
      postCommentButton.Click();
    }

  }
}
