package br.com.infnet.appemprestimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appemprestimo.model.negocio.Game;
import br.com.infnet.appemprestimo.model.service.GameService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/emprestimo")
public class GameController {

	@Autowired
	private GameService gameService;

	@ApiOperation(value = "Retornar uma lista de games")
	@GetMapping(value = "/games")
	public List<Game> obterLista() {
		return gameService.obterLista();
	}

	@ApiOperation(value = "Retornar um game")
	@GetMapping(value = "/game/{id}")
	public Game obterPorId(@PathVariable Integer id) {
		return gameService.obterPorId(id);
	}
}