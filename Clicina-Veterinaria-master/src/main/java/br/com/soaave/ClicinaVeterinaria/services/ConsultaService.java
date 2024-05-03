package br.com.soaave.ClicinaVeterinaria.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import br.com.soaave.ClicinaVeterinaria.models.Consulta;

@Service
public class ConsultaService {

    // Lista para armazenar as consultas agendadas (simulando um banco de dados)
    private final List<Consulta> consultas = new ArrayList<>();


    // Método para agendar uma nova consulta
    public Consulta agendarConsulta(String nomePet, String dataConsulta, String nomeDono) {
        Consulta novaConsulta = new Consulta(nomePet, dataConsulta, nomeDono);
        consultas.add(novaConsulta);
        return novaConsulta;
    }

    // Método para obter todas as consultas agendadas
    public List<Consulta> listarConsultas() {
        return consultas ;
    }
}
