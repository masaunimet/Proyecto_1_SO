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
 * Es el rol de los trabajadores que realizan Sprites, Guiones, Niveles , DLCs y Sistemas de juego
 * @author Masa500
 */
public class Developer extends Worker{
    
    private float productionPerDay;
    private float acc = 0;
    private Drive drive;
    
    /**
     * Realiza el Constructor de Worker y luego las variables de su clase
     * @param type WorkerTypeEnum - Tipo de trabajo
     * @param pp float - Produccion por hora de trabajo
     * @param cph float - Costo por hora de trabajo
     * @param drive Drive - almacen donde albergar los elementos creados
     * @param m Semaphore - Semaforo
     * @param gameRules CompanyRules - datos de la compañia asociada
     */
    public Developer (WorkerTypeEnum type, float pp, float cph, Drive drive, Semaphore m,CompanyRules gameRules){
        super(type,cph,m,gameRules);
        this.productionPerDay = pp;
        this.drive = drive;
    }

    @Override
    public void run() {
        
        while(hired) {
           
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
        
        try {
        //Mientra que la cantidad de trabajo acumulado sea menos a 1
            while (this.acc >= 1){
            
                this.mutex.acquire(1); // Envia a la cola al semaforo
                this.drive.addProduct(1, type);  //Agrega el producto al drive
              
                this.acc= acc -1;
                if(acc < 1)
                        acc=0;
                
                this.mutex.release(); //Signal
                
            } 
           
        //Aplica los pagos 
        drive.getCostsMutex().acquire();
        
        switch(this.type) {
            case DLC:
                drive.setDLCCost(drive.getDLCCost()+this.costPerHour*24);
                break;
            case Sistem:
                drive.setSistemCost(drive.getSistemCost()+this.costPerHour*24);
                break;
            case Narrative:
                drive.setNarrativeCost(drive.getNarrativeCost()+this.costPerHour*24);
                break;
            case Level:
                drive.setLevelsCost(drive.getLevelsCost()+this.costPerHour*24);
                break;
            case Sprite:
                drive.setSpriteCost(drive.getSpriteCost()+this.costPerHour*24);
                break;
            default:
                break; 
            }
        
        drive.getCostsMutex().release();
        
        } catch (InterruptedException ex) {
            //Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
