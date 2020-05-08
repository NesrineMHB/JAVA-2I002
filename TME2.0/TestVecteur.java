

public class TestVecteur{
	private double y ,x;
	

	public TestVecteur(double x,double y){
		this.x=x;
		this.y=y;}
        
	public String toString(){
		return "les deux coordonnees du vecteur ***compteur*** est "+x+","+y+"";}

	public TestVecteur add (TestVecteur t){// on ajoute t
		double X=this.x+t.x;
		double Y=this.y+t.y;
		return 	new TestVecteur(X,Y);}

	public TestVecteur rot(double angle){
		double X=(this.x)*Math.cos(angle)-(this.y)*Math.sin(angle);
		double Y=(this.x)*Math.sin(angle)+(this.y)*Math.cos(angle);
        

		return 	new TestVecteur(X,Y);}

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }


}

