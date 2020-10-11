package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.respository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired 	
	private TopicoRepository topicoRepository;
	
	//Temos que ter um método mapeando o endereço
	//A lógica nesse trecho seria carregar a lista com todos os tópicos e devolver ela pra quem fez a chamada.
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Dúvida spring-boot:run", "Dúvida com Spring", new Curso("Spring", "Programação"));
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}

}
