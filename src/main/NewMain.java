/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Companies.Company;
import Enums.CompanyEnum;
import GUI.CompanyFrame;
import GUI.Observer;
import Rules.NintendoRules;
import Store.Drive;
import Store.FileEntity;
import Store.JSONStore;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NintendoRules nintendoRules = new NintendoRules();
        Drive nintendoDrive = new Drive();
        
        JSONStore storeJSON = new JSONStore();
        FileEntity entity;
        Company Nintendo;
        try{
            
            entity = storeJSON.GetFile(CompanyEnum.Nintendo);
        }
        catch(IOException e){
            entity = null;
        }
        
        if(entity != null)
            Nintendo = new Company(entity.getLevels(), entity.getNarratives(), entity.getSprites(), entity.getSistems(), 
                    entity.getDLCs(), entity.getIntegrators(), nintendoDrive, nintendoRules);
        else
            Nintendo = new Company(1, 1, 1, 1, 1, 1, nintendoDrive, nintendoRules);
        CompanyFrame companyFrame = new CompanyFrame(Nintendo);
        
        Observer render = new Observer(companyFrame, Nintendo);
        render.start();
        
        companyFrame.setVisible(true);
    }
    
}
