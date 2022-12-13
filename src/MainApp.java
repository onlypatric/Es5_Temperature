/**
 * Progetto Temperature
 * 
 * @author Pintescul Patric
 * @version 1.0
 */
import pkg.util.RUtil;
public class MainApp {
    public static void main(String[] args) {
        RUtil r = new RUtil();

        int casuale;

        int subZeroCounter=0;
        int FivePlusCounter=0;

        int max=-10;
        int maxHour=0;
        int MaxHourCounter=0;

        int limite_giorno=24;
        
        //genero 24 (le ore di una giornata) temperature casuali tra -10 e 9 Gradi
        for ( int i=0; i<limite_giorno; i++){
            casuale=r.randInt(-10, 9);
            //System.out.println("Ora: " + i + " Temperatura: " + casuale+"°");
            // stampa migliorata con l'uso di format
            if (casuale<0){
                subZeroCounter++;
            }
            else if(casuale>5){
                FivePlusCounter++;
            }
            if(casuale>max){
                MaxHourCounter=0;
                max=casuale;
                maxHour=i;
            }
            if(casuale==max){
                MaxHourCounter++;
            }
            System.out.format("H: %2d - Deg: %2d°\n",i,casuale);
        }

        /** 
         * @todo [difficoltà 1]
         * dire quante ore della giornata la temperature sono sotto zero (zero gradi esclusi) 
         * 
         */
        System.out.printf("Counted sub-zero temperatures:%5d\n",subZeroCounter);
        System.out.println("_".repeat(60));
    
        /** 
         * @todo [difficoltà 2]
         * dire quante ore della giornata la temperature sono superiori al Gradi 5 ( 5 escluso) 
         * 
         */
        System.out.printf("Counted >5 temperatures:%5d\n",FivePlusCounter);
        System.out.println("_".repeat(60));
        /**
         * @todo [difficoltà 3]
         * dire a che ora della giornata c'è stata la temperatura massima
         * 
         */
        System.out.printf("Max temperature registered:%5d\nhighest temperature last registered at hour:%5d\nmax temperature repeated %d times\n",max,maxHour,MaxHourCounter);
        
    }
}
