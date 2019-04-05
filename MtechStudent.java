package studentinheritance;

public class MtechStudent extends Student
{
    private int age;
    private String Specializtion;

    public int supervar=100;

    public MtechStudent()
    {
    }

    public MtechStudent(int rollno, String name, int marks, int age, String specializtion)
    {
        super(rollno, name, marks);
        this.age = age;
        Specializtion = specializtion;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSpecializtion()
    {
        return Specializtion;
    }

    public void setSpecializtion(String specializtion)
    {
        Specializtion = specializtion;
    }

    public int getSupervar()
    {
        return super.supervar;
    }

}
