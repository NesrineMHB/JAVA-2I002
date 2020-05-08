public class ClasseDeTest{
	public static void main (String[] args){

		int i;
		Terrain t1=new Terrain();
		System.out.println(t1.toString());
		for(i=0;i<10;i++) t1.update();
		System.out.println(t1.toString());

} 	
}
