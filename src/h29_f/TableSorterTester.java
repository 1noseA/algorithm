package h29_f;

import java.util.Comparator;

public class TableSorterTester {
	public static void main(String... args) {
		String[][] data = new String[][] {
			{"apple", "3", "1000"},
			{"cherry", "1", "1000"},
			{"banana", "1", "300"},
			{"banana", "2", "2000"},
			{"apple", "2", "300"},
		};

		TableSorter sorter = new TableSorter();
		sorter.putSortOrder("lex", new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		sorter.putSortOrder("num", new Comparator<String>() {
			public int compare(String o1, String o2) {
				return new Integer(o1).compareTo(new Integer(o2));
			}
		});
		sorter.sort(data, new TableSorter.OrderBy("lex", 0),
				new TableSorter.OrderBy("num", 1, true));

		// 設問2
		// apple31000,cherry11000,banana22000,apple2300,banana1300の順で出力
//		sorter.sort(data,  new TableSorter.OrderBy("lex", 2),
//				new TableSorter.OrderBy("lex", 0));

		// 設問3
		// apple2300,banana1300,apple31000,cherry11000,banana22000の順で出力
//		sorter.putSortOrder("numC", new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return new Integer(s1.replace(",", ""))
//						.compareTo(new Integer(s2.replace(",", "")));
//			}
//		});
//		sorter.sort(data, new TableSorter.OrderBy("numC", 2),
//				new TableSorter.OrderBy("lex", 0));

	    for (String[] row : data) {
	    	for (String col : row) {
	    		System.out.printf("%s", col);
	    	}
	    	System.out.println();
	    }
	}
}
