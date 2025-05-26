package org.example;

public class AmbienteTeste implements TipoAcesso {
    private static AmbienteTeste tipoAmbienteTeste = new AmbienteTeste();

    private AmbienteTeste() {}

    public static AmbienteTeste getTipoAmbienteTeste() {
        return tipoAmbienteTeste;
    }
}
