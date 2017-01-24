package Projet;

import javax.swing.UIManager;
import java.awt.*;


public class Main {
  boolean packFrame = false;

  //Construct the application
  public Main() {
    Graphique frame = new Graphique();
    //Validate frames that have preset sizes
    //Pack frames that have useful preferred size info, e.g. from their layout
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    //Center the window
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = frame.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    frame.setLocation(0, 0);
    frame.setSize(screenSize.width,screenSize.height);
    frame.setVisible(true);
  }
  //Main method
  public static void main(String[] args) {
    try {
  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new Main();
  }
}