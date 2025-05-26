package org.example;

public class AmbienteHomologacao implements TipoAcesso {
    private static AmbienteHomologacao tipoAmbienteHomologacao = new AmbienteHomologacao();

    private AmbienteHomologacao() {}

    public static AmbienteHomologacao getTipoAmbienteHomologacao() {
        return tipoAmbienteHomologacao;
    }
}
