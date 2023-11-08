import javax.swing.*;
import java.awt.*;
import java.util.*;
class MainPanel extends JPanel{
   JPanel bottomPanel = new JPanel();
   JPanel centerPanel = new JPanel();
   JButton play = new JButton(), pause = new JButton(), stop = new JButton();
   ArrayList<JButton> songs = new ArrayList<>();
   MainPanel(){
      setPreferredSize(new Dimension(1000,500));
      setLayout(new BorderLayout());
      add(bottomPanel,BorderLayout.SOUTH);
      add(centerPanel,BorderLayout.CENTER);
      centerPanel.setBackground(new Color(178,127,255));
      
      setBackground(Color.GRAY);
      bottomPanel.setLayout(new GridLayout(1,3));
      bottomPanel.setPreferredSize(new Dimension(1000,50));
      bottomPanel.add(play);
      bottomPanel.add(stop);
      bottomPanel.add(pause);
      play.setText("PLAY");
      stop.setText("STOP");
      pause.setText("PAUSE");
      play.addActionListener(e -> {
         System.out.println("Music Playing");
      });
      stop.addActionListener(e -> {
         System.out.println("Music Stopped");
      });
      pause.addActionListener(e -> {
         System.out.println("Music Paused");
      });
      
   }
}