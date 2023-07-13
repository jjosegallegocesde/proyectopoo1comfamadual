package org.example.validaciones;

import org.example.utilidades.Util;

public class UsuarioValidacion {

    protected Util util=new Util();

    public UsuarioValidacion() {
    }

    public boolean validarNombres(String nombres) throws Exception{
        //1. validar que el nombre tenga como minimo 10 caracteres
        if(nombres.length()<10){
            throw new Exception("revisar numero de caracteres");
        }else if(!util.validarExpresionRegular(nombres,"^[A-Za-z ]+$")){ //2. nombres solo puede tener letras
            throw new Exception("Solo se aceptan letras en el nombre");
        }else{
            return true;
        }
    }

    public boolean validarCorreo(String correo)throws Exception{
        if(!util.validarExpresionRegular(correo,"^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            throw new Exception("El formato del correo no es valido");
        }else{
            return true;
        }
    }

    public boolean validarUbicacion(Integer ubicacion)throws Exception{
        if(ubicacion <1 || ubicacion>4){
            throw new Exception("Esta ubicacion no es valida");
        }else{
            return true;
        }
    }


}
