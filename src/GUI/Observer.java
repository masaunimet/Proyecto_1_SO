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

            //Costos
            float costos = company.getDrive().getLevelsCost() + company.getDrive().getNarrativeCost() + company.getDrive().getSpriteCost() + company.getDrive().getSistemCost() + company.getDrive().getDLCCost() + company.getDrive().getIntegratorCost() + company.getDrive().getPmCost() + company.getDrive().getDirectorCost();
            window.getCostosEmpresaLabel().setText(String.valueOf(costos));

            //Ganancias
            if (company.getDrive().getEarnings() < 1000) {
                window.getGananciasEmpresaLabel().setText(String.valueOf(company.getDrive().getEarnings()));
            } else {
                window.getGananciasEmpresaLabel().setText(String.valueOf(company.getDrive().getEarnings() / 1000) + " K");
            }
            
            //Utilidad
            if ((company.getDrive().getEarnings() - costos) < 1000) {
                window.getUtilidadEmpresaLabel().setText(String.valueOf(company.getDrive().getEarnings() - costos));
            } else {
                window.getUtilidadEmpresaLabel().setText(String.valueOf((company.getDrive().getEarnings() - costos) / 1000) + " K");
            }

            //Director
            //Status
            if (company.getDrive().getDirectorStatus() == 0) {
                window.getStatusDirectorLabel().setText("Revisando");
            } else {
                window.getStatusDirectorLabel().setText("Trabajando");
            }

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
            //Narratives
            if (company.getDrive().getNarrativeCost() < 1000) {
                window.getGuionesCostosLabel().setText(String.valueOf(company.getDrive().getNarrativeCost()));
            } else {
                window.getGuionesCostosLabel().setText(String.valueOf(company.getDrive().getNarrativeCost() / 1000) + " K");
            }

            //Levels
            if (company.getDrive().getLevelsCost() < 1000) {
                window.getNivelesCostosLabel().setText(String.valueOf(company.getDrive().getLevelsCost()));
            } else {
                window.getNivelesCostosLabel().setText(String.valueOf(company.getDrive().getLevelsCost() / 1000) + " K");
            }

            //Sprites
            if (company.getDrive().getSpriteCost() < 1000) {
                window.getSpritesCostosLabel().setText(String.valueOf(company.getDrive().getSpriteCost()));
            } else {
                window.getSpritesCostosLabel().setText(String.valueOf(company.getDrive().getSpriteCost() / 1000) + " K");
            }

            //Sistems
            if (company.getDrive().getSistemCost() < 1000) {
                window.getSistemasCostosLabel().setText(String.valueOf(company.getDrive().getSistemCost()));
            } else {
                window.getSistemasCostosLabel().setText(String.valueOf(company.getDrive().getSistemCost() / 1000) + " K");
            }

            //DLC
            if (company.getDrive().getDLCCost() < 1000) {
                window.getDlcCostosLabel().setText(String.valueOf(company.getDrive().getDLCCost()));
            } else {
                window.getDlcCostosLabel().setText(String.valueOf(company.getDrive().getDLCCost() / 1000) + " K");
            }

            //Integradores
            if (company.getDrive().getIntegratorCost() < 1000) {
                window.getCostosIntegradores().setText(String.valueOf(company.getDrive().getIntegratorCost()));
            } else {
                window.getCostosIntegradores().setText(String.valueOf(company.getDrive().getIntegratorCost() / 1000) + " K");
            }

            //PM
            if (company.getDrive().getPmCost() < 1000) {
                window.getCostosPMLabel().setText(String.valueOf(company.getDrive().getPmCost()));
            } else {
                window.getCostosPMLabel().setText(String.valueOf(company.getDrive().getPmCost() / 1000) + " K");
            }

            //Director
            if (company.getDrive().getDirectorCost()< 1000) {
                window.getCostosDirectorLabel().setText(String.valueOf(company.getDrive().getDirectorCost()));
            } else {
                window.getCostosDirectorLabel().setText(String.valueOf(company.getDrive().getDirectorCost() / 1000) + " K");
            }

            //Días hasta el lanzamiento
            if (company.getDrive().getDaysUntilRelease() != Integer.parseInt(window.getDiasLanzamientoLabel().getText())) {
                window.getDiasLanzamientoLabel().setText(String.valueOf(company.getDrive().getDaysUntilRelease()));
            }
            
            //Juegos Listos
            //Normal
            if (company.getDrive().getGames() != Integer.parseInt(window.getCantJuegosNormales().getText())){
                window.getCantJuegosNormales().setText(String.valueOf(company.getDrive().getGames()));
            }
            //Con Dlc
            if (company.getDrive().getGamesWithDlc() != Integer.parseInt(window.getCantJuegosConDLC().getText())){
                window.getCantJuegosConDLC().setText(String.valueOf(company.getDrive().getGamesWithDlc()));
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
