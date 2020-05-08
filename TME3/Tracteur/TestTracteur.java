public class TestTracteur{
	
	public static void main (String [] args){
	
		Roue r1=new Roue();
		Roue r2=new Roue();
		Roue r3=new Roue(120);
		Roue r4=new Roue(120);

                System.out.println(r1);
                System.out.println(r2);
                System.out.println(r3);
                System.out.println(r4);	
		
		Cabine c1=new Cabine(100,"bleue");

		Tracteur t1=new Tracteur(r1,r2,r3,r4,c1);
	        System.out.println(t1);
		/*Tracteur t2=t1;
		t2.peindre("rouge");
		 System.out.println(t1);*/
		Tracteur t2=t1.copy();
		t2.peindre("rouge");
		 System.out.println(t1);
		
		
	}
}
