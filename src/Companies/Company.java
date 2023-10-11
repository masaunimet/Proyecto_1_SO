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
import Worker.Worker;
import Worker.WorkerFactory;
import javax.swing.JOptionPane;

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
    private List[] employees = new List[8];
    private int amountOfEmployees;
    private int vacancy;

    /**
     * Realiza el Constructor de Company
     *
     * @param numberOfDeveloper int - numero de developers que se crean por
     * default
     * @param numberOfDesigners int - numero de diseñadores que se crean por
     * default
     * @param numberOfArtist int - numero de artistas que se crean por default
     * @param numberOfProgrammers int - numero de programadores que se crean por
     * default
     * @param numberOfDLCS int - numero de DLCS que se crean por default
     * @param numberOfIntegrators int - numero de integradorees que se crean por
     * default
     * @param drive Drive - Es el drive de la compañia
     * @param rules CompanyRules - datos de la compañia asociada
     */
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
        Worker director = workerFactory.makeWorker(WorkerTypeEnum.Director, drive, drive.getProducerMutex(), rules);
        employees[7].addToList(director);

        this.amountOfEmployees = numberOfDeveloper + numberOfDesigners + numberOfArtist + numberOfProgrammers + numberOfDLCS + numberOfIntegrators;
        this.vacancy = rules.getEmployees() - amountOfEmployees;

        this.drive = drive;
        this.rules = rules;
    }

    /**
     * Despide a un empleado
     *
     * @param type int - es el tipo de empleado que se va a botar
     */
    public void fireEmployee(int type) {
        if (amountOfEmployees > 0) {
            boolean eliminado = employees[type].removeLast();
            if (eliminado) {
                amountOfEmployees--;
                vacancy++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay más empleados por botar");
        }
    }

    /**
     * Contrata a un empleado
     *
     * @param type int - es el tipo de empleado que se va a botar
     */
    public void hireEmployee(int type) {
        if (vacancy > 0) {
            WorkerFactory workerFactory = new WorkerFactory();
            switch (type) {

                case 0:
                    Worker narrativeWorker = workerFactory.makeWorker(WorkerTypeEnum.Narrative, drive, drive.getProducerMutex(), rules);
                    employees[0].addToList(narrativeWorker);
                    break;
                case 1:
                    Worker designerWorker = workerFactory.makeWorker(WorkerTypeEnum.Level, drive, drive.getProducerMutex(), rules);
                    employees[1].addToList(designerWorker);
                    break;
                case 2:
                    Worker artistWorker = workerFactory.makeWorker(WorkerTypeEnum.Sprite, drive, drive.getProducerMutex(), rules);
                    employees[2].addToList(artistWorker);
                    break;
                case 3:
                    Worker programerWorker = workerFactory.makeWorker(WorkerTypeEnum.Sistem, drive, drive.getProducerMutex(), rules);
                    employees[3].addToList(programerWorker);
                    break;

                case 4:
                    Worker DLCWorker = workerFactory.makeWorker(WorkerTypeEnum.DLC, drive, drive.getProducerMutex(), rules);
                    employees[type].addToList(DLCWorker);
                    break;

                case 5:
                    Worker integratorWorker = workerFactory.makeWorker(WorkerTypeEnum.Integrator, drive, drive.getProducerMutex(), rules);
                    employees[5].addToList(integratorWorker);
                    break;
            }
            vacancy--;
            amountOfEmployees++;

        } else {
            JOptionPane.showMessageDialog(null, "No hay plata para mas personal.");
        }
    }
    
    public void bankrupcy(){
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].getSize(); j++) {
                employees[i].removeLast();
            }
        }
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

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setAmountOfEmployees(int amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

}
