package org.example;

import java.util.ArrayList;

public abstract class Usuario {
    protected ArrayList listaAcessos = new ArrayList();
    private Usuario usuarioSuperior;

    public Usuario getUsuarioSuperior() {
        return usuarioSuperior;
    }

    public void setUsuarioSuperior(Usuario usuarioSuperior) {
        this.usuarioSuperior = usuarioSuperior;
    }

    public abstract String getDescricaoUsuario();

    public String acessarAmbiente(Acesso acesso) {
        if (listaAcessos.contains(acesso.getTipoAcesso())) {
            return getDescricaoUsuario();
        }
        else {
            if (usuarioSuperior != null) {
                return usuarioSuperior.acessarAmbiente(acesso);
            }
            else {
                return "Sem acesso ao ambiente";
            }
        }
    }
}
