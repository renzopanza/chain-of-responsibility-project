package org.example;

public class Supervisor extends Usuario {

    public Supervisor(Usuario superior) {
        listaAcessos.add(AmbienteHomologacao.getTipoAmbienteHomologacao());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario() {
        return "Supervisor";
    }
}
