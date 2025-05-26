package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcessoTest {

    Estagiario estagiario;
    Supervisor supervisor;
    Diretor diretor;

    @BeforeEach
    void setUp() {
        diretor = new Diretor(null);
        supervisor = new Supervisor(diretor);
        estagiario = new Estagiario(supervisor);
    }

    @Test
    void deveRetornarEstagiarioParaAcessarAmbienteTeste() {
        assertEquals("Estagiario", estagiario.acessarAmbiente(new Acesso(AmbienteTeste.getTipoAmbienteTeste())));
    }

    @Test
    void deveRetornarSupervisorParaAcessarAmbienteHomologacao() {
        assertEquals("Supervisor", estagiario.acessarAmbiente(new Acesso(AmbienteHomologacao.getTipoAmbienteHomologacao())));
    }

    @Test
    void deveRetornarDiretorParaAcessarAmbienteProducao() {
        assertEquals("Diretor", estagiario.acessarAmbiente(new Acesso(AmbienteProducao.getTipoAmbienteProducao())));
    }

    @Test
    void deveNegarAcessoCasoNaoHajaSuperior() {
        Usuario usuarioSemSuperior = new Supervisor(null);
        assertEquals("Sem acesso ao ambiente", usuarioSemSuperior.acessarAmbiente(new Acesso(AmbienteProducao.getTipoAmbienteProducao())));
    }
}
