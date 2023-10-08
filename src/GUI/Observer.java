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
    
    public Observer(CompanyFrame window, Company company){
        this.window = window;
        this.company = company;
    }

    @Override
    public void run() {
        //TODO: poner todas las cosas que hay que verificar si cambian de estado
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
