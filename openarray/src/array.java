public class array {

//H
public static void main(String[] args) {
	int [] array = new int[10];
	rellenaarray(array);
	nuevometodo1(array);
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

}