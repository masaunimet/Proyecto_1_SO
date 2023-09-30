/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Worker;

import Enums.WorkerTypeEnum;
import Rules.CompanyRules;
import Store.Drive;
import static Enums.WorkerTypeEnum.Level;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Masa500
 */
public abstract class Worker extends Thread{
    
    protected WorkerTypeEnum type;
    protected int dayDuration = 1000;
    protected int daysWorked=0;
    protected float costPerHour;
    protected Semaphore mutex;
    protected CompanyRules companyRules;
    
    public Worker (WorkerTypeEnum type,  float costPerHour,  Semaphore m, CompanyRules gameRules){
        this.type = type;
        this.costPerHour = costPerHour;
        this.mutex = m;
        this.companyRules = gameRules;
    }

    @Override
    public abstract void run();

    public abstract void Work();
    
    public float getWorkerCostPerDay(boolean historical) {
    	 
    	return (historical)?costPerHour * 24f:costPerHour * 24f * this.daysWorked;
    }
}
