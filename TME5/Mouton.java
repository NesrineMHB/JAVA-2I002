public class Mouton {

	private static int cpt;
	private int id;

	public Mouton (){
		cpt++;
		id=cpt;	
	}
	public int getId(){
		return id;
	}

}
