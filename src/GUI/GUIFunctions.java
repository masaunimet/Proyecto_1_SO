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
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import main.Global;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Andres
 */
public class GUIFunctions {

    /**
     * Abre la ventana de un juego Drive
     *
     * @param company int - Numero de compañia que va a abrirse 0 = Nintendo; 1
     * = Capcom; Cualquier otro numero = ambos
     *
     */
    public static void openSim(int company) {

        if (company == 0) {

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
                
                Global.daysDuartion = entity.getDurationDay();
                Global.daysBetweenReleases = entity.getDeadLineDays();
            } else {
                Nintendo = new Company(1, 1, 1, 1, 1, 1, nintendoDrive, nintendoRules);
                
                Global.daysDuartion = 500f;
                Global.daysBetweenReleases = 15;
            }
            CompanyFrame companyFrame = new CompanyFrame(Nintendo);

            Observer render = new Observer(companyFrame, Nintendo);
            render.start();
            /*Grafico*/

            Chart nintendoChart = new Chart(Nintendo, 1, null);

            companyFrame.setVisible(true);

        } else if (company == 1) {

            CapcomRules capcomRules = new CapcomRules();
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
                
                Global.daysDuartion = entity.getDurationDay();
                Global.daysBetweenReleases = entity.getDeadLineDays();
            } else {
                Capcom = new Company(1, 1, 1, 1, 1, 1, capcomDrive, nintendoRules);
                
                Global.daysDuartion = 500f;
                Global.daysBetweenReleases = 15;
            }

            CompanyFrame companyFrame = new CompanyFrame(Capcom);
            Observer render = new Observer(companyFrame, Capcom);
            render.start();
            Chart chart = new Chart(Capcom, 2, null);
            companyFrame.setVisible(true);
        } else {
            
            //Nintendo
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
                Global.daysDuartion = entity.getDurationDay();
            } else {
                Nintendo = new Company(1, 1, 1, 1, 1, 1, nintendoDrive, nintendoRules);
            }
            CompanyFrame companyFrame = new CompanyFrame(Nintendo);

            Observer render = new Observer(companyFrame, Nintendo);
            render.start();
            companyFrame.setVisible(true);
            
            
            //Capcom
            CapcomRules capcomRules = new CapcomRules();
            Drive capcomDrive = new Drive();

            Company Capcom;
            try {

                entity = storeJSON.GetFile(CompanyEnum.Capcom);
            } catch (IOException e) {
                entity = null;
            }

            if (entity != null) {
                Capcom = new Company(entity.getLevels(), entity.getNarratives(), entity.getSprites(), entity.getSistems(), entity.getDLCs(), entity.getIntegrators(), capcomDrive, capcomRules);
            } else {
                Capcom = new Company(1, 1, 1, 1, 1, 1, capcomDrive, capcomRules);
            }

            CompanyFrame company2Frame = new CompanyFrame(Capcom);
            Observer render2 = new Observer(company2Frame, Capcom);
            render2.start();
            Chart capcomVsNintendoChart = new Chart(Nintendo, 3, Capcom);
            company2Frame.setVisible(true);
        }

    }
}
