package logica;
public class triangulo extends formageometrica {
    private double base;
    private double altura;
    
    public triangulo(){}

    public triangulo(double base, double altura){
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
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public String preencherCor() {
        return "amarelo";
    }
    }
    