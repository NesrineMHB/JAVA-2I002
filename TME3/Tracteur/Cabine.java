public class Cabine{
	private int volume;
	private String couleur;

	public  Cabine(int volume,String couleur){
		this.volume=volume;
		this.couleur=couleur;
	}
	public String toString(){
		return "la cabine et de couleur "+couleur+" et son volume est de :"+volume;
	}
	public void setCouleur(String couleur){
		this.couleur=couleur;
	}
	
	public Cabine copy(){
		return new Cabine(volume,couleur);	
}
}
