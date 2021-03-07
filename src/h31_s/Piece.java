package h31_s;

import java.util.ArrayList;
import java.util.List;

/**
 * 迷路上に置かれる駒
 */
public class Piece {
	private final Maze maze;
	private Location location;
	private Direction direction = Direction.NORTH;
	private final List<Direction> history = new ArrayList<>();

	// コンストラクタの引数で迷路を指定する
	public Piece(Maze maze) {
		this.maze = maze;
		location = maze.getStartLocation();
	}

	// 左に向きを変える
	public void turnLeft() { direction = direction.left(); }

	// 右に向きを変える
	public void turnRight() { direction = direction.right(); }

	// 隣接する前方の升が通路なら1升前進し、前進した方角を履歴リストに追加してからtrue
	// 通路でなければ、前進せずにfalse
	public boolean tryStepForward() {
		Location nextLocation = new Location(location.x + direction.dx, location.y + direction.dy);
		if (maze.isBlank(nextLocation)) {
			location = nextLocation;
			history.add(direction);
			return true;
		}
		return false;
	}

	public boolean isAtGoal() { return maze.isGoal(location); }

	// 履歴リスト
	public List<Direction> getHistory() { return new ArrayList<>(history); }
}
