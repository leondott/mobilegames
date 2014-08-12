package cn.com.ruijie.mobilegames.ddz;

import java.util.List;

import android.util.Log;
import android.widget.Toast;
import cn.com.ruijie.mobilegames.framework.Game;
import cn.com.ruijie.mobilegames.framework.Graphics;
import cn.com.ruijie.mobilegames.framework.Screen;
import cn.com.ruijie.mobilegames.framework.Input.TouchEvent;
import cn.com.ruijie.mobilegames.framework.impl.AndroidGame;

public class MainMenuScreen extends Screen{

	public static final String TAG = "MainMenuScreen";
	//�жϻ����Ƿ��л�
	//���л�pause������ֹͣ��������
	//��û���л�pause������ֹͣ��������
	private boolean isScreenChanged = false;
	
	public MainMenuScreen(Game game) {
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
		
		int length = touchEvents.size();
		for (int i = 0; i < length; i++) {
			TouchEvent touchEvent = touchEvents.get(i);
			if (touchEvent.type == TouchEvent.TOUCH_UP) {
				//�����ʼ��Ϸ��ť
				if (inBounds(touchEvent, 300, 60, 125, 33)) {
					Log.d(TAG, "�����ʼ��Ϸ��ť");
					isScreenChanged = true;
					Assets.specOK.play(1);
					game.setScreen(new GameModeScreen(game));
					return;
				}
			}
		}
	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.background1, 0, 0);
		g.drawPixmap(Assets.menu1, 300, 60);
		g.drawPixmap(Assets.menu2, 300, 100);
		g.drawPixmap(Assets.menu3, 300, 140);
		g.drawPixmap(Assets.menu4, 300, 180);
		g.drawPixmap(Assets.menu5, 300, 220);
	}

	@Override
	public void pause() {
		if (!isScreenChanged) {
			Assets.musicWelcom.stop();
		}
	}

	@Override
	public void resume() {
		Assets.musicWelcom.setLooping(true);
		Assets.musicWelcom.play();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	private boolean inBounds(TouchEvent event, int x, int y, int width, int height){
		if (event.x > x && event.x < x + width - 1 && event.y > y && event.y < y + height -1) {
			return true;
		}else{
			return false;
		}
	}

}
