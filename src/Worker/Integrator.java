/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Worker;

import Enums.WorkerTypeEnum;
import static Enums.WorkerTypeEnum.DLC;
import static Enums.WorkerTypeEnum.Level;
import static Enums.WorkerTypeEnum.Narrative;
import static Enums.WorkerTypeEnum.Sistem;
import static Enums.WorkerTypeEnum.Sprite;
import Rules.CompanyRules;
import Store.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Masa500
 */
public class Integrator extends Worker{
    
    
    private Drive drive;
    private boolean makingGame;
    
    public Integrator (WorkerTypeEnum type, float costPerHour, Drive drive, Semaphore m, CompanyRules gameRules){
        super(type,costPerHour,m,gameRules);
        this.drive = drive;
        this.makingGame = false;
    }
    
    @Override
    public void run() {
        while(true) {
           
            try {
                	
                Work();
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
    
    public void Work(){
    // TODO Auto-generated method stub
    
        this.daysWorked++;
    
	if (companyRules.canMakeGame(drive.getLevels(), drive.getNarrative(), drive.getSprites(), drive.getSistems())) {
            
            drive.setGames(drive.getGames()+1);
            drive.setSistems(drive.getSistems() - companyRules.getSistemsNeedIt());
            drive.setSprites(drive.getSprites() - companyRules.getSpritesNeedIt());
            drive.setLevels(drive.getLevels() - companyRules.getLevelsNeedIt());
            drive.setNarrative(drive.getNarrative() - companyRules.getNarrativeNeedIt());
            makingGame = true;
	}
    }
}
