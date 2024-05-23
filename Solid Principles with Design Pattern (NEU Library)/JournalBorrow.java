public class JournalBorrow implements Library
{
    private String journalTitle;

    public JournalBorrow(String journalTitle)
    {
        this.journalTitle = journalTitle;
    }

    public String getJournalTitle()
    {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle)
    {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrowResource(String studName)
    {
        System.out.println("Student name: " + studName +
                           "\nJournal title: " + journalTitle);
    }
}