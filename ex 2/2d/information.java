public class information {
	
	public String UppercaseText;
	public boolean firstLetterUppercase;

	public information(String tempText) {
		if (Character.isUpperCase(tempText.charAt(0)))
		{
			this.firstLetterUppercase = true;
		}
		else
		{
			this.firstLetterUppercase = false;
		}

	}

}