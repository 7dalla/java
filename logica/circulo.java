package logica;
public class circulo extends formageometrica {
    private double raio;
    public circulo(){}
    public circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public String preencherCor() {
        return "verde";
    }
}
