package grafica;
import javax.swing.*;
import java.awt.*;

public class frameCalculadoraGeometrica extends JFrame{
    private JTextField txtCircuferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    
    public frameCalculadoraGeometrica(){
        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 5,  10, 50));
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createTitledBorder("circulo"));
        add(painel);
        painel = new JPanel();
        painel.setBorder(BorderFactory.createTitledBorder("retangulo"));
        add(painel);
        painel = new JPanel();
        painel.setBorder(BorderFactory.createTitledBorder("triangulo"));
        add(painel);
    }
}