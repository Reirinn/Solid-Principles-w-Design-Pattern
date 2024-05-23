public class Student
{
    private String studName;

    public Student(String studName)
    {
        this.studName = studName;
    }

    public String getStudentName()
    {
        return studName;
    }

    public void setStudentName(String studName)
    {
        this.studName = studName;
    }

    void borrowResource( Library resource)
    {
        resource.borrowResource(this.getStudentName());
    }
}