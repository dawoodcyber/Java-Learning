
package pkgpackage;
class Book
{
    private String title;
    private String author;
    private int pubYear;
    public void setInfo(String t, String a, int pY)
    {
        this.title = t;
        this.author = a;
        this.pubYear = pY;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPubYear()
    {
        return pubYear;
    }
}
