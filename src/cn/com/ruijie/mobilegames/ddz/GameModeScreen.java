package cn.com.ruijie.mobilegames.ddz;

import java.util.List;

import android.util.Log;

import cn.com.ruijie.mobilegames.framework.Game;
import cn.com.ruijie.mobilegames.framework.Graphics;
import cn.com.ruijie.mobilegames.framework.Input.TouchEvent;
import cn.com.ruijie.mobilegames.framework.Screen;

public class GameModeScreen extends Screen {

	public static final String TAG = "GameModeScreen";
	
	public GameModeScreen(Game game) {
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
				if (inBounds(touchEvent, 185, 85, 70, 53)) {
					Log.d(TAG, "选择新手区");
					game.setScreen(new GameScreen(game));
					Assets.specOK.play(1);
				}
			}
		}
	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.background2, 0, 0);
	}

	@Override
	public void pause() {
		Assets.musicWelcom.stop();
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
