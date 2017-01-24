package imageviewer;

import imageviewer.ui.ImageDisplay;
import imageviewer.ui.swing.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    
    private ImageDisplay imageDisplay;

    public MainFrame() {
        setTitle("Image Viewer");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(toolbar(), BorderLayout.SOUTH);
        this.add(imageDisplay());
        setVisible(true);
    }

    private Component toolbar() {
        final JPanel panel = new JPanel();
        panel.add(prevButton());
        panel.add(nextButton());
        return panel;
    }

    private Component prevButton() {
        final JButton button = new JButton("<");
        button.addActionListener(loadPrevImage());
        return button;
    }

    private Component nextButton() {
        final JButton button = new JButton(">");
        button.addActionListener(loadNextImage());
        return button;
    }
    
    private Component imageDisplay() {
        SwingImageDisplay display = new SwingImageDisplay();
        imageDisplay = display;
        return display;
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private ActionListener loadPrevImage() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.display(imageDisplay.getCurrentImage().prev());
            }
        };
    }

    private ActionListener loadNextImage() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.display(imageDisplay.getCurrentImage().next());
            }
        };
    }

}
