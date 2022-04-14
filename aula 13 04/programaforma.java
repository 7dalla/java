public class programaforma {
    public static void main(String[] args) {
        formageometrica obj1 = new formageometrica();
        System.out.println(obj1.toString() + " - " + obj1.getCorPreenchimento());

        formageometrica obj2 = new circulo();
        System.out.println(obj2.toString() + " - " + obj2.getCorPreenchimento()); 

        formageometrica obj3 = new retangulo();
        System.out.println(obj3.toString() + " - " + obj3.getCorPreenchimento());

        formageometrica obj4 = new triangulo();
        System.out.println(obj4.toString() + " - " + obj4.getCorPreenchimento());
    }
}