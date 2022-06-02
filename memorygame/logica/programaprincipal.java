package logica;

import grafica.frmjogomemoria;

public class programaprincipal {
    public static void main(String[] args) {
        frmjogomemoria frm = new frmjogomemoria();
        frm.setVisible(true);
        frm.viewboard();
        try{
            Thread.sleep(5000);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
        frm.hideboard();
    }
    
}
