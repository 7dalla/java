package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class actionconferir extends AbstractAction {
    private boolean waiting;
    private button firstpiece;
    private button[][] board;
    public actionconferir(button[][] board){
        this.board = board;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        button currentpiece = (button) e.getSource();
        if(waiting){ 
            currentpiece.view();
        }else{
            firstpiece = currentpiece;
            firstpiece.view();
            waiting = true;
        }
    }
}
