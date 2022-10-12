package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.util.Calendar;


/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Prof.: José Viterbo (aluno: Walber)";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    public String getMsg() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        switch (this.lang){
            case "pt":
                if(timeOfDay < 12){
            return "Bom dia";
        }else if(timeOfDay < 16){
            return "Boa tarde";
        }else if(timeOfDay < 21){
            return "Bom anoitecer";
        }else {
            return "Boa noite";
        }
                
            case "en":
                if(timeOfDay < 12){
            return "Good morning";
        }else if(timeOfDay < 16){
            return "Good afternoon";
        }else if(timeOfDay < 21){
            return "Good evening";
        }else {
            return "Good night";
        }
            case "de":
                if(timeOfDay < 12){
            return "Guten Morgen";
        }else if(timeOfDay < 16){
            return "Guten Tag";
        }else if(timeOfDay < 21){
            return "Guten Abend";
        }else {
            return "Guten Nacht";
        }
            case "fr":
                if(timeOfDay < 12){
            return "Bonne journée";
        }else if(timeOfDay < 16){
            return "Bonne après-midi";
        }else if(timeOfDay < 21){
            return "Bonsoir";
        }else {
            return "Bonne nuit";
        }
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}

