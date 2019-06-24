package kadai2;
import java.util.*;

public class ka2_3 {
//ポーカーランダム版
	public static void main(String[] args) {
		int i,ii;
		int suit[] = new int[5];//スート1P
		int num[] = new int[5];//数字1P
		int suit2[] = new int[5];//スート2P
		int num2[] = new int[5];//数字2P
		String hantei[] = new String[5];//重複判定用
		int kazu[] = new int[14];//ペアカウント用1P
		int kazu2[] = new int[14];//ペアカウント用2P
		int score = 0;//得点1P
		int score2 = 0;//得点2P

		//配列kazu初期化
		for(i = 0; i < 14; i++) {
			kazu[i] = 0;
		}
		for(i = 0; i < 14; i++) {
			kazu2[i] = 0;
		}

		//カード配布(1P)
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

		//カード配布(2P)
		flag = 0;
		for(; flag == 0;) {
			for(ii = 0; ii < 5; ii++) {
				suit2[ii] = r.nextInt(4);
				num2[ii] = r.nextInt(13) + 1;
			}

			//重複判定
			int aa;
			for(aa = 0; aa < 5; aa++) {
				hantei[aa] = Integer.toString(suit2[aa]) + Integer.toString(num2[aa]);
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

		//スート変換(1P)
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

		//スート変換(2P)
		String aa = "";
		String bb = "";
		String cc = "";
		String dd = "";
		String ee = "";

		//1枚目
		if(suit2[0] == 0) {
			aa = "S";
		}else if(suit2[0] == 1){
			aa = "C";
		}else if(suit2[0] == 2){
			aa = "D";
		}else if(suit2[0] == 3){
			aa = "H";
		}

		//2枚目
		if(suit2[1] == 0) {
			bb = "S";
		}else if(suit2[1] == 1){
			bb = "C";
		}else if(suit2[1] == 2){
			bb = "D";
		}else if(suit2[1] == 3){
			bb = "H";
		}

		//3枚目
		if(suit2[2] == 0) {
			cc = "S";
		}else if(suit2[2] == 1){
			cc = "C";
		}else if(suit2[2] == 2){
			cc = "D";
		}else if(suit2[2] == 3){
			cc = "H";
		}
		//4枚目
		if(suit2[3] == 0) {
			dd = "S";
		}else if(suit2[3] == 1){
			dd = "C";
		}else if(suit2[3] == 2){
			dd = "D";
		}else if(suit2[3] == 3){
			dd = "H";
		}

		//5枚目
		if(suit2[4] == 0) {
			ee = "S";
		}else if(suit2[4] == 1){
			ee = "C";
		}else if(suit2[4] == 2){
			ee = "D";
		}else if(suit2[4] == 3){
			ee = "H";
		}

		//数字変換(1P)
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

		//数字変換(2P)
		String ff,gg,hh,kk,ll;

		//1枚目
		if(num2[0] == 1) {
			ff = "A";
		}else if(num2[0] == 11){
			ff = "J";
		}else if(num2[0] == 12){
			ff = "Q";
		}else if(num2[0] == 13){
			ff = "K";
		}else {
			ff = Integer.toString(num2[0]);
		}

		//2枚目
		if(num2[1] == 1) {
			gg = "A";
		}else if(num2[1] == 11){
			gg = "J";
		}else if(num2[1] == 12){
			gg = "Q";
		}else if(num2[1] == 13){
			gg = "K";
		}else {
			gg = Integer.toString(num2[1]);
		}

		//3枚目
		if(num2[2] == 1) {
			hh = "A";
		}else if(num2[2] == 11){
			hh = "J";
		}else if(num2[2] == 12){
			hh = "Q";
		}else if(num2[2] == 13){
			hh = "K";
		}else {
			hh = Integer.toString(num2[2]);
		}

		//4枚目
		if(num2[3] == 1) {
			kk = "A";
		}else if(num2[3] == 11){
			kk = "J";
		}else if(num2[3] == 12){
			kk = "Q";
		}else if(num2[3] == 13){
			kk = "K";
		}else {
			kk = Integer.toString(num2[3]);
		}

		//5枚目
		if(num2[4] == 1) {
			ll = "A";
		}else if(num2[4] == 11){
			ll = "J";
		}else if(num2[4] == 12){
			ll = "Q";
		}else if(num2[4] == 13){
			ll = "K";
		}else {
			ll = Integer.toString(num2[4]);
		}



		//カード出力(1P)
		System.out.println("1P");
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
				score = 10;
				for(i = 0; i < 14; i++) {
					kazu[i] = 0;
				}
				for(i = 0; i < 5; i++) {
					suit[i] = 0;
				}
				for(i = 0; i < 5; i++) {
					num[i] = 0;
				}
			}
		}

		//フラッシュ
		if(suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3] && suit[0] == suit[4]) {
			flush = 1;
		}

		//ストレート
		if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
			System.out.println("ストレート");
			score = 5;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}

		if(num[1] == 10) {
			num[0] = num[0] + 13;
	        Arrays.sort(num);
			if(num[0]+1 == num[1] && num[0]+2 == num[2] && num[0]+3 == num[3] && num[0]+4 == num[4]) {
				if(flush == 1) {
					System.out.println("ストレートフラッシュ");
					score = 9;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score = 5;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
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
					score = 9;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score = 5;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
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
					score = 9;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score = 5;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
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
					score = 9;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score = 5;
					for(i = 0; i < 14; i++) {
						kazu[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num[i] = 0;
					}
				}
			}
		}

		//フラッシュ
		if(flush == 1) {
			System.out.println("フラッシュ");
			score = 6;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}


		//フォーカード,スリーカード
		if(kazu[13] == 4) {
			System.out.println("フォーカード( ﾟДﾟ)");
			score = 8;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}else if(kazu[13] == 3 && kazu[12] == 2) {
			System.out.println("フルハウス('ω')");
			score = 7;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}else if(kazu[13] == 3) {
			System.out.println("スリーカード");
			score = 4;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}

		//ワンペア,ツーペア
		if(kazu[12] == 2 && kazu[13] == 2) {
			System.out.println("ツーペア");
			score = 3;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}else if(kazu[13] == 2){
			System.out.println("ワンペア");
			score = 2;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}

		//ハイカード
		if(kazu[13] == 1) {
			System.out.println("ハイカードm9(^Д^)ﾌﾟｷﾞｬｰ");
			score = 1;
			for(i = 0; i < 14; i++) {
				kazu[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num[i] = 0;
			}
		}

		//カード出力(2P)
		System.out.println("");
		System.out.println("2P");
		System.out.println(aa + ff + " " + bb + gg + " " + cc + hh + " " + dd + kk + " " + ee + ll);

		//数字配列昇順
        Arrays.sort(num2);

        //ペアカウント用
        int tt;
        for(tt = 0; tt < 5; tt++) {
        	if(num2[tt] == 1) {
        		kazu2[1] = kazu2[1] + 1;
        	}
        	if(num[tt] == 2) {
        		kazu2[2] = kazu2[2] + 1;
        	}
        	if(num2[tt] == 3) {
        		kazu2[3] = kazu2[3] + 1;
        	}
        	if(num2[tt] == 4) {
        		kazu2[4] = kazu2[4] + 1;
        	}
        	if(num2[tt] == 5) {
        		kazu2[5] = kazu2[5] + 1;
        	}
        	if(num2[tt] == 6) {
        		kazu2[6] = kazu2[6] + 1;
        	}
        	if(num2[tt] == 7) {
        		kazu2[7] = kazu2[7] + 1;
        	}
        	if(num2[tt] == 8) {
        		kazu2[8] = kazu2[8] + 1;
        	}
        	if(num2[tt] == 9) {
        		kazu2[9] = kazu2[9] + 1;
        	}
        	if(num2[tt] == 10) {
        		kazu2[10] = kazu2[10] + 1;
        	}
        	if(num2[tt] == 11) {
        		kazu2[11] = kazu2[11] + 1;
        	}
        	if(num2[tt] == 12) {
        		kazu2[12] = kazu2[12] + 1;
        	}
        	if(num2[tt] == 13) {
        		kazu2[13] = kazu2[13] + 1;
        	}
        }
        Arrays.sort(kazu2);

        int flush2 = 0;//フラッシュフラグ

		//ロイヤルストレートフラッシュ
		if(suit2[0] == suit2[1] && suit2[0] == suit2[2] && suit2[0] == suit2[3] && suit2[0] == suit2[4]) {
			if(num2[0] == 1 && num2[1] == 10 && num2[2] == 11 && num2[3] == 12 && num2[4] == 13) {
				System.out.println("ロイヤルストレートフラッシュ(*^^*)");
				score2 = 10;
				for(i = 0; i < 14; i++) {
					kazu2[i] = 0;
				}
				for(i = 0; i < 5; i++) {
					suit2[i] = 0;
				}
				for(i = 0; i < 5; i++) {
					num2[i] = 0;
				}
			}
		}

		//フラッシュ
		if(suit2[0] == suit2[1] && suit2[0] == suit2[2] && suit2[0] == suit2[3] && suit2[0] == suit2[4]) {
			flush2 = 1;
		}

		//ストレート
		if(num2[0]+1 == num2[1] && num2[0]+2 == num2[2] && num2[0]+3 == num2[3] && num2[0]+4 == num2[4]) {
			System.out.println("ストレート");
			score2 = 5;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}

		if(num2[1] == 10) {
			num2[0] = num2[0] + 13;
	        Arrays.sort(num2);
			if(num2[0]+1 == num2[1] && num2[0]+2 == num2[2] && num2[0]+3 == num2[3] && num2[0]+4 == num2[4]) {
				if(flush2 == 1) {
					System.out.println("ストレートフラッシュ");
					score2 = 9;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score2 = 5;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}
			}
		}

		if(num2[2] == 11) {
			num2[0] = num2[0] + 13;
			num2[1] = num2[1] + 13;
	        Arrays.sort(num2);
			if(num2[0]+1 == num2[1] && num2[0]+2 == num2[2] && num2[0]+3 == num2[3] && num2[0]+4 == num2[4]) {
				if(flush2 == 1) {
					System.out.println("ストレートフラッシュ");
					score2 = 9;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score2 = 5;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}
			}
		}

		if(num2[3] == 12) {
			num2[0] = num2[0] + 13;
			num2[1] = num2[1] + 13;
			num2[2] = num2[2] + 13;
	        Arrays.sort(num2);
			if(num2[0]+1 == num2[1] && num2[0]+2 == num2[2] && num2[0]+3 == num2[3] && num2[0]+4 == num2[4]) {
				if(flush2 == 1) {
					System.out.println("ストレートフラッシュ");
					score2 = 9;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score2 = 5;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}
			}
		}

		if(num2[4] == 13) {
			num2[0] = num2[0] + 13;
			num2[1] = num2[1] + 13;
			num2[2] = num2[2] + 13;
			num2[3] = num2[3] + 13;
	        Arrays.sort(num2);
			if(num2[0]+1 == num2[1] && num2[0]+2 == num2[2] && num2[0]+3 == num2[3] && num2[0]+4 == num2[4]) {
				if(flush2 == 1) {
					System.out.println("ストレートフラッシュ");
					score2 = 9;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}else {
					System.out.println("ストレート");
					score2 = 5;
					for(i = 0; i < 14; i++) {
						kazu2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						suit2[i] = 0;
					}
					for(i = 0; i < 5; i++) {
						num2[i] = 0;
					}
				}
			}
		}

		//フラッシュ
		if(flush2 == 1) {
			System.out.println("フラッシュ");
			score2 = 6;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}


		//フォーカード,スリーカード
		if(kazu2[13] == 4) {
			System.out.println("フォーカード( ﾟДﾟ)");
			score2 = 8;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}else if(kazu2[13] == 3 && kazu2[12] == 2) {
			System.out.println("フルハウス('ω')");
			score2 = 7;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}else if(kazu2[13] == 3) {
			System.out.println("スリーカード");
			score2 = 4;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}

		//ワンペア,ツーペア
		if(kazu2[12] == 2 && kazu2[13] == 2) {
			System.out.println("ツーペア");
			score2 = 3;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}else if(kazu2[13] == 2){
			System.out.println("ワンペア");
			score2 = 2;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}

		//ハイカード
		if(kazu2[13] == 1) {
			System.out.println("ハイカードm9(^Д^)ﾌﾟｷﾞｬｰ");
			score2 = 1;
			for(i = 0; i < 14; i++) {
				kazu2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				suit2[i] = 0;
			}
			for(i = 0; i < 5; i++) {
				num2[i] = 0;
			}
		}

		//勝敗判定
		if(score > score2) {
			System.out.println("1Pの勝ちです");
			System.exit(0);
		}else if(score < score2) {
			System.out.println("2Pの勝ちです");
			System.exit(0);
		}else if(score == score2) {
			System.out.println("引き分け('ω')");
			System.exit(0);
		}
	}

}
