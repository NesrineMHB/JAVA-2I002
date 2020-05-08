import java.awt.Graphics;


public class Tortue {
    private Graphics g ;
    private boolean draw;
    TestVecteur position, direction;
    
     public Tortue(Graphics g ){
	position=new TestVecteur(200,200);
	direction=new TestVecteur(1,0);
	draw=true;
	this.g=g;
	System.out.println(direction.toString());

	}

	public void leverStylo(){ draw=false; }

	public void baisserStylo(){ draw=true; }
         
     public void avancer(int lg){
          for(int i=1;i<lg;i++){
		position=position.add(direction);
		if(draw)  g.drawLine((int) position.getX(), (int) position.getY(), (int)     	
			  position.getX(), (int) position.getY()) ;
	  }
          
    }

    public void rotation(double theta){
	direction=direction.rot(theta);
	System.out.println(direction.toString());
		System.out.println(theta);
    }
	
        
}





