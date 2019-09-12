package br.usjt.previsaodotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaodotempo.model.Periodo;
import br.usjt.previsaodotempo.repository.PrevisaoRepository;

@Controller
public class PrevisaoController {

	// a injeção de dependência ocorre aqui
	@Autowired
	private PrevisaoRepository previsaoRepo;

	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsoes");

		// Busque a coleção com o repositório
		List<Periodo> previsoes = previsaoRepo.findAll();

		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);

		// devolva o ModelAndView
		return mv;
	}

}
