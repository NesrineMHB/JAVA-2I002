public class TestHisto{

	public static void main(String[] args) {
		int [] tab=new int[150];
		for (int i=0;i<tab.length;i++)
			tab[i]=(int )(Math.random()*21);
		Histo h1= new Histo(tab);
		h1.afficheHistogrammeTableau();
		h1.afficheHistogramme();	
}}
