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
 *
 * @author Andres
 */
public class Director extends Worker {

    private Drive drive;

    public Director(WorkerTypeEnum wte, float f, Semaphore smphr, CompanyRules cr, Drive drive) {
        super(wte, f, smphr, cr);
        this.drive = drive;
    }

    @Override
    public void run() {
        while (true) {
            try {
                drive.getDaysMutex().acquire();
                if (drive.getDaysUntilRelease() == 0){
                    drive.getDaysMutex().release();
                    //Aqui estoy diciendo que si ya es el dia del lanzamiennto, el director aumenta la utilidad de la empresa de manera de que es la utilidad acutal mas la vetna de los dlcs mas la venta de los juegos regulares
                    drive.getConsumerMutex().acquire();
                    drive.setUtility(drive.getUtility() + drive.getGames()*this.companyRules.getIncome() + drive.getGames()*companyRules.getIncomeDLC());
                    drive.setGames(0);
                    drive.setGamesWithDlc(0);
                    drive.getConsumerMutex().release();
                
                } else {
                    drive.getDaysMutex().release();
                    
                    //El director escoge una hora del día aleatoriamente
                    
                   
                    
                }
            } catch (Exception e) {

            }
        }
    }

    @Override
    public void Work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
