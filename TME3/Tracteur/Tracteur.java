public class Tracteur{
	Roue r1,r2,r3,r4;
	Cabine c1;
	
	public Tracteur(Roue r1,Roue r2 ,Roue r3,Roue r4,Cabine c1){
		this.r1=r1;
		this.r2=r2;
		this.r3=r3;
		this.r4=r4;
		this.c1=c1;
		
	}

	public String toString(){
		return " le tracteur possede 4 roues r1:"+r1+",r2 :"+r2+",r3:"+r3+",r4:"+r4+" et une cabine "+c1;
	}

	public void peindre(String couleur){
		c1.setCouleur(couleur);
	}
	
	public Tracteur copy(){
		Tracteur t = new Tracteur(r1.copy(),r2.copy(),r3.copy(),r4.copy(),c1.copy());
		return t;
	}

}
