package r1_f;

/**
 * 携帯端末を表す。
 */
public final class MobileDevice {
	private final String name;
	private final NotificationListener listener;

	// コンストラクタは引数で指定された携帯端末名及びリスナを持つ携帯端末を生成する。
	public MobileDevice(String name, NotificationListener listener) {
		this.name = name;
		this.listener = listener;
	}

	// リスナを返す
	public NotificationListener getListener() {return listener;}

	// 携帯端末を返す。
	public String getName() {return name;}
}
