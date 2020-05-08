import java.util.ArrayList;
public class ListeLIFO extends Liste 
{	
	public ListeLIFO()
	{
		super();
	}
	public Object pop()/// OBJECT !== DE LISTE
	{	
		int taille= super.size();
	         liste.remove(taille-1);
		return liste;
	}
}
