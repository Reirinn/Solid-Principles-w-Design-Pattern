public class TestProgram
{
    public static void main(String[] args)
    {
        Student stud1 = new Student("Ray");
        BookBorrow book = new BookBorrow("The Prisoner's Wife");

        stud1.borrowResource(book);

        System.out.println();

        Student stud2 = new Student("Izzy");
        JournalBorrow journal = new JournalBorrow("Journal in Computer Science");

        stud2.borrowResource(journal);


    }
}