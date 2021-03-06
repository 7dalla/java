package logica;
public class retangulo extends formageometrica {
    private double base;
    private double altura;
    public retangulo(){}
    public retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }
    @Override
    public String preencherCor() {
        return "azul";
    }
    
}
