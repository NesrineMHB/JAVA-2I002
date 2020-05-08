import java.util.ArrayList;
public class TestLIFO
{
	public static void main(String [] args)
		{	int i;
			ListeLIFO lf=new ListeLIFO();
			for (i=0;i<5;i++)
			{
				lf.push(i);
				//System.out.println(lf.get(i)); on doit definir la fonction get dans lf
			}

			System.out.println(lf.size());
			System.out.println(lf.pop());

		}
}
