package application;

public class Main {

	public static void main(String[] args) {
		int[] vector = new int[50];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) Math.floor(Math.random() * vector.length);
		}

		System.out.println("disorderly: ");

		for (int i = 0; i < vector.length; i++) {

			System.out.print(vector[i] + " ");
		}
		
		quickSort(vector,0,vector.length -1);
		System.out.println("\n\n ordered: ");
		
		for (int i = 0; i < vector.length; i++) {

			System.out.print(vector[i] + " ");
		}
	}

	static void quickSort(int[] vector, int left, int right) {
		if (left < right) {
			int p = build(vector, left, right);
			quickSort(vector, left, p);
			quickSort(vector, p + 1, right);
		}
	}

	static int build(int[] vector, int left, int right) {
		int mid = (int) (left + right) / 2;
		int pivo = vector[mid];
		int i = left - 1;
		int j = right + 1;
		while (true) {
			do {
				i++;
			} while (vector[i] < pivo);
			do {
				j--;

			} while (vector[j] > pivo);
			if (i >= j) {
				return j;
			}
			int aux = vector[i];
			vector[i] = vector[j];
			vector[j] = aux;
		}
	}

}
