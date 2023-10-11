/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Companies.Company;
import Enums.CompanyEnum;
import Rules.CapcomRules;
import Rules.NintendoRules;
import Store.Drive;
import Store.FileEntity;
import Store.JSONStore;
import java.io.IOException;

/**
 *
 * @author Andres
 */
public class GUIFunctions {

    /**
     * Abre la ventana de un juego Drive
     *
     * @param company int - Numero de compañia que va a abrirse 0 = Nintendo; 1 = Capcom; Cualquier otro numero = ambos
     *
     */
    public static void openSim(int company) {

        if (company != 1) {
            NintendoRules nintendoRules = new NintendoRules();
            Drive nintendoDrive = new Drive();

            JSONStore storeJSON = new JSONStore();
            FileEntity entity;
            Company Nintendo;
            try {

                entity = storeJSON.GetFile(CompanyEnum.Nintendo);
            } catch (IOException e) {
                entity = null;
            }

            if (entity != null) {
                Nintendo = new Company(entity.getLevels(), entity.getNarratives(), entity.getSprites(), entity.getSistems(),
                        entity.getDLCs(), entity.getIntegrators(), nintendoDrive, nintendoRules);
            } else {
                Nintendo = new Company(1, 1, 1, 1, 1, 1, nintendoDrive, nintendoRules);
            }
            CompanyFrame companyFrame = new CompanyFrame(Nintendo);

            Observer render = new Observer(companyFrame, Nintendo);
            render.start();
            companyFrame.setVisible(true);
            
        }
        if (company != 0) {
            CapcomRules nintendoRules = new CapcomRules();
            Drive capcomDrive = new Drive();

            JSONStore storeJSON = new JSONStore();
            FileEntity entity;
            Company Capcom;
            try {

                entity = storeJSON.GetFile(CompanyEnum.Capcom);
            } catch (IOException e) {
                entity = null;
            }

            if (entity != null) {
                Capcom = new Company(entity.getLevels(), entity.getNarratives(), entity.getSprites(), entity.getSistems(),
                        entity.getDLCs(), entity.getIntegrators(), capcomDrive, nintendoRules);
            } else {
                Capcom = new Company(1, 1, 1, 1, 1, 1, capcomDrive, nintendoRules);
            }

            CompanyFrame companyFrame = new CompanyFrame(Capcom);
            Observer render = new Observer(companyFrame, Capcom);
            render.start();
            companyFrame.setVisible(true);
        }

    }
}
