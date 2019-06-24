package kadai1;
import java.util.*;

public class ka1 {

	public static void main(String[] args) {
		//自機情報入力
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("自機のデータを入力してください");
		System.out.println("X座標を入力");
		int x = sc.nextInt();
		System.out.println("Y座標を入力");
		int y = sc.nextInt();
		System.out.println("高さを入力");
		int w = sc.nextInt();
		System.out.println("幅を入力");
		int h = sc.nextInt();

		//敵の数
		System.out.println("敵の数を入力してください(1~3)");
		int flag;
		int t = sc.nextInt();
		for(flag = 0; flag == 0;) {
			if(t > 0 && t < 4) {
				flag = 1;
				break;
			}
			System.out.println("敵の数を入力してください(1~3)");
			t = sc.nextInt();
		}

		//敵データ入力
		int i, j = 0;
		int teki[][] = new int[3][4];
		for(i = 0; i < t; i++) {
		System.out.println("敵のデータを入力してください");
		System.out.println("X座標を入力");
		teki[i][j] = sc.nextInt();
		j = j + 1;
		System.out.println("Y座標を入力");
		teki[i][j] = sc.nextInt();
		j = j + 1;
		System.out.println("高さを入力");
		teki[i][j] = sc.nextInt();
		j = j + 1;
		System.out.println("幅を入力");
		teki[i][j] = sc.nextInt();
		j = 0;
		}

		//あたり判定
		int tx, ty, tw, th, a = 0, b = 0, c;
		for(c = 1; c < 4; c++) {
		tx = teki[a][b];
		b = b + 1;
		ty = teki[a][b];
		b = b + 1;
		tw = teki[a][b];
		b = b + 1;
		th = teki[a][b];
		b = 0;
		a = a + 1;
		if( ( x < tx + tw ) &&
			( tx < x + w ) &&
			( y < ty + th ) &&
			( ty < y + h ) ) {
				System.out.println("敵機" + c + "が当たり");
			}
		}


	}

}

