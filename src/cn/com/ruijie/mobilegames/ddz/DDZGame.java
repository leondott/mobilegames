package cn.com.ruijie.mobilegames.ddz;

import cn.com.ruijie.mobilegames.framework.Screen;
import cn.com.ruijie.mobilegames.framework.impl.AndroidGame;

public class DDZGame extends AndroidGame {

	@Override
	public Screen getStartScreen() {
		return new LoadingScreen(this);
	}

}
