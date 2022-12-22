import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task3 extends JFrame {
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile = {{"Файл", "Ф", "", ""}, {"Открыть", "О", "O", ""}, {"Сохранить", "С", "S", ""}};
    private  final  String[][]  menuInfo = {{"Cправка", "С", "", ""}, {"Информация" , "И", "I", ""}};
    private  final  String[][]  menuEdit = {{"Правка", "П", "", ""}, {"Вырезать" , "В", "X", "images/cut.png"}, {"Копировать", "К", "C", "images/copy.png"}};
    private JMenu createMenuItems(final String[][] items) {

        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {

            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0));

            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0), KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0) {
                item.setIcon(new ImageIcon(items[i][3]));
            }
            menu.add(item);
        }
        return menu;

    }
    public task3() {
        super();
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuItems(menuFile));
        menuBar.add(createMenuItems(menuEdit));
        menuBar.add(createMenuItems(menuInfo));
        menuBar.add(Box.createHorizontalGlue());
        setJMenuBar(menuBar);
        setSize(400, 400);
        final TextField tf=new TextField();
        tf.setBounds(50,100, 150,20);
        tf.setText("Добро пожаловать в мир Джава.");
        Button b=new Button("Click Here");
        b.setBounds(0,25,60,30);
        add(b);
        Button c=new Button("Erase");
        c.setBounds(70,25,60,30);
        add(b);
        add(c);
        add(tf);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task3();
    }
}