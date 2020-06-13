

class Chambar {
	
}
public class Weights {
	 int weight;
	String colour;
	

	public Weights(int w,String c) {
		weight =w;
		colour=c;
	}
	public  boolean equals(Object a) 
	{	if(!(a instanceof Weights)) return false;
		 Weights w=(Weights)a;
		return weight==w.weight;
	}
	public static void main(String[] args) {
		Weights a1=new Weights(20,"black");
		Weights a2=new Weights(20,"white");
		Weights a=new Weights(30,"pink");
		Chambar a4=new Chambar();
		if(a1.equals(a4))
			System.out.println("Both the dumbels are having same weights ");
		else 
			System.out.println("both are different");
		
	}

}
