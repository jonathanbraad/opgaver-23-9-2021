public class datamatik 
{

static student[] studentArray = new student[10];

public static void main(String[] args) 
{

	for (int i = 0; i <= studentArray.length; i++)
	{

	studentArray[i].studentID = i;

	}

	System.out.println(studentArray[7].studentID);

}


}