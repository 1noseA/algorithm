package h31_s;

/**
 * 方角
 */
public enum Direction {
	NORTH(0, -1), EAST(1,0), SOURTH(0, 1), WEST(-1, 0);

	public int dx, dy;

	private Direction(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	// クラスメソッドvaluesは、この列挙型で定義している列挙定数を、
	// 定義順に格納した配列を返す。
	// メソッドordinalは、この列挙定数の定義順（先頭は0）を返す。
	public Direction left() { return values()[(ordinal() + 3) % 4]; }

	public Direction right() { return values()[(ordinal() + 1) % 4]; }
}
