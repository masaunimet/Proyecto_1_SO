/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

import Enums.WorkerTypeEnum;

/**
 *
 * @author Masa500
 */
public class Drive {
    private int levels;
    private int narrative;
    private int DLCs;
    private int sprites;
    private int sistems;
    
    private int games;
    
    private final int maxLevels = 20;
    private final int maxNarrative = 25;
    private final int maxDLCs = 10;
    private final int maxSprites = 55;
    private final int maxSistems = 35;

    public Drive(int niveles, int narrative,int DLCs, int sprites, int logicas) {
        this.levels = niveles;
        this.narrative = narrative;
        this.DLCs = DLCs;
        this.sprites = sprites;
        this.sistems = logicas;
    }
    
    public Drive() {
        this.levels = 0;
        this.narrative = 0;
        this.DLCs = 0;
        this.sprites = 0;
        this.sistems = 0;
    }
    
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
}
