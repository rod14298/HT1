/**
 * Julio Isaac Rodriguez 14298
 * Julian Lopez 14084
 * 13.07.2016
 ** HDT1
 **/

import javax.swing.JFrame;

public final class main extends JFrame {
    private final int OFFSET = 30;

    public main() {
        InitUI();
    }
    /**
     * Se crea un Jframe 
     */
    public void InitUI() {
        gui board = new gui();
        add(board);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 170);
        setLocationRelativeTo(null);
        setTitle("Radio_Sonica");
    }

    public static void main(String[] args) {
        main v = new main();
    v.setVisible(true);
}
}
