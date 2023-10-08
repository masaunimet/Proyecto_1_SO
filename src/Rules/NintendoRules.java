/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rules;

/**
 * Tiene los datos de Nintendo
 * @author Masa500
 */
public class NintendoRules extends CompanyRules{
    
    /**
     * Genera los datos necesarios que tiene que ver con la compañia de Nintendo
     */
    public NintendoRules() {
    	
    	this.levelsNeedIt = 2;
    	this.narrativeNeedIt = 2;
    	this.DLCsNeedIt = 2;
    	this.spritesNeedIt = 4;
    	this.sistemsNeedIt = 4;
        
    	this.income = 550000f;
    	this.incomeDLC = 600000f;
        
        this.gamesToGamesDLC = 5;
        
        this.employees = 14;
        
        this.levelProductionPerDay = 0.34f;
        this.narrativeProductionPerDay = 0.34f;
        this.spritesProductionPerDay = 2f;
        this.sistemsProductionPerDay = 3f;
        this.DLCsProductionPerDay = 0.34f;
        
        this.logo = "src\\Images\\nintendologo.png";
        this.background = "src\\Images\\nintendobg.jpg";
    }
}
