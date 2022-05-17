public class DMassignment
{
	public static void main(String args[])
	{
		int a=0;
		while(a<=25)
		{
			System.out.println(a);
			a=a+5;
		}

		int b=100;
		while(b>=50)
		{
			System.out.println(b);
			b=b-10;
		}

		float c=1.0f;
		while(c<=2.0f)
		{
			System.out.println(c);
			c=c+0.1f;
		}

		char d='a';
		do
		{
			System.out.println(d);
			d++;
		}while(d<='e');

		int e=5;
		int sum=0;
		do
		{
			sum=sum+e;
			System.out.println(e);
			e=e+5;
		}while(e<=50);

		int f=100;
		int subt=5;
		do
		{
			f=f-subt;
			System.out.println(f);
		}while(f>50);

		int i;
		int factorial=1;
		int num=5;
		for(i=1;i<=num;i++)
		{
			factorial=factorial*i;
			System.out.println(factorial);
		}
		System.out.println("factorial of "+num+" is "+factorial);
		int j=1;
		for(j=1;j<=8;j++)
		{
			if(j%2!=0)
			System.out.println("Hello World");
			if(j%2==0)
			System.out.println("its me DiscoMolvi");
		}
		int k=1;
		for(k=1;k<=8;k++)
		{
			if(k%2!=0)
			System.out.println("3rd Assinment was fun,");
			if(k%2==0)
			System.out.println("Took me almost 2 hours (-_-)");
		}
	}
}