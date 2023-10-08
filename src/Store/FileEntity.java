/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

/**
 * Entidad para leer modificar los datos de los JSONs
 * @author Masa500
 */
public class FileEntity {
    
    private float durationDay;
    private int deadLineDays;
    private int narratives;
    private int levels;
    private int sprites;
    private int sistems;
    private int DLCs;
    
    public FileEntity(){}
    
    /**
     * Constructor de la entidad para lectura y escritura de JSONs
     * @param durationDay float - Duracion en segundos de cuanto dura un dia 
     * @param deadLineDays int - Tiempo en el que se tiene que lanzar los juegos
     * @param narratives int - Numero de trabajadores en narrativa
     * @param levels int - Numero de trabajadores en niveles
     * @param DLCs int - Numero de trabajadores en DLCs
     * @param sistems int - Numero de trabajadores en sistemas
     * @param sprites int - Numero de trabajadores en sprites
     */
    public FileEntity(float durationDay, int deadLineDays, int narratives, int levels, int DLCs, int sistems, int sprites){
    
        this.durationDay = durationDay;
        this.deadLineDays = deadLineDays;
        this.narratives = narratives;
        this.levels = levels;
        this.DLCs = DLCs;
        this.sistems = sistems;
        this.sprites = sprites;
    }

    
    //GETTERS y SETTERS
    /**
     * @return the sprites
     */
    public int getSprites() {
        return sprites;
    }

    /**
     * @param sprites the sprites to set
     */
    public void setSprites(int sprites) {
        this.sprites = sprites;
    }

    /**
     * @return the sistems
     */
    public int getSistems() {
        return sistems;
    }

    /**
     * @param sistems the sistems to set
     */
    public void setSistems(int sistems) {
        this.sistems = sistems;
    }

    /**
     * @return the DLCs
     */
    public int getDLCs() {
        return DLCs;
    }

    /**
     * @param DLCs the DLCs to set
     */
    public void setDLCs(int DLCs) {
        this.DLCs = DLCs;
    }

    /**
     * @return the levels
     */
    public int getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(int levels) {
        this.levels = levels;
    }

    /**
     * @return the narratives
     */
    public int getNarratives() {
        return narratives;
    }

    /**
     * @param narratives the narratives to set
     */
    public void setNarratives(int narratives) {
        this.narratives = narratives;
    }

    /**
     * @return the deadLineDays
     */
    public int getDeadLineDays() {
        return deadLineDays;
    }

    /**
     * @param deadLineDays the deadLineDays to set
     */
    public void setDeadLineDays(int deadLineDays) {
        this.deadLineDays = deadLineDays;
    }

    /**
     * @return the durationDay
     */
    public float getDurationDay() {
        return durationDay;
    }

    /**
     * @param durationDay the durationDay to set
     */
    public void setDurationDay(float durationDay) {
        this.durationDay = durationDay;
    }
}
