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
 * Clase abstracta del trabajador que implementa metodos para trabajar y ver sus costos 
 * @author Masa500
 */
public abstract class Worker extends Thread{
    
    protected WorkerTypeEnum type;
    protected int dayDuration = 500;
    protected int daysWorked = 0;
    protected float costPerHour;
    protected Semaphore mutex;
    protected CompanyRules companyRules;
    protected boolean hired;
    
    /**
     * Constructor Base para un trabajador
     * @param type WorkerTypeEnum - Tipo de trabajo
     * @param cph float - Costo por hora de trabajo
     * @param m Semaphore - Semaforo
     * @param gameRules CompanyRules - datos de la compañia asociada
     */
    public Worker (WorkerTypeEnum type,  float cph,  Semaphore m, CompanyRules gameRules){
        this.type = type;
        this.costPerHour = cph;
        this.mutex = m;
        this.companyRules = gameRules;
        this. hired = true;
    }

    /**
     *  Metodo heredado de Thread que llama al hacer Start() al Worker
     */
    public abstract void run();

    /**
     * Metodo de trabajo del Worker
     */
    public abstract void Work();
    
    /**
     * Da los gastos por dia o historicos
     * @param historical boolean - (true) si es historico y (false) si es detallado
     * @return float - cantidad de gastos
     */
    public float getWorkerCostPerDay(boolean historical) {
    	 
    	return (!historical)?costPerHour * 24f:costPerHour * 24f * this.daysWorked;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }
    
    
}
