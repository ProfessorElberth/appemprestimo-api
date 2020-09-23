package br.com.infnet.appemprestimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appemprestimo.model.negocio.Revista;
import br.com.infnet.appemprestimo.model.service.RevistaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/emprestimo")
public class RevistaController {

	@Autowired private RevistaService revistaService;
	
	@ApiOperation(value = "Retornar uma lista de revistas")
	@GetMapping(value = "/revistas")
	public List<Revista> obterLista() {
		return revistaService.obterLista();
	}

	@ApiOperation(value = "Retornar uma revista")
	@GetMapping(value = "/revista/{id}")
	public Revista obterPorId(@PathVariable Integer id) {
		return revistaService.obterPorId(id);
	}
}