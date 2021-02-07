package h29_f;

/**
 * 平成29年秋期アルゴリズム
 */
public class A29_F {
	public static void main(String[] args) {

	}

	public String calcCheckCharacter(String input[], int len) {
		int N = 30;
		int sum = 0;
		boolean is_even = false;

		for (int i = len; i > 0; i--) {
			int value = getValue(input[i]);
			if (is_even == true) {
				sum = sum + value;
			} else {
				sum = sum + (value * 2) / N + (value * 2) % N;
			}
			is_even = !is_even;
		}
		int check_value = (N - sum % N) % N;
		return getChar(check_value);
	}

	private String getChar(int check_value) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private int getValue(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public boolean validateCheckCharacter(String input[], int len) {
		int N = 30;
		int sum = 0;
		boolean is_odd = true;
		boolean ret_value = true;

		for (int i = len; i > 0; i--) {
			int value = getValue(input[i]);
			if (is_odd == true) {
				sum = sum + value;
			} else {
				sum = sum + (value * 2) / N + (value * 2) % N;
			}
			is_odd = !is_odd;
		}
		return ret_value;
	}
}
