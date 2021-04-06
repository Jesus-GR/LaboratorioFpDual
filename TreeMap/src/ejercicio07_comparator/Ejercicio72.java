package ejercicio07_comparator;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ejercicio72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> color = new TreeMap<>(new KeySorter());



		color.put(1, "Verde");
		color.put(6, "Negro");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");



		System.out.println(color);
		System.out.println("==========");
		color.values().stream().sorted(new ValueSorter()).forEach(System.out::println);
		System.out.println("==========");
		List<String> values = color.values().stream().sorted(new ValueSorter()).collect(Collectors.toList());
		System.out.println(values);
		}
		}



		class ValueSorter implements Comparator<String> {
		@Override
		public int compare(String str1, String str2) {
		return str1.compareTo(str2);
		}
		}



		class KeySorter implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
		return o1 > o2 ? -1 : o1 < o2 ? 1 : 0;
		}
		}
