import java.util.ArrayList;
import static java.util.Arrays.asList;

public class arrayAsList {
	public static void main(String[] args) {
		ArrayList<Integer> angkaGenap = new ArrayList<>(asList(2, 4, 6, 8));
		System.out.println("Original : " + angkaGenap);
		angkaGenap.set(3, 10);
		System.out.println("Ubah Indeks ke-3 : " + angkaGenap);
		angkaGenap.remove(2);
		System.out.println("Hapus Indeks ke-2 : " + angkaGenap);
		angkaGenap.clear();
		System.out.println("Hapus semua elemen : " + angkaGenap);
	}
}
