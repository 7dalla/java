import java.util.Scanner; 


public class consoleutils{
    public static int lerInteiro(String msg){
        System.out.print(msg);
        Scanner input = new Scanner(System.in);
        String linhadigitada = input.next();
        try{
        int num = Integer.parseInt(linhadigitada);
        input.close();
            return num;}
        catch(NumberFormatException ex){
            System.out.println("Valor informado não é um número inteiro válido, tente novamente.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();

        }
        return 0;
        
        

    }
}