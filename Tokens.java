import java.util.StringTokenizer;
class Tokens
{
	public static void main(String args[])
	{
		String s1="Mohan ,Das:Karam,Chand,Gandhi";
		StringTokenizer st = new StringTokenizer (s1,",:");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			String t=st.nextToken();
			System.out.println(t);
		}
	}
}