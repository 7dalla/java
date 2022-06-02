package grafica;

import javax.swing.JFrame;

import logica.memorygame;

import java.awt.Dimension;
import java.awt.GridLayout;

public class frmjogomemoria extends JFrame{
    private button[][] board;
    private memorygame game;

    public frmjogomemoria(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(400,400));
        setTitle("memory game");

        game = new memorygame(){};
        int [][] numberboard = game.getnumberboard();

        board = new button[4][4];
        setLayout(new GridLayout(4,4,10,10));
        actionconferir action = new actionconferir(board);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<4; j++){
                button button = new button(numberboard[i][j]);
                add(button);
                board[i][j] = button;
                button.addActionListener(action);
            }
        
        }
    }

    public void viewboard(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j].view();
            }
    
}
}
    public void hideboard(){
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++){
                board[i][j].hide();
            }
    }
}
