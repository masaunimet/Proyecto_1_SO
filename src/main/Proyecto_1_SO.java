/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Enums.WorkerTypeEnum;
import Worker.Developer;
import Worker.Integrator;
import Worker.Worker;
import entities.CompanyRules;
import entities.CapcomRules;
import entities.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Masa500
 */
public class Proyecto_1_SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Semaphore mutex = new Semaphore(1);
        CompanyRules capcomRules = new CapcomRules();
        Drive drive = new Drive();
        
        Worker levelDesiner = new Developer(WorkerTypeEnum.Level,capcomRules.getLevelProductionPerDay(),capcomRules.getLevelCost(), drive,mutex,capcomRules);
        Worker DLCWorker = new Developer(WorkerTypeEnum.DLC,capcomRules.getDLCsProductionPerDay(), capcomRules.getDLCCost(),drive, mutex,capcomRules);
        Worker sistemWorker = new Developer(WorkerTypeEnum.Sistem,capcomRules.getSistemsProductionPerDay(), capcomRules.getSistemCost(), drive,mutex,capcomRules);
        Worker graphicWorker = new Developer(WorkerTypeEnum.Sprite,capcomRules.getSpritesProductionPerDay(),capcomRules.getSpriteCost(), drive,mutex,capcomRules);
        Worker Writer = new Developer(WorkerTypeEnum.Narrative,capcomRules.getNarrativeProductionPerDay(),capcomRules.getNarrativeCost(), drive,mutex,capcomRules);
        Worker Integrator = new Integrator(WorkerTypeEnum.Integracion,capcomRules.getIntegratorCost(), drive,mutex,capcomRules);
        
        levelDesiner.start();
        DLCWorker.start();
        sistemWorker.start();
        graphicWorker.start();
        Writer.start();
        Integrator.start();
    }
    
}
