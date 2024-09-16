public class TryArrays
{
	public static void main(String[] args)
	{
		// Array Tutorial
		// chartAt
		// VariableName.charAt(int index)
		
		String str = "Hello World!";
		char ans1 = str.charAt(0);
		System.out.println(ans1);
		
		// codePointAt
		// VariableName.codePointAt(int index)
		
		int ans2 = str.codePointAt(0);
		System.out.println(ans2);
		
		// VariableName.codePointBefore(int index)
		ans2 = str.codePointBefore(1);
		System.out.println(ans2);
		
		//codePointCount
		// VariableName.codePointCount(int startindex, int endindex)
		int ans3 = str.codePointCount(0, 5);
		System.out.println(ans3);
		ans3 = str.codePointCount(4, 8);
		System.out.println(ans3);	
	}

}