//Enzo Pacheco de Oliveira Souza - 2º ADS

public class ConversaoPrimitivos {
	
	public static void main (String[] args) {
		int a = 10;
		long b = a;
		int c = (int)b; //long não entra em int, por isso se converte
		float d =  b;
		short e =  (short)a; //int não cabe em short, por isso se converte
		double f =  d;
		long g = b;
		long h = g;
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}

