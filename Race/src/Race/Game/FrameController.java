package Race.Game;

import javax.swing.*;

public class FrameController {
    public static void drawFrame() {
        //настраеваем окно
        Main.frame.setSize(660, 500);
        Main.frame.setResizable(false);
        Main.frame.setLocationRelativeTo(null);
        Main.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //добавляем элементы в окно
        Main.frame.add(Main.writer);
        Main.frame.addKeyListener(new Race.Game.KeyController());
        //делаем окно видимым
        Main.frame.setVisible(true);
    }
}