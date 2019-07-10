package kadai4;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JButton;

//ライフゲームで使用するCell
class LifeCell extends JButton{

	private ArrayList<LifeCell> surroundings;

	private boolean isLiving = false;

	private boolean willLiving = false;

	public LifeCell(){
		super("");
		surroundings = new ArrayList<LifeCell>();
		setLayout();
	}

	public LifeCell(Rectangle rect) {
		super("");
		this.setBounds(rect);
		surroundings = new ArrayList<LifeCell>();
		setLayout();
	}

	//レイアウトの設定
	private void setLayout(){
		this.setLayout(null);
		this.setBackground(Color.white);
        this.setContentAreaFilled(true);
        this.setOpaque(true);
        this.setBorderPainted(false);
		LifeCell button = this;

		this.addActionListener(
				new ActionListener(){
						public void actionPerformed(ActionEvent event){
							if(button.isLiving){
								button.forceKill();
							}else{
								button.forceSpawn();
							}
						}
					}
				);
	}

	public void addSurroundings(LifeCell cell){
		surroundings.add(cell);
	}

	public void generationalChange(){
		isLiving = willLiving;
		willLiving = false;
		if(isLiving){
			setBackground(Color.black);
		}else{
			setBackground(Color.white);
		}
	}

	public void checkSurroundings(){
		int cnt = 0;
		for(LifeCell cell : surroundings){
			if(cell.isLiving) cnt++;
		}
		//誕生
		if(!isLiving){
			//生きているセルが3つ
			if(cnt == Const.BIRTH_CNT){
				this.willLiving = true;
			}
			return;
		}

		if(isLiving){
			//生存
			if(Const.LIVING_RANGE.includes(cnt)){
				this.willLiving = true;
			}
			//過疎
			if(Const.LIVING_RANGE.lowerBound > cnt){
				this.willLiving = false;
			}
			//過密
			if(Const.LIVING_RANGE.upperBound < cnt){
				this.willLiving = false;
			}
		}
	}

	//ボタンを押して生成する場合
	public void forceSpawn(){
		isLiving = true;
		this.setBackground(Color.black);
	}

	//ボタンを押してセルを消す場合
	public void forceKill(){
		isLiving = false;
		this.setBackground(Color.white);
	}

	//盤面初期化用
	public static void forceKillAll(ArrayList<LifeCell> cells){
		for(LifeCell cell : cells){
			cell.isLiving = false;
			cell.willLiving = false;
			cell.setBackground(Color.white);
		}
	}
}
