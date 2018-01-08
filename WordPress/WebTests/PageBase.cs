using OpenQA.Selenium;

namespace WebTests
{
  /// <summary>
  /// Representation of base page.
  /// </summary>
  class PageBase
  {
    private string url;
    private IWebDriver webDriver;

    /// <summary>
    /// Constructor.
    /// </summary>
    /// <param name="webDriver"></param>
    public PageBase(IWebDriver webDriver)
    {
      this.webDriver = webDriver;
    }

    /// <summary>
    /// Opens page.
    /// </summary>
    public virtual void Open()
    {
      webDriver.Navigate().GoToUrl(this.URL);
    }

    public virtual string URL
    {
      get
      {
        return url;
      }
      set
      {
        url = value;
      }
    }
  }
 }

