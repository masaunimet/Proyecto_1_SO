/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;
import Enums.CompanyEnum;
import static Enums.CompanyEnum.Capcom;
import static Enums.CompanyEnum.Nintendo;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Clase encargada de la lectura y escritura de los JSONs
 * @author Masa500
 */
public class JSONStore {
    
    Gson gson = new Gson();
    File capcomFile = new File("./src/Store/CapcomJSON.json");
    File nintendoFile = new File("./src/Store/NintendoJSON.json");
    
    
    public JSONStore(){}
    
    /**
     * Metodo encargado para la lectura del JSON
     * @param companyType CompanyEnum - Tipo de compañia
     * @return FileEntity - Entidad con la informacion necesaria
     * @throws IOException - Error si no se encuentra o no se puede leer el archivo
     */
    public FileEntity GetFile(CompanyEnum companyType) throws IOException{
        
        try{
            
            //Escoje el tipo de compañia
            File selectedFile = null;
            switch(companyType){
                case Nintendo:
                    selectedFile = nintendoFile;
                    break;
                case Capcom:
                    selectedFile = capcomFile;
                    break;
            }
            
            //Lee el JSON
            FileReader myreader = new FileReader(selectedFile);
            FileEntity file = gson.fromJson(myreader, FileEntity.class);
            myreader.close();
            return file;
        }
        catch(IOException e){
            
            return null;
        }
    }
    
    /**
     * Metodo encargado para la escritura del JSON
     * @param file FileEntity - Entidad con la informacion para la escritura
     * @param companyType CompanyEnum - Tipo de compañia
     * @throws IOException -  Error si no se encuentra o no se puede escribir el archivo
     */
    public void setCapcomFile(FileEntity file, CompanyEnum companyType) throws IOException{
        
        try{
            
            //Escoje el tipo de compañia
            File selectedFile = null;
            switch(companyType){
                case Nintendo:
                    selectedFile = nintendoFile;
                    break;
                case Capcom:
                    selectedFile = capcomFile;
                    break;
            }
    
            //Escribe el JSON
            FileWriter fileWriter = new FileWriter(selectedFile);
            gson.toJson(file, fileWriter);
            fileWriter.close();
        }
        
        catch(IOException e){
        
        }
    }
}
