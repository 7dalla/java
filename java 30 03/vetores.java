import java.util.Scanner;
import java.util.Random;

public class vetores{
    public static Scanner input;
    public static int[] vetor;

    public static void sortear(){
        Random generator = new Random();
        vetor = new int[20];
        for(int i=0; i<vetor.length; i++){
            vetor[i] = generator.nextInt(100) + 1;
        }
    }

    public static int procurar(int n){
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        sortear();
        input = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = input.nextInt();
        int pos = procurar(num);
        if(pos >=0){
            System.out.printf("numero encontrado na posicao %d", pos);}
            else{
                System.out.println("numero nao encontrado");
            }
            input.close();
        }
    }