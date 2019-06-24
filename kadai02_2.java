package kadai2;
import java.util.*;

public class ka2_2 {
//ポーカーランダム版
	public static void main(String[] args) {
		int i,ii;
		int suit[] = new int[5];//スート
		int num[] = new int[5];//数字
		String hantei[] = new String[5];//重複判定用
		int kazu[] = new int[14];//ペアカウント用

		//配列kazu初期化
		for(i = 0; i < 14; i++) {
			kazu[i] = 0;
		}

		//カード配布
		int flag = 0;
		Random r = new Random();
		for(; flag == 0;) {
			for(ii = 0; ii < 5; ii++) {
				suit[ii] = r.nextInt(4);
				num[ii] = r.nextInt(13) + 1;
			}

			//重複判定
			int aa;
			for(aa = 0; aa < 5; aa++) {
				hantei[aa] = Integer.toString(suit[aa]) + Integer.toString(num[aa]);
			}
			if(hantei[0].equals(hantei[1]) || hantei[0].equals(hantei[2]) || hantei[0].equals(hantei[3]) || hantei[0].equals(hantei[4])
					|| hantei[1].equals(hantei[2]) || hantei[1].equals(hantei[3]) || hantei[1].equals(hantei[4])
						|| hantei[2].equals(hantei[3]) || hantei[2].equals(hantei[4]) || hantei[3].equals(hantei[4])) {
				flag = 0;
			}else {
				flag = 1;
				break;
			}
		}
		//スート変換
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		String e = "";

		//1枚目
		if(suit[0] == 0) {
			a = "S";
		}else if(suit[0] == 1){
			a = "C";
		}else if(suit[0] == 2){
			a = "D";
		}else if(suit[0] == 3){
			a = "H";
		}

		//2枚目
		if(suit[1] == 0) {
			b = "S";
		}else if(suit[1] == 1){
			b = "C";
		}else if(suit[1] == 2){
			b = "D";
		}else if(suit[1] == 3){
			b = "H";
		}

		//3枚目
		if(suit[2] == 0) {
			c = "S";
		}else if(suit[2] == 1){
			c = "C";
		}else if(suit[2] == 2){
			c = "D";
		}else if(suit[2] == 3){
			c = "H";
		}

		//4枚目
		if(suit[3] == 0) {
			d = "S";
		}else if(suit[3] == 1){
			d = "C";
		}else if(suit[3] == 2){
			d = "D";
		}else if(suit[3] == 3){
			d = "H";
		}

		//5枚目
		if(suit[4] == 0) {
			e = "S";
		}else if(suit[4] == 1){
			e = "C";
		}else if(suit[4] == 2){
			e = "D";
		}else if(suit[4] == 3){
			e = "H";
		}

		//数字変換
		String f,g,h,k,l;

		//1枚目
		if(num[0] == 1) {
			f = "A";
		}else if(num[0] == 11){
			f = "J";
		}else if(num[0] == 12){
			f = "Q";
		}else if(num[0] == 13){
			f = "K";
		}else {
			f = Integer.toString(num[0]);
		}

		//2枚目
		if(num[1] == 1) {
			g = "A";
		}else if(num[1] == 11){
			g = "J";
		}else if(num[1] == 12){
			g = "Q";
		}else if(num[1] == 13){
			g = "K";
		}else {
			g = Integer.toString(num[1]);
		}

		//3枚目
		if(num[2] == 1) {
			h = "A";
		}else if(num[2] == 11){
			h = "J";
		}else if(num[2] == 12){
			h = "Q";
		}else if(num[2] == 13){
			h = "K";
		}else {
			h = Integer.toString(num[2]);
		}

		//4枚目
		if(num[3] == 1) {
			k = "A";
		}else if(num[3] == 11){
			k = "J";
		}else if(num[3] == 12){
			k = "Q";
		}else if(num[3] == 13){
			k = "K";
		}else {
			k = Integer.toString(num[3]);
		}

		//5枚目
		if(num[4] == 1) {
			l = "A";
		}else if(num[4] == 11){
			l = "J";
		}else if(num[4] == 12){
			l = "Q";
		}else if(num[4] == 13){
			l = "K";
		}else {
			l = Integer.toString(num[4]);
		}

		//カード出力
		System.out.println(a + f + " " + b + g + " " + c + h + " " + d + k + " " + e + l);

		//数字配列昇順
        Arrays.sort(num);

        //ペアカウント用
        int t;
        for(t = 0; t < 5; t++) {
        	if(num[t] == 1) {
        		kazu[1] = kazu[1] + 1;
        	}
        	if(num[t] == 2) {
        		kazu[2] = kazu[2] + 1;
        	}
        	if(num[t] == 3) {
        		kazu[3] = kazu[3] + 1;
        	}
        	if(num[t] == 4) {
        		kazu[4] = kazu[4] + 1;
        	}
        	if(num[t] == 5) {
        		kazu[5] = kazu[5] + 1;
        	}
        	if(num[t] == 6) {
        		kazu[6] = kazu[6] + 1;
        	}
        	if(num[t] == 7) {
        		kazu[7] = kazu[7] + 1;
        	}
        	if(num[t] == 8) {
        		kazu[8] = kazu[8] + 1;
        	}
        	if(num[t] == 9) {
        		kazu[9] = kazu[9] + 1;
        	}
        	if(num[t] == 10) {
        		kazu[10] = kazu[10] + 1;
        	}
        	if(num[t] == 11) {
        		kazu[11] = kazu[11] + 1;
        	}
        	if(num[t] == 12) {
        		kazu[12] = kazu[12] + 1;
        	}
        	if(num[t] == 13) {
        		kazu[13] = kazu[13] + 1;
        	}
        }
        Arrays.sort(kazu);

        int flush = 0;//フラッシュフラグ

		//ロイヤルストレートフラッシュ
		if(suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3] && suit[0] == suit[4]) {
			if(num[0] == 1 && num[1] == 10 && num[2] == 11 && num[3] == 12 && num[4] == 13) {
				System.out.println("ロイヤルストレートフラッシュ(*^^*)");
				System.exit(0);
			}
		}

		//フラッシュ
		if(suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3] && suit[0] == suit[4]) {
			flush = 1;
		}

		//ストレート
		if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
			System.out.println("ストレート");
			System.exit(0);
		}

		if(num[1] == 10) {
			num[0] = num[0] + 13;
	        Arrays.sort(num);
			if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
				if(flush == 1) {
					System.out.println("ストレートフラッシュ");
					System.exit(0);
				}else {
					System.out.println("ストレート");
					System.exit(0);
				}
			}
		}

		if(num[2] == 11) {
			num[0] = num[0] + 13;
			num[1] = num[1] + 13;
	        Arrays.sort(num);
			if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
				if(flush == 1) {
					System.out.println("ストレートフラッシュ");
					System.exit(0);
				}else {
					System.out.println("ストレート");
					System.exit(0);
				}
			}
		}

		if(num[3] == 12) {
			num[0] = num[0] + 13;
			num[1] = num[1] + 13;
			num[2] = num[2] + 13;
	        Arrays.sort(num);
			if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
				if(flush == 1) {
					System.out.println("ストレートフラッシュ");
					System.exit(0);
				}else {
					System.out.println("ストレート");
					System.exit(0);
				}
			}
		}

		if(num[4] == 13) {
			num[0] = num[0] + 13;
			num[1] = num[1] + 13;
			num[2] = num[2] + 13;
			num[3] = num[3] + 13;
	        Arrays.sort(num);
			if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
				if(flush == 1) {
					System.out.println("ストレートフラッシュ");
					System.exit(0);
				}else {
					System.out.println("ストレート");
					System.exit(0);
				}
			}
		}

		//フラッシュ
		if(flush == 1) {
			System.out.println("フラッシュ");
			System.exit(0);
		}


		//フォーカード,スリーカード
		if(kazu[13] == 4) {
			System.out.println("フォーカード( ﾟДﾟ)");
			System.exit(0);
		}else if(kazu[13] == 3 && kazu[12] == 2) {
			System.out.println("フルハウス('ω')");
			System.exit(0);
		}else if(kazu[13] == 3) {
			System.out.println("スリーカード");
			System.exit(0);
		}

		//ワンペア,ツーペア
		if(kazu[12] == 2 && kazu[13] == 2) {
			System.out.println("ツーペア");
			System.exit(0);
		}else if(kazu[13] == 2){
			System.out.println("ワンペア");
			System.exit(0);
		}

		//ハイカード
		if(kazu[13] == 1) {
			System.out.println("ハイカードm9(^Д^)ﾌﾟｷﾞｬｰ");
			System.exit(0);
		}

	}

}
