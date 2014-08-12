package cn.com.ruijie.mobilegames.ddz;

import cn.com.ruijie.mobilegames.framework.Game;
import cn.com.ruijie.mobilegames.framework.Graphics;
import cn.com.ruijie.mobilegames.framework.Screen;

public class GameScreen extends Screen {

	public GameScreen(Game game) {
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.background3, 0, 0);
	}

	@Override
	public void pause() {
		Assets.musicNormal2.stop();
	}

	@Override
	public void resume() {
		Assets.musicNormal2.setLooping(true);
		Assets.musicNormal2.play();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
