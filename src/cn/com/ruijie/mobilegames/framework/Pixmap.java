package cn.com.ruijie.mobilegames.framework;

import cn.com.ruijie.mobilegames.framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
