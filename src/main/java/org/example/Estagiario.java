package org.example;

public class Estagiario extends Usuario {
    public Estagiario(Usuario superior) {
        listaAcessos.add(AmbienteTeste.getTipoAmbienteTeste());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario() {
        return "Estagiario";
    }
}
