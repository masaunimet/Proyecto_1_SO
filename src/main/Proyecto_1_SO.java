/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Enums.WorkerTypeEnum;
import Worker.Worker;
import Worker.WorkerFactory;
import Rules.CompanyRules;
import Rules.CapcomRules;
import Store.Drive;
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
        WorkerFactory workerFactory = new WorkerFactory();
        
        Worker levelDesiner = workerFactory.makeWorker(WorkerTypeEnum.Level, drive, mutex, capcomRules);
        Worker DLCWorker = workerFactory.makeWorker(WorkerTypeEnum.DLC, drive, mutex, capcomRules);
        Worker sistemWorker = workerFactory.makeWorker(WorkerTypeEnum.Sistem, drive, mutex, capcomRules);
        Worker graphicWorker = workerFactory.makeWorker(WorkerTypeEnum.Sprite, drive, mutex, capcomRules);
        Worker Writer = workerFactory.makeWorker(WorkerTypeEnum.Narrative, drive, mutex, capcomRules);
        Worker Integrator = workerFactory.makeWorker(WorkerTypeEnum.Integracion, drive, mutex, capcomRules);
        
        levelDesiner.start();
        DLCWorker.start();
        sistemWorker.start();
        graphicWorker.start();
        Writer.start();
        Integrator.start();
    }
    
}
