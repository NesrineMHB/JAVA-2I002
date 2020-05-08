public class TestMachine{
	
	public static void main (String [] args){
		PieceA a1=new PieceA (2587);
		PieceA a2=new PieceA (8796);
		PieceB b1=new PieceB (1235);
		Avant av1=new Avant(a1,a2,b1);
		PieceA a3=new PieceA(0012);
		PieceC c1=new PieceC(741);
		PieceC c2=new PieceC(0147);
		Arriere ar1=new Arriere (a3,c1,c2);
		Machine m1=new Machine(av1,ar1,"rouge");
		System.out.println(m1);
		Machine m2 = new Machine(m1);

		System.out.println(m2);

	}
}
