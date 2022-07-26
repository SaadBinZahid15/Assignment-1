public class DMarray
{
	public static void main (String[] arg)
	{
		int[] s=new int[5];
		s[0]=10;
		s[1]=20;
		s[2]=30;
		s[3]=40;
		s[4]=50;
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);

		int[] l=new int[10];
		int a=5;
		for(int i=0;i<l.length;i++)
		{
			l[i]=a;
			a=a+5;
			System.out.println(l[i]);
		}
	}
}