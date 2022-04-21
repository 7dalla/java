public class programaprincipal {

    public static void main(String[] args) {
        ponto pt1 = new ponto();
        ponto pt2 = new ponto(5,10);
        ponto pt3 = new ponto(7, 10);

        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt3);

        System.out.printf("distancia pt1 -> origem = %f\n", pt1.distancia());
        System.out.printf("distancia pt1 -> pt2 = %f\n", pt1.distancia(pt2));
        System.out.printf("distancia pt2 -> pt3 = %f\n", pt2.distancia(pt3));


    }
    
}
