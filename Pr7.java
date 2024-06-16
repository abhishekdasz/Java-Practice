class Student 
{
    private String name;
    private int rollNo;


    public void setName(String n)
    {
        name = n;
    }
    public void getName()
    {
        System.out.println(name);
    }



    public void setRollNo(int r)
    {
        rollNo = r;
    }
    public int getRollNo()
    {
        return rollNo;
    }
}
public class Pr7 
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        s.setName("Abhishek");
        s.getName();

        s.setRollNo(29);
        System.out.println(s.getRollNo());

    }    
}
