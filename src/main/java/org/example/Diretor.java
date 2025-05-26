package org.example;

public class Diretor extends Usuario {

    public Diretor(Usuario superior){
        listaAcessos.add(AmbienteProducao.getTipoAmbienteProducao());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario() {
        return "Diretor";
    }
}
