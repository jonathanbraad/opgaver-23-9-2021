public class arrays
{
static int count = 0;
static int sum = 0;
static int average = 0;
static int[] intArray = new int[]{1, 2, 3};
static String[] stringArray = new String[]{"one", "two", "three"};
static boolean[] booleanArray = new boolean[]{true, false, true};


static void printString(String[] StringArrayParameter) {

	for (int i = 0; i < 3; i++)
	{
		System.out.println(StringArrayParameter[i]);
	}

}


static void printInt(int[] intArrayParameter) {

	for (int i = 0; i < 3; i++)
	{
		System.out.println(intArrayParameter[i]);
	}

}

static void getAverage(int[] intArrayParameter) {

	for (int i = 0; i < 3; i++)
	{
		count = count + 1;
		sum = sum + intArrayParameter[i];
	}
average = sum/count;
System.out.println(average);
}

public static void main(String[] args) 
{

printInt(intArray);
printString(stringArray);
getAverage(intArray);

}



}