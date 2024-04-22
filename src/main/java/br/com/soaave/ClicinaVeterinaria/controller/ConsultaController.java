package br.com.soaave.ClicinaVeterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.soaave.ClicinaVeterinaria.models.Consulta;
import br.com.soaave.ClicinaVeterinaria.services.ConsultaService;

@Controller
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/agendar")
    public String exibirFormularioAgendamento() {
        return "formulario_agendamento";
    }

    @PostMapping("/agendar")
    public String processarFormularioAgendamento(@RequestParam String nomePet,
                                                 @RequestParam String dataConsulta,
                                                 @RequestParam String nomeDono,
                                                 Model model) {

        Consulta consulta = consultaService.agendarConsulta(nomePet, dataConsulta, nomeDono);
        model.addAttribute("consulta", consulta);
        return "confirmacao_agendamento";
    }

    @GetMapping("/consultas")
    public String listarConsultas(Model model) {
        model.addAttribute("consultas", consultaService.listarConsultas());
        return "lista_consultas";
    }
}
