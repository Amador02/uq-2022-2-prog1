package actividades;
import esen.cial;
//Cuantos valores en un rango de datos tienen al menos 2 numeros menores que 5
public class digitomenor5 {
	public static boolean dosDigMenor5 (int num) {
		int cantidad = 0;
		while (num>=10) {
			if (num%10<5) cantidad++;
			num=num/10;
		}
		if (num%10<5) cantidad++;
		boolean resultado = false;
		if (cantidad>=2) resultado = true; 
		return resultado;
	}
	public static int cantValoresm5 (int n1, int n2) {
		int mayor,menor, cant=0;
		if (n1>n2) {
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}
		for (int i =menor;i<=mayor;i++) {
			if(dosDigMenor5(i)) cant++;
		}
		return cant;
	}
	public static void main(String args[]) {
		int n1,n2,cant;
		n1 = cial.leerInt("Escribe el primer numero:");
		n2 = cial.leerInt("Escribe el primer numero:");
		cant = cantValoresm5 (n1,n2);
		cial.imprimir("La cantidad de numeros que tienen al menos 2 \ndigitos menores que 5 entre "+n1 +" y "+n2+" es de "+cant);
	}
}