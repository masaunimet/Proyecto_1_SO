/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rules;

/**
 * Contiene los datos primordiales de una compañia como elemento para hacer un
 * juego, ganancias, numero de empleados y produccion por dia dependiendo del
 * tipo de trabajo
 *
 * @author Masa500
 */
public class CompanyRules {

    //Elementos necesarios para hacer un juego
    protected int levelsNeedIt;
    protected int narrativeNeedIt;
    protected int DLCsNeedIt;
    protected int spritesNeedIt;
    protected int sistemsNeedIt;

    //Ingresos
    protected float income;
    protected float incomeDLC;

    //Intervalo de tiempo(dias) para un juego con DLC(s)
    protected int gamesToGamesDLC;

    //Numero máximo de empleados
    protected int employees;

    //Costo por hora por el puesto de trabajo
    private float levelCost = 13f;
    private float narrativeCost = 10f;
    private float DLCCost = 17f;
    private float spriteCost = 20f;
    private float sistemCost = 8f;
    private float integratorCost = 25f;
    private float pmCost = 20f;
    private float directorCost = 30f;

    //Produccion por dia del elemento
    protected float levelProductionPerDay;
    protected float narrativeProductionPerDay;
    protected float DLCsProductionPerDay;
    protected float spritesProductionPerDay;
    protected float sistemsProductionPerDay;

    //Fotos
    protected String logo;
    protected String background;

    /**
     * Identifica si un juego se puede hacer con los elementos almacenados en el
     * Drive
     *
     * @param levels int - Numero de niveles disponibles
     * @param narrative int - Numero de guiones disponibles
     * @param sprites int - Numero de sprites disponibles
     * @param sistems int - Numero de sistemas disponibles
     * @return boolean - (true) Si se puede elaborar el juego y (false) si no
     */
    public boolean canMakeGame(int levels, int narrative, int sprites, int sistems) {

        return (levels >= this.levelsNeedIt && narrative >= this.narrativeNeedIt && sprites >= this.spritesNeedIt && sistems >= this.sistemsNeedIt);
    }

    /**
     * Identifica si un juego se puede hacer con los elementos almacenados en el
     * Drive
     *
     * @param levels int - Numero de niveles disponibles
     * @param narrative int - Numero de guiones disponibles
     * @param sprites int - Numero de sprites disponibles
     * @param sistems int - Numero de sistemas disponibles
     * @param DLCs int - Numero de DLCs disponibles
     * @return boolean - (true) Si se puede elaborar el juego y (false) si no
     */
    public boolean canMakeGameDLC(int levels, int narrative, int sprites, int sistems, int DLCs) {

        return (levels >= this.levelsNeedIt && narrative >= this.narrativeNeedIt && sprites >= this.spritesNeedIt && sistems >= this.sistemsNeedIt && DLCs >= this.DLCsNeedIt);
    }

    //Getters
    public float getIncome() {
        return income;
    }

    public float getIncomeDLC() {
        return incomeDLC;
    }

    public int getLevelsNeedIt() {
        return levelsNeedIt;
    }

    public int getNarrativeNeedIt() {
        return narrativeNeedIt;
    }

    public int getDLCsNeedIt() {
        return DLCsNeedIt;
    }

    public int getSpritesNeedIt() {
        return spritesNeedIt;
    }

    public int getSistemsNeedIt() {
        return sistemsNeedIt;
    }

    public int getEmployees() {
        return employees;
    }

    public float getLevelCost() {
        return levelCost;
    }

    public float getNarrativeCost() {
        return narrativeCost;
    }

    public float getDLCCost() {
        return DLCCost;
    }

    public float getSpriteCost() {
        return spriteCost;
    }

    public float getSistemCost() {
        return sistemCost;
    }

    public float getIntegratorCost() {
        return integratorCost;
    }

    public float getLevelProductionPerDay() {
        return levelProductionPerDay;
    }

    public float getNarrativeProductionPerDay() {
        return narrativeProductionPerDay;
    }

    public float getDLCsProductionPerDay() {
        return DLCsProductionPerDay;
    }

    public float getSpritesProductionPerDay() {
        return spritesProductionPerDay;
    }

    public float getSistemsProductionPerDay() {
        return sistemsProductionPerDay;
    }

    public int getGamesToGamesDLC() {
        return gamesToGamesDLC;
    }

    /**
     * @return the pmCost
     */
    public float getPmCost() {
        return pmCost;
    }

    /**
     * @return the directorCost
     */
    public float getDirectorCost() {
        return directorCost;
    }

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return the background
     */
    public String getBackground() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(String background) {
        this.background = background;
    }
}
