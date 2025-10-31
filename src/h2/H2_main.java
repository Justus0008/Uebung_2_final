package h2;

public class H2_main {
	public static void main(String[] args)
	{
		int i = 1;
		int j = 10;
		int k = 100;
		int min = 0;
		int max = 0;
		if (i < j && i < k) {
			min = i;
		}
		if (j < i && j < k) {
			min = j;
		}
		if (k < j && k < i) {
			min = k;
		}
		if (i > j && i > k) {
			max = i;
		}
		if (j > i && j > k) {
			max = j;
		}
		if (k > i && k > j) {
			max = k;
		}
		
	}

}
