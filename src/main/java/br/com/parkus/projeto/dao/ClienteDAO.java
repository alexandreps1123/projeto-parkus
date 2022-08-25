package br.com.parkus.projeto.dao;

import br.com.parkus.projeto.dto.ClienteDTO;

import java.util.List;

public interface ClienteDAO {

    public List<ClienteDTO> todos();

    public ClienteDTO buscaPorId(Id id);

    public ClienteDTO salva(Filme filme);

    public ClienteDTO atualiza(Filme filme);

    public void deleta(Id id);
}
