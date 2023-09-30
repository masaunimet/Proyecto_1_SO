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
public class Developer extends Worker{
    
    private float productionPerDay;
    private float acc = 0;
    private Drive drive;
    
    public Developer (WorkerTypeEnum type, float pp, float costPerHour, Drive drive, Semaphore m, CompanyRules gameRules){
        super(type,costPerHour,m,gameRules);
        this.productionPerDay = pp;
        this.drive = drive;
    }

    @Override
    public void run() {
        
        while(true) {
           
            try {
                	
                Work();
                sleep(dayDuration);
               
            } catch (InterruptedException ex) {
                //Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void Work(){
    
        this.acc += this.productionPerDay;
        this.daysWorked++;
    
        while (this.acc >= 1){
            try {
            // sección critica
                this.mutex.acquire(1);
                this.drive.addProduct(1, type);
              
                this.acc= acc -1;
                if(acc < 0)
                    acc=0;
                this.mutex.release();
                
            } catch (InterruptedException ex) {
            //Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        switch(this.type) {
            case DLC:
                System.out.println("DLCs Hechos: "+this.drive.getDLCs());
                break;
            case Sistem:
                System.out.println("Sistemas Hechos: "+this.drive.getSistems());
                break;
            case Narrative:
                System.out.println("Narrativas Hechos: "+this.drive.getNarrative());
                break;
            case Level:
                System.out.println("Niveles Hechos: "+this.drive.getLevels());
                break;
            case Sprite:
                System.out.println("Sprites Hechos: "+this.drive.getSprites());
                break;
            default:
                break;
            }
    }
}
