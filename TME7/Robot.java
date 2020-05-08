
public abstract class Robot
{
	private int i,j;
	private static int num=-1;
	
	public Robot(int i , int j)
	{	num++;
		this.i=i;
		this.j=j;
	}
	protected void move(di, dj) 
	{
		i+=di;
		j+=dj;
	}
	
	int getNum(){ return num;}
	public abstract void move(Monde m) ;
	public abstract void action(Monde m) ;

}
