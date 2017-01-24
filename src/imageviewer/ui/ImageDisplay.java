package imageviewer.ui;

import imageviewer.model.Image;

public interface ImageDisplay {

    public Image getCurrentImage();
    public void display(Image image);

    
}
