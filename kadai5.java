package kadai5;

import java.applet.Applet;
import java.awt.*;

public class kadai5 extends Applet{
	Dimension size;
	Image back;
	Graphics buffer;
	int block[][];
	int dx[] = {0, 1, 0, -1};
	int dy[] = {1, 0, -1, 0};

	public void init(){
		size = getSize();
		back = createImage(size.width, size.height);
		buffer = back.getGraphics();
		block = new int[21][21];
		makeMaze();
	}

	private void makeMaze(){
		//全体クリア
		for(int i = 0; i < 21; i++){
			for(int j = 0; j < 21; j++){
				block[i][j] = 0;
			}
		}

		//外枠セット
		for(int i = 0; i < 21; i++){
			block[0][i] = 1;
			block[20][i] = 1;
			block[i][0] = 1;
			block[i][20] = 1;
		}

		//基準点セット
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				block[i * 2][j * 2] = 1;
			}
		}

		//迷路作成
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				if(i == 1){
					int d = (int)(Math.random() * 4);
					block[i * 2 + dx[d]][j * 2 + dy[d]] = 1;
				}else{
					boolean flag = true;
					while(flag){
						int d = (int)(Math.random() * 3);
						if(block[i * 2 + dx[d]][j * 2 + dy[d]] == 0){
							block[i * 2 + dx[d]][j * 2 + dy[d]] = 1;
							flag = false;
						}
					}
				}
			}
		}
	}

	public void paint(Graphics g){
		//道描画
		buffer.setColor(Color.green);
		buffer.fillRect(0, 0, size.width, size.height);

		//壁描画
		for(int i = 0; i < 21; i++){
			for(int j = 0; j < 21; j++){
				if(block[i][j] == 1){
					buffer.setColor(Color.black);
					buffer.fillRect(j * 15, i * 15, 15, 15);
					buffer.setColor(Color.white);
					buffer.drawRect(j * 15 + 1, i * 15 + 1, 13, 13);
				}
			}
		}

		//スタート
		buffer.setColor(Color.blue);
		buffer.fillRect(15 + 1, 15 + 1, 13, 13);
		//ゴール
		buffer.setColor(Color.red);
		buffer.fillRect(15 * 19 + 1, 15 * 19 + 1, 13, 13);
		//大きさ指定
		resize(315,315);
		g.drawImage(back, 0, 0, this);
	}
}