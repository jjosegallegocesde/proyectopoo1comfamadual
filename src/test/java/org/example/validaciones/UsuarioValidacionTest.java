package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //crear un objeto de la clase que quiero probar
    private UsuarioValidacion validacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas(){
        this.validacion=new UsuarioValidacion();
        System.out.println("iniciando prueba...");
    }

    //Programamos nuestras pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Juan Jose Gallego Mesa"; //preparo
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres(){
        String nombrePrueba="Juan";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorCaracteresInvalidos(){
        String nombrePrueba="1234567890";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }


}