package org.example.utilidades;

public enum Mensaje {

    NUMERO_CARACTERES_INVALIDO("El numero de caracteres es invalido"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),
    CORREO_INVALIDO("Revisa el formato del correo"),
    UBICACION_INVALIDA("La ubicación solo puede ser un numero entre 1 y 4");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
