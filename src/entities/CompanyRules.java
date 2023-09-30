/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Masa500
 */
public class CompanyRules {
    
    protected int levelsNeedIt;
    protected int narrativeNeedIt;
    protected int DLCsNeedIt;
    protected int spritesNeedIt;
    protected int sistemsNeedIt;
    protected float income;
    protected float incomeDLC;
	
    protected int employees;
	
    private float levelCost = 13f;
    private float narrativeCost = 10f;
    private float DLCCost = 17f;
    private float spriteCost = 20f;
    private float sistemCost = 8f;
    private float integratorCost = 25f;
	
    protected float levelProductionPerDay;
    protected float narrativeProductionPerDay;
    protected float DLCsProductionPerDay;
    protected float spritesProductionPerDay;
    protected float sistemsProductionPerDay;
    
    public boolean canMakeGame(int niveles, int narrativa, int sprites, int logicas) {
    	
    	return (niveles >= this.levelsNeedIt && narrativa >= this.narrativeNeedIt && sprites >= this.spritesNeedIt && logicas >= this.sistemsNeedIt);
    }
    
    public boolean canMakeGameDLC(int niveles, int narrativa, int sprites, int logicas, int DLCs) {
    	
    	return (niveles >= this.levelsNeedIt && narrativa >= this.narrativeNeedIt && sprites >= this.spritesNeedIt && logicas >= this.sistemsNeedIt && DLCs >= this.DLCsNeedIt);
    }

    public float getIncome() {
        return income;
    }
    
    public float getIncomeDLC() {
        return incomeDLC;
    }

    public int getLevelsNeedIt() {
        return levelsNeedIt;
    }

    public int getNarrativeNeedIt() {
        return narrativeNeedIt;
    }

    public int getDLCsNeedIt() {
        return DLCsNeedIt;
    }

    public int getSpritesNeedIt() {
        return spritesNeedIt;
    }

    public int getSistemsNeedIt() {
        return sistemsNeedIt;
    }

    public float getEmployees() {
        return employees; 
    }

    public float getLevelCost() {
        return levelCost; 
    }

    public float getNarrativeCost() {
        return narrativeCost; 
    }

    public float getDLCCost() {
        return DLCCost; 
    }

    public float getSpriteCost() {
        return spriteCost;
    }

    public float getSistemCost() {
        return sistemCost;
    }
    
    public float getIntegratorCost() {
        return integratorCost;
    }

    public float getLevelProductionPerDay() {
        return levelProductionPerDay; 
    }

    public float getNarrativeProductionPerDay() {
        return narrativeProductionPerDay; 
    }

    public float getDLCsProductionPerDay() {
        return DLCsProductionPerDay; 
    }

    public float getSpritesProductionPerDay() {
        return spritesProductionPerDay; 
    }

    public float getSistemsProductionPerDay() {
        return sistemsProductionPerDay; 
    }
}
