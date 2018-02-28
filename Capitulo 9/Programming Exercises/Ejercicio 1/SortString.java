package cap09;

public class SortString {
	public static void main(String[] args) {
		String[] arreglo = {"askdf", "contrasena", "rafael", "carrasco", "valencia", "dos", "siete", "nueve", "zero"};
		String temp;
		Integer a = 1;
		Integer b;
		
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].compareTo(temp)>=0 )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp;
			a++;
		}
		for(int i=0; i<arreglo.length; i++) {
			System.out.printf("%s%n",arreglo[i]);
		}
	}

}
