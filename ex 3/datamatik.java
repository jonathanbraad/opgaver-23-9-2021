public class datamatik 
{

public static void main(String[] args) 
{
teacher teacher1 = new teacher("Thomas", 30, false);
student student1 = new student("Jonathan", 21, false, 5);
student student2 = new student("Andreas", 22, false, 5);

System.out.println("Teacher: " + teacher1.Name);
System.out.println("Student 1: " + student1.Name + " Is from team " + student1.datamatikerTeam);
System.out.println("Student 2: " + student2.Name + " Is from team " + student2.datamatikerTeam);
}


}