package cn.com.ruijie.mobilegames.ddz;

import android.provider.MediaStore.Audio;
import android.util.Log;
import cn.com.ruijie.mobilegames.framework.Game;
import cn.com.ruijie.mobilegames.framework.Graphics;
import cn.com.ruijie.mobilegames.framework.Input.TouchEvent;
import cn.com.ruijie.mobilegames.framework.Screen;
import cn.com.ruijie.mobilegames.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {

	public static final String TAG = "LoadingScreen";
	
	public LoadingScreen(Game game) {
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		Assets.background1 = g.newPixmap("background1.png", PixmapFormat.RGB565);
		Assets.background2 = g.newPixmap("background2.png", PixmapFormat.ARGB4444);
		Assets.background3 = g.newPixmap("background3.png", PixmapFormat.ARGB4444);
		Assets.menu1 = g.newPixmap("menu1.png", PixmapFormat.ARGB4444);
		Assets.menu2 = g.newPixmap("menu2.png", PixmapFormat.ARGB4444);
		Assets.menu3 = g.newPixmap("menu3.png", PixmapFormat.ARGB4444);
		Assets.menu4 = g.newPixmap("menu4.png", PixmapFormat.ARGB4444);
		Assets.menu5 = g.newPixmap("menu5.png", PixmapFormat.ARGB4444);
		
		Assets.musicWelcom = game.getAudio().newMusic("music_welcome.ogg");
		Assets.musicNormal2 = game.getAudio().newMusic("music_normal2.ogg");
		
		Assets.specOK = game.getAudio().newSound("spec_ok.ogg");
		
		game.setScreen(new MainMenuScreen(game));
		Log.d(TAG, "LoadingScreen update");
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
}
