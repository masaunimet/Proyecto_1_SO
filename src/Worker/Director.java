/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Worker;

import Enums.WorkerTypeEnum;
import Rules.CompanyRules;
import Store.Drive;
import java.util.Random;
import java.util.concurrent.Semaphore;
import main.Global;

/**
 *
 * @author Andres
 */
public class Director extends Worker {

    private Drive drive;

    public Director(WorkerTypeEnum wte, float f, Semaphore smphr, CompanyRules cr, Drive drive) {
        super(wte, f, smphr, cr);
        this.drive = drive;
        this.hired = true;
    }

    @Override
    public void run() {
        while (hired) {
            double timePassed = 0;
            try {
                drive.getDaysMutex().acquire();
                if (drive.getDaysUntilRelease() == 0) {
                    drive.getDaysMutex().release();
                    //Aqui estoy diciendo que si ya es el dia del lanzamiennto, el director aumenta la utilidad de la empresa de manera de que es la utilidad acutal mas la vetna de los dlcs mas la venta de los juegos regulares
                    drive.getConsumerMutex().acquire();
                    drive.setEarnings(drive.getEarnings() + drive.getGames() * this.companyRules.getIncome() + drive.getGames() * companyRules.getIncomeDLC());
                    drive.setGames(0);
                    drive.setGamesWithDlc(0);
                    drive.setDaysUntilRelease(Global.daysBetweenReleases);
                    drive.getConsumerMutex().release();
                    sleep(dayDuration);
                } else {

                    drive.getDaysMutex().release();

                    //El director escoge una hora del día aleatoriamente si llega esa hora entonces el director cambiara su estado a revisando
                    Random r = new Random();

                    double oneHour = dayDuration / 24;
                    double checkingHour = r.nextInt(24) * oneHour;
                    timePassed = (checkingHour + 1) * oneHour;

                    double contador = 0;
                    while (contador < dayDuration) {
                        System.out.println("");
                        System.out.println(contador);
                        System.out.println(checkingHour);
                        System.out.println("");
                        if (contador == checkingHour) {
                            drive.setDirectorStatus(0);

                            System.out.println("voy a revisar ahora");

                            //Ya aqui empiezan a pasar los minutos 
                            double oneMinute = oneHour / 60;
                            sleep(Math.round(25 * oneMinute));
                            drive.setDirectorStatus(1);
                            sleep(Math.round(35 * oneMinute));
                        }
                        sleep(Math.round(oneHour));

                        contador += oneHour;
                    }

                }
                
                //Cobrando su dia de trabajo
                drive.getCostsMutex().acquire();
                drive.setDirectorCost((drive.getDirectorCost() + costPerHour * 24));
                drive.getCostsMutex().release();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void Work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
