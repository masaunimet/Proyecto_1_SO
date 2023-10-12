/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Worker;

import Enums.WorkerTypeEnum;
import Rules.CompanyRules;
import Store.Drive;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Es el rol de los integradores que agarran los elementos para hacer un juego
 *
 * @author Masa500
 */
public class Integrator extends Worker {

    private final Drive drive;
    private boolean makingGame;
    private int gamesToGamesDLC;

    /**
     * Realiza el Constructor de Worker y luego las variables de su clase
     *
     * @param type WorkerTypeEnum - Tipo de trabajo
     * @param gamesToGamesDLC int - Rango de dias para un juego con DLCs
     * @param cph float - Costo por hora de trabajo
     * @param drive Drive - almacen donde albergar los elementos creados
     * @param m Semaphore - Semaforo
     * @param gameRules CompanyRules - datos de la compañia asociada
     */
    public Integrator(WorkerTypeEnum type, int gamesToGamesDLC, float cph, Drive drive, Semaphore m, CompanyRules gameRules) {
        super(type, cph, m, gameRules);
        this.drive = drive;
        this.makingGame = false;
        this.gamesToGamesDLC = gamesToGamesDLC;
    }

    /*
    observaciones dde integrator:
    
    1. ¿Cuando valida que el juego pueda ser creado?
    2. No estamos creando los DLCs en unna carpeta especial. Es necesario
    3. El juego se agrega realmente una vez se termina de crear el juego, ahora se crea y el tipo duerme. Deberia de ser al revés creo.
    
     */
    @Override
    public void run() {
        while (hired) {

            try {

                Work();
                //Si esta haciendo un juego espera 2 dias sino solo un dia
                if (makingGame) {
                    sleep(2 * dayDuration);

                    drive.getCostsMutex().acquire();
                    drive.setIntegratorCost(drive.getIntegratorCost() + costPerHour * 48);
                    drive.getCostsMutex().release();

                } else {
                    sleep(dayDuration);

                    drive.getCostsMutex().acquire();
                    drive.setIntegratorCost(drive.getIntegratorCost() + costPerHour * 24);
                    drive.getCostsMutex().release();

                }

                this.makingGame = false;

            } catch (InterruptedException ex) {
                //Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void Work() {
        // TODO Auto-generated method stub

        this.daysWorked++;

        try {
            drive.getProducerMutex().acquire();

            //Variable que verifica si es un juego estandar (false) o con DLC (true)
            boolean validation = (drive.getGames() >= gamesToGamesDLC && drive.getGames() % gamesToGamesDLC == 0)
                    ? companyRules.canMakeGameDLC(drive.getLevels(), drive.getNarrative(), drive.getSprites(), drive.getSistems(), drive.getDLCs())
                    : companyRules.canMakeGame(drive.getLevels(), drive.getNarrative(), drive.getSprites(), drive.getSistems());

            if (validation) {

                //Quita los elementos del almacen y crea el juego
                drive.setSistems(drive.getSistems() - companyRules.getSistemsNeedIt());
                drive.setSprites(drive.getSprites() - companyRules.getSpritesNeedIt());
                drive.setLevels(drive.getLevels() - companyRules.getLevelsNeedIt());
                drive.setNarrative(drive.getNarrative() - companyRules.getNarrativeNeedIt());
                drive.getConsumerMutex().acquire();
                if (drive.getGames() >= gamesToGamesDLC && drive.getGames() % gamesToGamesDLC == 0) {
                    drive.setDLCs(drive.getDLCs() - companyRules.getDLCsNeedIt());
                } 
                
                
                if (drive.getGamesReleasedSinceLastDLC() != gamesToGamesDLC){
                    drive.setGames(drive.getGames() + 1);
                    drive.setGamesReleasedSinceLastDLC(drive.getGamesReleasedSinceLastDLC() + 1 );
                }else{
                    drive.setGamesWithDlc(drive.getGamesWithDlc() + 1);
                    drive.setGamesReleasedSinceLastDLC(0);
                    
                }
                drive.getConsumerMutex().release();

                makingGame = true;
            }
            drive.getProducerMutex().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Integrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
