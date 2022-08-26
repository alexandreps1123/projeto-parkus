package br.com.parkus.projeto.dao;

import br.com.parkus.projeto.dto.ClienteDTO;

import java.util.List;

public interface ClienteDAO {

    public List<ClienteDTO> todos();

    public ClienteDTO buscaPorId(Integer id);

    public ClienteDTO salva(ClienteDTO clienteDTO);

    public ClienteDTO atualiza(ClienteDTO clienteDTO);

    public void deleta(Integer id);
}
