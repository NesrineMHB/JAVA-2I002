import java.util.ArrayList;
public abstract class Liste
{
	protected ArrayList<Object> liste ;

	public Liste()
	{
		 liste=new ArrayList<Object> ();// o, ecrit pas ArrayList<Object> liste=new ArrayList<Object> (); car on veut juste initialier liste
	}
	public boolean isEmpty()
	{
		if(liste.size()==0)return true;
		else return false;
	}
	public int size()
	{	return liste.size();
		
	}
	public void push(Object o)
	{
		liste.add(o);
	}
	
}
