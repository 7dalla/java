package logica;

import java.util.Random;

public class memorygame {
    private int[][] numberboard;
    public memorygame(){
        numberboard = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                numberboard[i][j] = drawnumber();}
            }
    }
    
    private int drawnumber(){
    while(true){
        int drawednumber = new Random().nextInt(8) + 1;
        int counter = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(drawednumber == numberboard[i][j]){
                    counter++;
                }
            }
        }
        if (counter < 2){
            return drawednumber;

        }
    }
    
}
public int[][] getnumberboard(){
    return numberboard;}
}

