package org.example;

public class AmbienteProducao implements TipoAcesso {
    private static AmbienteProducao tipoAmbienteProducao = new AmbienteProducao();

    private AmbienteProducao() {}

    public static AmbienteProducao getTipoAmbienteProducao() {
        return tipoAmbienteProducao;
    }
}