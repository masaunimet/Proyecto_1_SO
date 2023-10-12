/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Companies.Company;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import main.Global;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Andres
 */
public class Chart {

    XYSeries nintendoSeries = new XYSeries("Nintendo");
    XYSeries capcomSeries = new XYSeries("Capcom");

    XYSeriesCollection datosNintendo = new XYSeriesCollection(nintendoSeries);
    XYSeriesCollection datosCapcom = new XYSeriesCollection(capcomSeries);

    XYSeriesCollection datosNintendoCapcom = new XYSeriesCollection();

    JFreeChart nintendoChart = ChartFactory.createXYLineChart("f(t) = Utilidad ", "Tiempo", "Utilidad", datosNintendo, PlotOrientation.VERTICAL, true, true, false);
    Company nintendo;

    JFreeChart capcomChart = ChartFactory.createXYLineChart("f(t) = Utilidad ", "Tiempo", "Utilidad", datosCapcom, PlotOrientation.VERTICAL, true, true, false);
    Company capcom;
    JFreeChart capcomVsNintendoChart = ChartFactory.createXYLineChart("f(t) = Utilidad ", "Tiempo", "Utilidad", datosNintendoCapcom, PlotOrientation.VERTICAL, true, true, false);

    JPanel panelNintendo = new ChartPanel(nintendoChart);
    JPanel panelCapcom = new ChartPanel(capcomChart);
    JPanel panelCapcomVsNintendo = new ChartPanel(capcomVsNintendoChart);
    
    int myDAYS = 0;

    public Chart(Company company, int empresa, Company company2) {
        JFrame frame = new JFrame();
        if (empresa == 1) {

            this.nintendo = company;
            Timer timer = new Timer(Math.round(Global.daysDuartion), new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    float costosNintendo = nintendo.getDrive().getLevelsCost() + nintendo.getDrive().getNarrativeCost() + nintendo.getDrive().getSpriteCost() + nintendo.getDrive().getSistemCost() + nintendo.getDrive().getDLCCost() + nintendo.getDrive().getIntegratorCost() + nintendo.getDrive().getPmCost() + nintendo.getDrive().getDirectorCost();
                    myDAYS++;
                    nintendoSeries.addOrUpdate(myDAYS, Math.round(nintendo.getDrive().getEarnings() - costosNintendo));
                }
            });
            frame.add(panelNintendo, BorderLayout.CENTER);
            timer.start();

        } else if (empresa == 2) {

            this.capcom = company;
            Timer timer = new Timer(Math.round(Global.daysDuartion), new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    float costosCapcom = capcom.getDrive().getLevelsCost() + capcom.getDrive().getNarrativeCost() + capcom.getDrive().getSpriteCost() + capcom.getDrive().getSistemCost() + capcom.getDrive().getDLCCost() + capcom.getDrive().getIntegratorCost() + capcom.getDrive().getPmCost() + capcom.getDrive().getDirectorCost();
                    myDAYS++;
                    capcomSeries.addOrUpdate(myDAYS, Math.round(capcom.getDrive().getEarnings() - costosCapcom));
                }
            });
            frame.add(panelCapcom, BorderLayout.CENTER);
            timer.start();

        } else {
            //Capcom y Nintendo
            
            this.nintendo = company;
            this.capcom = company2;
            
            datosNintendoCapcom.addSeries(capcomSeries);
            System.out.println("Aguregue a CAPCOM");
            
            datosNintendoCapcom.addSeries(nintendoSeries);
            System.out.println("Aguregue a Nintendo");
            
            Timer timer = new Timer(Math.round(Global.daysDuartion), new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    myDAYS++;
                    
                    float costosNintendo = nintendo.getDrive().getLevelsCost() + nintendo.getDrive().getNarrativeCost() + nintendo.getDrive().getSpriteCost() + nintendo.getDrive().getSistemCost() + nintendo.getDrive().getDLCCost() + nintendo.getDrive().getIntegratorCost() + nintendo.getDrive().getPmCost() + nintendo.getDrive().getDirectorCost();
                    nintendoSeries.addOrUpdate(myDAYS, Math.round(nintendo.getDrive().getEarnings() - costosNintendo));
                    
                    float costosCapcom = capcom.getDrive().getLevelsCost() + capcom.getDrive().getNarrativeCost() + capcom.getDrive().getSpriteCost() + capcom.getDrive().getSistemCost() + capcom.getDrive().getDLCCost() + capcom.getDrive().getIntegratorCost() + capcom.getDrive().getPmCost() + capcom.getDrive().getDirectorCost();
                    capcomSeries.addOrUpdate(myDAYS, Math.round(capcom.getDrive().getEarnings() - costosCapcom));

                }
            });
            frame.add(panelCapcomVsNintendo, BorderLayout.CENTER);
            timer.start();
        }

        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setVisible(true);
    }

}
