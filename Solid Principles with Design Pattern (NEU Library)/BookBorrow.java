public class BookBorrow implements Library
{
    private String bookTitle;

    public BookBorrow(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrowResource(String studName)
    {
        System.out.println("Student name: " + studName +
                           "\nBook title: " + bookTitle);
    }
}