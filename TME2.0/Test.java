public class Test{

	public static void main(String[] args) { // pas de virgule

		TestVecteur t1 =new TestVecteur(1,2);
		TestVecteur t2 =new TestVecteur(0,1);
		System.out.println(t1.toString());// tostring avec ()
		System.out.println(t2.toString());
		TestVecteur t3=t1.add(t2);
		TestVecteur t4=t2.rot(Math.PI/2);
		System.out.println(t3.toString());
                System.out.println(t4.toString());}}
                

                //System.out.println(Math.cos(Math.PI/2));
