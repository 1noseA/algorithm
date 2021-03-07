package h31_s;

/**
 * 迷路
 */
public class Maze {
	private final String mazeData;
	private final int width;
	private final Location startLocation;

	// コンストラクタの引数には文字列で表現した迷路と、
	// 迷路の西端から東端までの升の個数を指定する。
	public Maze(String mazeData, int width) {
		this.mazeData = mazeData;
		this.width = width;
		startLocation = locationOf('S');
	}

	// 開始時点の座標
	public Location getStartLocation() { return startLocation; }

	// 指定された座標の升がゴール地点ならばtrue
	public boolean isGoal(Location loc) {
		return mazeData.charAt(loc.y * width + loc.x) == 'G'; // ゴール地点
	}

	// 指定された升の座標が通路ならtrue
	public boolean isBlank(Location loc) {
		return mazeData.charAt(loc.y * width + loc.x) != '*'; // 壁
	}

	private Location locationOf(char c) {
		int index = mazeData.indexOf(c);
		return new Location(index % width, index / width);
	}
}
