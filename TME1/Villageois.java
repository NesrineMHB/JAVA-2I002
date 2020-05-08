public class Villageois{
		private String nom;
		private double poids;
		private boolean malade;

		public Villageois (String nomVillageois){
		nom = nomVillageois;
		poids=(Math.random()*100+50);
		if (Math.random()<0.2) malade=true;}

		public String getNom() {return nom;}
                public double getPoids() {return poids;}
                public boolean getMalade() {return malade;}
                public String toString() {return "villageois : "+nom+", poids : "+poids+",     malade :" +malade;}

		public double poidsSouleve(){
			if(malade) return poids/4;
			else return poids/3;} }

			

