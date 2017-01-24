package imageviewer.model;

import java.io.InputStream;

public interface Image {

    public InputStream inputStream();

    public Image prev();
    public Image next();
    
}
