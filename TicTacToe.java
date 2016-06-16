
package tictactoe;


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("ALL")
public class TicTacToe extends JFrame {

    private JPanel screenPanel;
    private JPanel buttonPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JLabel pLabel1;
    private JLabel pLabel2;
    private JLabel valueP2;
    private JLabel valueP1;
    private String character;
    private int count = 0;
    private int XWins, OWins = 0;
    private boolean win = false;

    public TicTacToe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        screenPanel = new JPanel();
        buttonPanel = new JPanel();

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();

        pLabel2 = new JLabel();
        pLabel1 = new JLabel();
        valueP2 = new JLabel();
        valueP1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        screenPanel.setBorder(BorderFactory.createTitledBorder(null, "scoreboard", TitledBorder.RIGHT, TitledBorder.ABOVE_TOP, new Font("Dialog", 1, 12), new Color(51, 51, 255)));

        buttonPanel.setBorder(new LineBorder(new Color(51, 51, 255), 1, true));

        btn1.setToolTipText("");
        btn1.addActionListener(new defineEvent());

        btn2.setToolTipText("");
        btn2.addActionListener(new defineEvent());

        btn3.setToolTipText("");
        btn3.addActionListener(new defineEvent());

        btn4.setToolTipText("");
        btn4.addActionListener(new defineEvent());

        btn5.setToolTipText("");
        btn5.addActionListener(new defineEvent());

        btn6.addActionListener(new defineEvent());

        btn7.setToolTipText("");
        btn7.addActionListener(new defineEvent());

        btn8.addActionListener(new defineEvent());

        btn9.addActionListener(new defineEvent());


        GroupLayout buttonPanelLayout = new GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn9, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        pLabel2.setFont(new Font("Ebrima", 1, 14));
        pLabel2.setForeground(new Color(0, 51, 255));
        pLabel2.setText("pO :");

        pLabel1.setFont(new Font("Ebrima", 1, 14));
        pLabel1.setForeground(new Color(0, 51, 255));
        pLabel1.setText("pX :");

        valueP2.setForeground(new Color(0, 51, 255));
        valueP2.setText("0");

        valueP1.setForeground(new Color(0, 51, 255));
        valueP1.setText("0");
        valueP1.setToolTipText("");

        GroupLayout screenPanelLayout = new GroupLayout(screenPanel);
        screenPanel.setLayout(screenPanelLayout);
        screenPanelLayout.setHorizontalGroup(
                screenPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(buttonPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(screenPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(screenPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(screenPanelLayout.createSequentialGroup()
                                                .addComponent(pLabel2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(valueP2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(screenPanelLayout.createSequentialGroup()
                                                .addComponent(pLabel1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(valueP1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screenPanelLayout.setVerticalGroup(
                screenPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, screenPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(screenPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(pLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valueP1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(screenPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(pLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valueP2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(screenPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(screenPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }


        /* Create and display the form */

        EventQueue.invokeLater(() -> new TicTacToe().setVisible(true));
    }

    @SuppressWarnings("StringEquality")
    class defineEvent implements ActionListener {

        public void getTurn(){
            if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9){

            character = "X";
            valueP1.setText(" O turn");
            valueP2.setText(" wait...");
            }
            else if (count == 2 || count == 4 || count == 6 || count == 8){
            character = "O";
            valueP2.setText(" X turn");
            valueP1.setText(" wait...");
        }
        }

        public void getWinStatus(){
            /**
             * check Horizontal
             */
                 if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != ""){win = true;
                     valueP1.setText("p"+btn2.getText()+" wins!"); valueP2.setText("sorry!");}
            else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn4.getText() != "" && btn5.getText() != "" && btn5.getText() != ""){win = true; determineWinner();}
            else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != ""){win = true; determineWinner();}
             /**
             * check vertically
             */
            else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn1.getText() != "" && btn4.getText() != "" && btn7.getText() != ""){win = true; determineWinner();}
            else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != "" && btn5.getText() != "" && btn8.getText() != ""){win = true; determineWinner();}
            else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != "" && btn6.getText() != "" && btn9.getText() != ""){win = true; determineWinner();}
            /**
             * check vertically
             */
            else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn1.getText() != "" && btn5.getText() != "" && btn9.getText() != ""){win = true; determineWinner();}
            else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn3.getText() != "" && btn5.getText() != "" && btn7.getText() != ""){win = true; determineWinner();}
        }



        //Show who wins or if a tie
        void determineWinner(){
            if (win == true)
            {
                JOptionPane.showMessageDialog(null, "and there is a Winner!!!");

            }
            else if (count == 9 && win == false)
            {
                JOptionPane.showMessageDialog(null, "Draw...No Winner!!!");
            }

        }

        public void actionPerformed(ActionEvent evt) {
            count++;
            getTurn(); //Who's Turn It is
            getWinStatus();

            //Displaying an X or O on the buttons
            if (evt.getSource() == btn1){
                btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
                btn1.setText(character); if(btn1.getText() == "X")btn1.setForeground(Color.blue); else btn1.setForeground(Color.red);
                btn1.setEnabled(false);
            } else if (evt.getSource() == btn2){
                btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
                btn2.setText(character); if(btn2.getText() == "X")btn2.setForeground(Color.blue); else btn2.setForeground(Color.red);
                btn2.setEnabled(false);
            } else if (evt.getSource() == btn3){
                btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
                btn3.setText(character);  if(btn3.getText() == "X")btn3.setForeground(Color.blue); else btn3.setForeground(Color.red);
                btn3.setEnabled(false);
            } else if (evt.getSource() == btn4){
                btn4.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn4.setText(character);  if(btn4.getText() == "X")btn4.setForeground(Color.blue); else btn4.setForeground(Color.red);
                btn4.setEnabled(false);
            } else if (evt.getSource() == btn5){
                btn5.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn5.setText(character);  if(btn5.getText() == "X")btn5.setForeground(Color.blue); else btn5.setForeground(Color.red);
                btn5.setEnabled(false);
            } else if (evt.getSource() == btn6){
                btn6.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn6.setText(character);  if(btn6.getText() == "X")btn6.setForeground(Color.blue); else btn6.setForeground(Color.red);
                btn6.setEnabled(false);
            } else if (evt.getSource() == btn7){
                btn7.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn7.setText(character);  if(btn7.getText() == "X")btn7.setForeground(Color.blue); else btn7.setForeground(Color.red);
                btn7.setEnabled(false);
            } else if (evt.getSource() == btn8){
                btn8.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn8.setText(character);  if(btn8.getText() == "X")btn8.setForeground(Color.blue); else btn8.setForeground(Color.red);
                btn8.setEnabled(false);
            } else if (evt.getSource() == btn9){
                btn9.setFont(new Font("Times New Roman", Font.BOLD,30));
                btn9.setText(character);  if(btn9.getText() == "X")btn9.setForeground(Color.blue); else btn9.setForeground(Color.red);
                btn9.setEnabled(false);
            }


        }

        //track scores

        void Scores()
        {
            if(character.equals("X"))
            {
                XWins++;
            }
            else
            {
                OWins++;
            }

        }
    }
}
