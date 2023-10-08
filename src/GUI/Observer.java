/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Companies.Company;

/**
 *
 * @author Andres
 */
public class Observer extends Thread {

    private CompanyFrame window;
    private Company company;

    public Observer(CompanyFrame window, Company company) {
        this.window = window;
        this.company = company;
    }

    @Override
    public void run() {

        while (true) {

            //Progress bars
            //Narrative
            if (window.getGuionProgressBar().getValue() != company.getDrive().getNarrative()) {
                window.getGuionProgressBar().setValue(company.getDrive().getNarrative());
                window.getGuionProgressBar().setString(String.valueOf(company.getDrive().getNarrative()));
            }

            //DLC
            if (window.getDLCProgressBar().getValue() != company.getDrive().getDLCs()) {
                window.getDLCProgressBar().setValue(company.getDrive().getDLCs());
                window.getDLCProgressBar().setString(String.valueOf(company.getDrive().getDLCs()));
            }

            //Levels
            if (window.getLevelsProgressBar().getValue() != company.getDrive().getLevels()) {
                window.getLevelsProgressBar().setValue(company.getDrive().getLevels());
                window.getLevelsProgressBar().setString(String.valueOf(company.getDrive().getLevels()));
            }

            //Sprites
            if (window.getSpritesProgressBar().getValue() != company.getDrive().getSprites()) {
                window.getSpritesProgressBar().setValue(company.getDrive().getSprites());
                window.getSpritesProgressBar().setString(String.valueOf(company.getDrive().getSprites()));
            }

            //Sisttemas
            if (window.getSiistemasProgressBar().getValue() != company.getDrive().getSistems()) {
                window.getSiistemasProgressBar().setValue(company.getDrive().getSistems());
                window.getSiistemasProgressBar().setString(String.valueOf(company.getDrive().getSistems()));
            }

            //Costos de los juegos
            /*
            TODO: declarar costos de cada parte de los juegos            
             */
            //Datos de la empresa
            /*
            TODO: decalrar costos y gangancias
            
            //Costos
            window.getCostosEmpresaLabel().setText();
            
            //Ganancias
            window.getGananciasEmpresaLabel().setText();
             */
            //Utilidad
            window.getUtilidadEmpresaLabel().setText(String.valueOf(company.getDrive().getUtility()));

            //Director
            //Status
            if (company.getDrive().getDirectorStatus() == 0) {
                window.getStatusDirectorLabel().setText("Revisando");
            } else {
                window.getStatusDirectorLabel().setText("Trabajando");
            }

            //Costos
            /*
            TODO: Hacer Costos
             */
            //Project Manager
            //Status
            if (company.getDrive().getPmStatus() == 0) {
                window.getStatusPMLabel().setText("Trabajando");
            } else {
                window.getStatusPMLabel().setText("Viendo streams");
            }

            //Faltas
            if (company.getDrive().getFaltas() != Integer.parseInt(window.getFaltasLabel().getText())) {
                window.getFaltasLabel().setText(String.valueOf(company.getDrive().getFaltas()));
            }

            //Costos
            /*
            TODO: Hacer costos
             */
            
            
            //Días hasta el lanzamiento
            if (company.getDrive().getDaysUntilRelease() != Integer.parseInt(window.getDiasLanzamientoLabel().getText())){
                window.getDiasLanzamientoLabel().setText(String.valueOf(company.getDrive().getDaysUntilRelease()));
            }
            
        }

    }

    public CompanyFrame getWindow() {
        return window;
    }

    public void setWindow(CompanyFrame window) {
        this.window = window;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
