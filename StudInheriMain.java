package studentinheritance;

public class StudInheriMain
{
    public static void main (String args[])
    {
        Student st1=new Student(1,"Shruti",95);
        System.out.println("\n Roll No:" +st1.getRollno() + "\n Name:" +st1.getName() + "\n Marks:" +st1.getMarks());
        System.out.println("***************************");

        Student st2=new Student();
        st2.setRollno(2);
        st2.setName("Sachin");
        st2.setMarks(98);
        System.out.println("\n Roll No:" +st2.getRollno() + "\n Name:" +st2.getName() + "\n Marks:" +st2.getMarks());
        System.out.println("***************************");

        MtechStudent mst1=new MtechStudent(3,"Shiva", 94, 30, "Digital Communication");
        System.out.println("\n Roll No:" +mst1.getRollno() + "\n Name:" +mst1.getName() +
                "\n Marks:" + mst1.getMarks() + "\n Age:" +mst1.getAge() + "\n Specialization:" +mst1.getSpecializtion());
        System.out.println("***************************");

        MtechStudent mst2=new MtechStudent();
        System.out.println();
        System.out.println(mst2.supervar);//If both the super class and sub class having the same variable names like (Amit in
                                             // Super class and Amit in Sub Class also then to get the needed one we use the
                                                // supervar method (inside method:return super.supervar;)
       // System.out.println(st1.supervar);
        System.out.println(mst2.getSupervar());
        System.out.println("***************************");

    }
}
