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
import static Enums.WorkerTypeEnum.Integrator;

/**
 * Patron de diseño Factory para la creacion de Workers
 *
 * @author Masa500
 */
public class WorkerFactory {

    /**
     * Metodo que instancia un Worker
     *
     * @param workerType WorkerTypeEnum - Tipo de Worker
     * @param drive Drive - Almacen que tendra el Worker
     * @param mutex Semaphore - Semaforo que tendra el Worker
     * @param companyRules - Reglas y datos de la compañia asociada al Worker
     * @return Worker - instancia de un Worker
     */
    public Worker makeWorker(WorkerTypeEnum workerType, Drive drive, Semaphore mutex, CompanyRules companyRules) {

        switch (workerType) {
            case Sprite:
                return new Developer(workerType, companyRules.getSpritesProductionPerDay(), companyRules.getSpriteCost(), drive, mutex, companyRules);
            case DLC:
                return new Developer(workerType, companyRules.getDLCsProductionPerDay(), companyRules.getDLCCost(), drive, mutex, companyRules);
            case Sistem:
                return new Developer(workerType, companyRules.getSistemsProductionPerDay(), companyRules.getSistemCost(), drive, mutex, companyRules);
            case Narrative:
                return new Developer(workerType, companyRules.getNarrativeProductionPerDay(), companyRules.getNarrativeCost(), drive, mutex, companyRules);
            case Level:
                return new Developer(workerType, companyRules.getLevelProductionPerDay(), companyRules.getLevelCost(), drive, mutex, companyRules);
            case Integrator:
                return new Integrator(workerType, companyRules.getGamesToGamesDLC(), companyRules.getIntegratorCost(), drive, mutex, companyRules);
            case Manager:
                return new ProjectManager(workerType, companyRules.getPmCost(), mutex, companyRules, drive);
            case Director:
                return new Director(workerType, companyRules.getDirectorCost(), mutex, companyRules, drive);
            default:
                break;
        }

        return null;
    }
}
