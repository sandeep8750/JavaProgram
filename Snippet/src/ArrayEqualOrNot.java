import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int l1 = a.length;
		int l2 = b.length;
		boolean flage = false;
		
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.l

		if (l1 != l2) {
			flage = true;
		} else {
			for (int x : a) {
				if (map.get(x) == null) {
					map.put(x, 1);
				} else {
					int count = map.get(x);
					count++;
					map.put(x, count);
				}
			}

			for (int x : b) {

				if (!map.containsKey(x) || (map.get(x) == 0)) {
					flage = true;
					break;
				} else {
					int count = map.get(x);
					count--;
					map.put(x, count);
				}
			}
		}

		if (flage) {
			System.out.println("Array are not equal...");
		} else {
			System.out.println("Array are completely equal boss...");
		}

	}

}
