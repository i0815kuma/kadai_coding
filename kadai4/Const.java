package kadai4;

import java.awt.Dimension;
import java.util.stream.IntStream;

//定数値を扱うクラス
public final class Const {
	private Const(){}

	//メインフレームのサイズ
	public final static Dimension FRAME_SIZE = new Dimension(500,500);

	public final static int CELL_SIZE = 10;

	public final static long SLEEP_TIME_MS = 50;

	public final static Range<Integer> LIVING_RANGE = new Range<Integer>(2,3);

	public final static int BIRTH_CNT = 3;

	public final static Dimension sponeLocation = new Dimension(2,2);
}
