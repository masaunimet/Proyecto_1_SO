/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

import Enums.WorkerTypeEnum;
import java.util.concurrent.Semaphore;

/**
 * Es el que almacena los elementos necesarios para crear un juego, la cantidad de juegos,
 * gastos, ingresos y cantidades maximas de cada elemento
 * @author Masa500
 */
public class Drive {

    //elementos para juegos
        private int levels;
    private int narrative;
    private int DLCs;
    private int sprites;
    private int sistems;
    
    //juegos
    private int games;
    private int gamesWithDlc;
        
    //gastos e ingresos
    private float utility;
    
    //maximos
    private final int maxLevels = 20;
    private final int maxNarrative = 25;
    private final int maxDLCs = 10;
    private final int maxSprites = 55;
    private final int maxSistems = 35;

    //Semáforos de drive
    private Semaphore producerMutex = new Semaphore(1);
    private Semaphore consumerMutex = new Semaphore(1);
    
    //Days until release
    private int daysUntilRelease = 15;
    private Semaphore daysMutex = new Semaphore(1);
    
    
    //Status del director: 0 = vigilando, 1 = trabajando
    private int directorStatus = 0;
    
    //Status del PM: 0  = trabajando, 1 = viendo streams
    private int pmStatus = 0;
    private int faltas = 0;
    private int salaryDiscount = 0;
    
    /**
     * Constructor que setea los elementos para un juego
     * @param levels int - Numero de niveles
     * @param narrative int - Numero de guiones
     * @param DLCs int - Numero de DLCs
     * @param sprites int - Numero de sprites
     * @param sistems int - Numero de sistemas de juego
     */
    public Drive(int levels, int narrative,int DLCs, int sprites, int sistems) {
        this.levels = levels;
        this.narrative = narrative;
        this.DLCs = DLCs;
        this.sprites = sprites;
        this.sistems = sistems;
    }
    
    /**
     * Constructor que setea los elementos para un juego
     */
    public Drive() {
        this.levels = 0;
        this.narrative = 0;
        this.DLCs = 0;
        this.sprites = 0;
        this.sistems = 0;
    }
    
    /**
     * Agrega el elemento al Drive o almacen
     * @param productQty int - cantidad del elemento que se agregara
     * @param type WorkerTypeEnum - tipo de Elemento que se agregara
     */
    public void addProduct(int productQty, WorkerTypeEnum type){
    
    switch(type) {
	case Sprite:
            sprites = (sprites + productQty > maxSprites)? maxSprites :sprites + productQty;
            break;
	case DLC:
            DLCs = (DLCs + productQty > maxDLCs)? maxDLCs :DLCs + productQty;
            break;
	case Sistem:
            sistems = (sistems + productQty > maxSistems)? maxSistems :sistems + productQty;
            break;
	case Narrative:
            narrative = (narrative + productQty > maxNarrative)? maxNarrative :narrative + productQty;
            break;
	case Level:
            levels = (levels + productQty > maxLevels)? maxLevels :levels + productQty;
            break;
	default:
            break;
	}
    }

    //Getters y Setters
    public int getLevels() {
        return levels;
    }

    public void setLevels(int niveles) {
        this.levels = niveles;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
    }

    public int getDLCs() {
        return DLCs;
    }

    public void setDLCs(int dLCs) {
        DLCs = dLCs;
    }

    public int getSprites() {
        return sprites;
    }

    public void setSprites(int sprites) {
        this.sprites = sprites;
    }

    public int getSistems() {
        return sistems;
    }

    public void setSistems(int logicas) {
        this.sistems = logicas;
    }

    public int getMaxLevels() {
        return maxLevels;
    }

    public int getMaxDLCs() {
        return maxDLCs;
    }

    public int getMaxNarrative() {
        return maxNarrative;
    }

    public int getMaxSprites() {
        return maxSprites;
    }

    public int getMaxSistems() {
        return maxSistems;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }
    public float getUtility() {
        return utility;
    }
    
    public void setUtility(float utility) {
        this.utility = utility;
    }

    /**
     * @return the producerMutex
     */
    public Semaphore getProducerMutex() {
        return producerMutex;
    }

    /**
     * @param producerMutex the producerMutex to set
     */
    public void setProducerMutex(Semaphore producerMutex) {
        this.producerMutex = producerMutex;
    }

    /**
     * @return the consumerMutex
     */
    public Semaphore getConsumerMutex() {
        return consumerMutex;
    }

    /**
     * @param consumerMutex the consumerMutex to set
     */
    public void setConsumerMutex(Semaphore consumerMutex) {
        this.consumerMutex = consumerMutex;
    }

    /**
     * @return the daysUntilRelease
     */
    public int getDaysUntilRelease() {
        return daysUntilRelease;
    }

    /**
     * @param daysUntilRelease the daysUntilRelease to set
     */
    public void setDaysUntilRelease(int daysUntilRelease) {
        this.daysUntilRelease = daysUntilRelease;
    }

    /**
     * @return the daysMutex
     */
    public Semaphore getDaysMutex() {
        return daysMutex;
    }

    /**
     * @param daysMutex the daysMutex to set
     */
    public void setDaysMutex(Semaphore daysMutex) {
        this.daysMutex = daysMutex;
    }

    /**
     * @return the gamesWithDlc
     */
    public int getGamesWithDlc() {
        return gamesWithDlc;
    }

    /**
     * @param gamesWithDlc the gamesWithDlc to set
     */
    public void setGamesWithDlc(int gamesWithDlc) {
        this.gamesWithDlc = gamesWithDlc;
    }

    /**
     * @return the directorStatus
     */
    public int getDirectorStatus() {
        return directorStatus;
    }

    /**
     * @param directorStatus the directorStatus to set
     */
    public void setDirectorStatus(int directorStatus) {
        this.directorStatus = directorStatus;
    }

    /**
     * @return the pmStatus
     */
    public int getPmStatus() {
        return pmStatus;
    }

    /**
     * @param pmStatus the pmStatus to set
     */
    public void setPmStatus(int pmStatus) {
        this.pmStatus = pmStatus;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @return the salaryDiscount
     */
    public int getSalaryDiscount() {
        return salaryDiscount;
    }

    /**
     * @param salaryDiscount the salaryDiscount to set
     */
    public void setSalaryDiscount(int salaryDiscount) {
        this.salaryDiscount = salaryDiscount;
    }
}
