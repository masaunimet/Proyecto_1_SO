/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Worker;

import Enums.WorkerTypeEnum;
import Rules.CompanyRules;
import Store.Drive;
import java.util.concurrent.Semaphore;

/**
 * Es el rol de los integradores que agarran los elementos para hacer un juego
 * @author Masa500
 */
public class Integrator extends Worker{
    
    private Drive drive;
    private boolean makingGame;
    private int gamesToGamesDLC;
    
    /**
     * Realiza el Constructor de Worker y luego las variables de su clase
     * @param type WorkerTypeEnum - Tipo de trabajo
     * @param gamesToGamesDLC int - Rango de dias para un juego con DLCs
     * @param costPerHour float - Costo por hora de trabajo
     * @param drive Drive - almacen donde albergar los elementos creados
     * @param m Semaphore - Semaforo
     * @param gameRules CompanyRules - datos de la compañia asociada
     */
    public Integrator (WorkerTypeEnum type, int gamesToGamesDLC, float costPerHour, Drive drive, Semaphore m, CompanyRules gameRules){
        super(type,costPerHour,m,gameRules);
        this.drive = drive;
        this.makingGame = false;
        this.gamesToGamesDLC = gamesToGamesDLC;
    }
    
    @Override
    public void run() {
        while(true) {
           
            try {
                	
                Work();
                //Si esta haciendo un juego espera 2 dias sino solo un dia
                if(makingGame)
                    sleep(2*dayDuration);
                else
                    sleep(dayDuration);
                
                this.makingGame = false;
               
            } catch (InterruptedException ex) {
                //Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void Work(){
    // TODO Auto-generated method stub
    
        this.daysWorked++;
        
        //Variable que verifica si es un juego estandar (false) o con DLC (true)
        boolean validation = (drive.getGames() >= gamesToGamesDLC && drive.getGames() % gamesToGamesDLC == 0)? 
            companyRules.canMakeGameDLC(drive.getLevels(), drive.getNarrative(), drive.getSprites(), drive.getSistems(), drive.getDLCs()): 
                companyRules.canMakeGame(drive.getLevels(), drive.getNarrative(), drive.getSprites(), drive.getSistems());
    
	if (validation) {
            
            //Quita los elementos del almacen y crea el juego
            drive.setSistems(drive.getSistems() - companyRules.getSistemsNeedIt());
            drive.setSprites(drive.getSprites() - companyRules.getSpritesNeedIt());
            drive.setLevels(drive.getLevels() - companyRules.getLevelsNeedIt());
            drive.setNarrative(drive.getNarrative() - companyRules.getNarrativeNeedIt());
            if(drive.getGames() >= gamesToGamesDLC && drive.getGames() % gamesToGamesDLC == 0)
                drive.setDLCs(drive.getDLCs() - companyRules.getDLCsNeedIt());
            
            drive.setGames(drive.getGames()+1);
            
            makingGame = true;
	}
        
        System.out.println("Juegos Hechos: "+drive.getGames());
    }
}
