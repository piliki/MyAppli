public class Calculatrice {
	private double param1;
	private double param2;
	private String op;
	
	public static void main(String[] args) {
		Calculatrice cal= new Calculatrice();
		cal.calculer(args);
	}
	
	
	public  double getParam1() {
		return param1;
	}
	
	public   void setParam1(double param1) {
		this.param1 = param1;
	}
	
	public  double getParam2() {
		return param2;
	}
	
	public   void setParam2(double param2) {
		this.param2 = param2;
	}
	
	public  String getOp() {
		return op;
	}
	

	
	public  void setOp(String op) {
	if(op.equals("*")|op.equals("+")|op.equals("/")|op.equals("-")) {
		this.op = op;}
	else {
		System.out.println("Utilisez les Operateurs * / + -");
		System.exit(3);
	}
	}
	
	public  void calculer(String[] tab) {
	saisir(tab);
	System.out.println("Le resutat est "+ resultat());
	}
	
	

	public   void saisir(String[] tab) {	
		System.out.println("saisir ce que vous voulez calculer "+tab[0]+" "+tab[1]+" "+tab[2]);
		String x,y,z;
		x=tab[0];
		y=tab[1];
		z=tab[2];
		try {
			setParam1(Double.parseDouble(x));
			setParam2(Double.parseDouble(z));
			setOp(y);	
			}catch(Exception e){
			System.out.println("Les nombre saisis sont incorrectes");
			System.exit(1);
		}
	}
	public  double resultat (){	
	switch(this.op) {
	case "*":
		return multiplier();
	case "+":
		return additionner();
	case "-":
		return soustraire();
	case "/":
	  if(this.param2==0){
		  System.out.println("Division par Zero !!");
		  System.exit(2);
	  }else {
		  return diviser();
	  }
		
		}
	return 0;
	}

	
	private  double multiplier() {
		return this.param1 * this.param2;	
	}

	private  double diviser() {
		return this.param1 / this.param2;
		}
		

	private  double soustraire() {
		return this.param1 - this.param2;
	}

	private double additionner() {
		return this.param1 + this.param2;
		}
}

