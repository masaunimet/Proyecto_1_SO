/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Masa500
 */
public class NintendoRules extends CompanyRules{
    
    public NintendoRules() {
    	
    	this.levelsNeedIt = 2;
    	this.narrativeNeedIt = 1;
    	this.DLCsNeedIt = 1;
    	this.spritesNeedIt = 6;
    	this.sistemsNeedIt = 5;
        
    	this.income = 400000f;
    	this.incomeDLC = 750000f;
        
        this.employees = 17;
        
        this.levelProductionPerDay = 0.26f;
        this.narrativeProductionPerDay = 0.26f;
        this.spritesProductionPerDay = 1f;
        this.sistemsProductionPerDay = 5f;
        this.DLCsProductionPerDay = 0.51f;
    }
}
