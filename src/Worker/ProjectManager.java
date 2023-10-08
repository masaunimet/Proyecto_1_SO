/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Worker;

import Enums.WorkerTypeEnum;
import Rules.CompanyRules;
import Store.Drive;
import java.util.concurrent.Semaphore;

/**
 *Este es el rol del project Manajer
 * @author Andres
 */
public class ProjectManager extends Worker {

    private Drive drive;
    

    
        
    public ProjectManager(WorkerTypeEnum type, float cph, Semaphore m, CompanyRules gameRules, Drive drive) {
        super(type, cph, m, gameRules);
        this.drive = drive;
            
    }

    @Override
    public void run() {
        while (true){
            try {
                
            // Media hora = un dia entre 24 horas entre 2
            double halfHour = dayDuration / 48; 
            int counter = 0;
            
            // 16 horas al dia
            while (counter < 16 ) {
                
                    drive.setPmStatus(0);
                    
                    //Si el director lo esta vigilando entonces
                    if (drive.getDirectorStatus() == 0){
                        //TODO: poner lo que va a hacer 
                        
                        drive.setFaltas(drive.getFaltas() + 1);
                        drive.setSalaryDiscount(drive.getSalaryDiscount() + 50);
                        
                    }
                    
                    sleep(Math.round(halfHour));

                    drive.setPmStatus(1);
                    sleep(Math.round(halfHour));
                    counter++;
                }
            
            drive.setPmStatus(0);
            
            
            sleep(Math.round(halfHour*16));
            drive.getDaysMutex().acquire();
            drive.setDaysUntilRelease(drive.getDaysUntilRelease()-1);
            drive.getDaysMutex().release();
            
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        
    }

    @Override
    public void Work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
