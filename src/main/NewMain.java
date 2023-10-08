/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Companies.Company;
import GUI.CompanyFrame;
import GUI.Observer;
import Rules.NintendoRules;
import Store.Drive;

/**
 *
 * @author Andres
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NintendoRules nintendoRules = new NintendoRules();
        Drive nintendoDrive = new Drive();
        
        Company Nintendo = new Company(1, 1, 1, 1, 1, 1, nintendoDrive, nintendoRules);
        CompanyFrame companyFrame = new CompanyFrame(Nintendo);
        
        Observer render = new Observer(companyFrame, Nintendo);
        render.start();
        
        companyFrame.setVisible(true);
    }
    
}
