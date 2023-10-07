/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Companies;

import Enums.WorkerTypeEnum;
import Primitives.List;
import Rules.CompanyRules;
import Store.Drive;
import Worker.Developer;
import Worker.Worker;
import Worker.WorkerFactory;

/**
 *
 * @author Andres
 */
public class Company {

    private CompanyRules rules;
    private Drive drive;

    /*
    employees[0] => Narratives
    employees[1] => Level
    employees[2] => Sprite
    employees[3] => Sistem
    employees[4] => DLC
    employees[5] => Integrator
    employees[6] => PM
    employees[7] => Director
     */
    private List[] employees = new List[7];
    private int amountOfEmployees;
    private int vacancy;

    public Company(int numberOfDeveloper, int numberOfDesigners, int numberOfArtist, int numberOfProgrammers, int numberOfDLCS, int numberOfIntegrators, Drive drive, CompanyRules rules) {
        WorkerFactory workerFactory = new WorkerFactory();

        //Inicializo las lista
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new List();
        }

        //Creo los Narratives
        for (int i = 0; i < numberOfDeveloper; i++) {
            Worker narrativeWorker = workerFactory.makeWorker(WorkerTypeEnum.Narrative, drive, drive.getProducerMutex(), rules);
            employees[0].addToList(narrativeWorker);
        }

        //Creo los Level
        for (int i = 0; i < numberOfDesigners; i++) {
            Worker designerWorker = workerFactory.makeWorker(WorkerTypeEnum.Level, drive, drive.getProducerMutex(), rules);
            employees[1].addToList(designerWorker);
        }

        //Creo los Sprite
        for (int i = 0; i < numberOfArtist; i++) {
            Worker artistWorker = workerFactory.makeWorker(WorkerTypeEnum.Sprite, drive, drive.getProducerMutex(), rules);
            employees[2].addToList(artistWorker);
        }

        //Creo los Sistem
        for (int i = 0; i < numberOfProgrammers; i++) {
            Worker programerWorker = workerFactory.makeWorker(WorkerTypeEnum.Sistem, drive, drive.getProducerMutex(), rules);
            employees[3].addToList(programerWorker);
        }

        //Creo los DLC
        for (int i = 0; i < numberOfDLCS; i++) {
            Worker DLCWorker = workerFactory.makeWorker(WorkerTypeEnum.DLC, drive, drive.getProducerMutex(), rules);
            employees[4].addToList(DLCWorker);
        }

        //Creo los Integrator
        for (int i = 0; i < numberOfIntegrators; i++) {
            Worker integratorWorker = workerFactory.makeWorker(WorkerTypeEnum.Integrator, drive, drive.getProducerMutex(), rules);
            employees[5].addToList(integratorWorker);
        }
        
        //Creo al PM
        Worker PM = workerFactory.makeWorker(WorkerTypeEnum.Manager, drive, drive.getProducerMutex(), rules);
        employees[6].addToList(PM);

        //Creo al Director
        Worker director = workerFactory.makeWorker(WorkerTypeEnum.Manager, drive, drive.getProducerMutex(), rules);
        employees[7].addToList(director);

        this.amountOfEmployees = numberOfDeveloper + numberOfDesigners + numberOfArtist + numberOfProgrammers + numberOfDLCS + numberOfIntegrators;
        this.vacancy = rules.getEmployees() - amountOfEmployees;
        
        this.drive = drive;
        this.rules = rules;
    }

    public CompanyRules getRules() {
        return rules;
    }

    public void setRules(CompanyRules rules) {
        this.rules = rules;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public List[] getEmployees() {
        return employees;
    }

    public void setEmployees(List[] employees) {
        this.employees = employees;
    }

}
