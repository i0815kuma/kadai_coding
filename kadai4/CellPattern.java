package kadai4;

import java.util.*;

//プリセットとして提供するセルパターンをまとめたクラス
public class CellPattern{
	enum Pattern { GLIDER, SPACESHIP, GALAXY, RANDOM }
	//グライダーパターン
	private final static int[][] glider_ptn = {
			{0,1,0},
			{0,0,1},
			{1,1,1}
			};
	//宇宙船パターン
	private final static int[][] spaceship_ptn = {
			{1,0,0,1,0},
			{0,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,1}
			};
	//銀河パターン
	private final static int[][] galaxy_ptn = {
			{1,1,1,1,1,1,0,1,1},
			{1,1,1,1,1,1,0,1,1},
			{0,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,0},
			{1,1,0,1,1,1,1,1,1},
			{1,1,0,1,1,1,1,1,1}
			};

	//パターンの生成
	public static void patternGenerator(LifeCell[][] cells,CellPattern.Pattern p){
		int pattern[][] = {{}};
		switch(p){
			case GLIDER:
				pattern = glider_ptn;
				break;
			case SPACESHIP:
				pattern = spaceship_ptn;
				break;
			case GALAXY:
				pattern = galaxy_ptn;
				break;
			case RANDOM:
				pattern = Rand.random();
				break;
		}

		int x_max = cells[0].length;
		int y_max = cells.length;
		//盤面の大きさより、パターンの生成領域超えていた場合
		if(Const.sponeLocation.width + pattern[0].length > x_max){ return; }
		if(Const.sponeLocation.height + pattern.length > y_max){ return; }
		//パターンに合わせて、強制的に盤面塗り替え
		for(int y = 0; y < pattern.length; y++){
			for(int x = 0; x < pattern[0].length; x++){
				LifeCell cell = cells[Const.sponeLocation.height + y][Const.sponeLocation.width + x];
				if(pattern[y][x] == 1){
					cell.forceSpawn();
				}else{
					cell.forceKill();
				}
			}
		}
	}
}

class Rand{  //乱数生成
	public static int[][] random(){
		Random rand = new Random();
		int i,j;
		int[][] ran = new int[48][48];

		for(i = 0; i < 48; i++) {
			for(j = 0; j < 48; j++) {
				int num = rand.nextInt(2);
				ran[i][j] = num;
			}
		}
		return ran;
	}
}



