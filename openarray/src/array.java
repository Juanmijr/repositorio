
public class array {


public static void main(String[] args) {
	int [] array = new int[10];
	rellenaarray(array);


	sumaarray(array);

	nuevometodo1(array);
	nuevometodo2(array);
	nuevometodo1copia1(array);
	nuevometodo2copia2(array);

}

private static void rellenaarray(int array[]) {
	for (int i = 0; i < array.length; i++) {
		array[i] = (int)(Math.round(Math.random()*19)+ 1);
		}	
	}
private static void nuevometodo1 (int array[]) {
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}	
}

private static void nuevometodo2 (int array[]) {
int suma = 0;
	for (int i = 0; i < array.length; i++) {
		suma = suma + array[i];
	}	
}

private static void imprimearray (int array[]) {
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
		
}

private static void sumaarray (int array[]) {
	int suma = 0; 
	for (int i = 0 ; i<array.length ; i++) {
		suma = suma + array[i];
	}
}

private static void nuevometodo1copia1 (int array[]) {
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}	
	
}

private static void nuevometodo2copia2 (int array[]) {

	int cloneArray[] = array.clone();
	for (int i = 0; i < array.length; i++) {
		System.out.println(cloneArray[i]);
		}	

}

}