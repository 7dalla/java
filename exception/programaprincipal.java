public class programaprincipal {

    public static void main(String[] args) {
        int num = consoleutils.lerInteiro("Digite um número inteiro:");
        try{
        long fat = fatorial.calcular(num);
        System.out.printf("%d! = %d", num, fat);}
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            
        }
    }   
}
    