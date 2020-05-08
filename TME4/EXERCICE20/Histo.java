public class Histo{
	private int[]hist;

	public Histo(){
		hist=new int[21];
	}
	public void ajouteNote(int note){
		hist[note]++;
	}

	public Histo(int [] tab){
			this();
			//hist=new int[21];// on l'a instancier prsk on est dans un nv constructeur
			for (int j=0;j<tab.length;j++){
				//hist[tab[j]]++;
				ajouteNote(tab[j]);
				
			}
	}

	public void afficheHistogrammeTableau(){
		for (int i=0;i<hist.length;i++)
			System.out.println(hist[i]);
	}

	public void afficheHistogramme(){
		for (int i=0;i<hist.length;i++){
			System.out.print(i+"|");
			for (int j=0;j<hist[i];j++)
			System.out.print("*");
			System.out.print("\n");
		
		}
	}}
		
