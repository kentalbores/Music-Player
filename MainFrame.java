import javax.swing.*;
class MainFrame extends JFrame{
   MainPanel mainPanel = new MainPanel();
   MainFrame(){
      add(mainPanel);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      pack();
      setLocationRelativeTo(null);
      setTitle("Music Player");
      setResizable(false);
   }
}