 package grafica;

 import javax.swing.JToggleButton;

 public class button extends JToggleButton{
     private int number;

     public button(int number){
         this.number = number;
     }

     public void view(){
         setSelected(true);
         setText(Integer.toString(number));
     }

     public void hide(){
         setSelected(false);
         setText("");
     }
 }