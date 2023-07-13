package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public boolean validarExpresionRegular(String cadena,String expresionregular){
        Pattern patron=Pattern.compile(expresionregular);
        Matcher coincidencia=patron.matcher(cadena);
        if(coincidencia.matches()){ //SI HAY COINCIDENCIA
           return true;
        }else{
            return false;
        }
    }


}
