package com.web.project.controllers;

import com.web.project.models.ProjetoPesquisa;
import com.web.project.services.ProjetoPesquisaService;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ProjetoPesquisaController {

	private Path pathFiles = Paths.get(System.getProperty("user.dir") + "/arquivos");

	@Autowired
	private ProjetoPesquisaService projetoPesquisaService;

	@GetMapping(value = "/projetos")
	public List<ProjetoPesquisa> getAll() {

		return projetoPesquisaService.getAll();

	}

	@GetMapping(value = "/projeto")
	public ProjetoPesquisa getById(Long id) {
		Optional<ProjetoPesquisa> projetoPesquisa = projetoPesquisaService.getById(id);

		return projetoPesquisa.orElse(null);

	}

	@PostMapping(value = "/criarProjeto")
	public void createAluno(String nome, String resumo, String anoInicio, String anoTermino,
		MultipartFile arquivo,
		String dissertacao, String tese, String pesquisadorCpf) {

		Path filepath = Paths.get(pathFiles.toString(), arquivo.getOriginalFilename());

		try (OutputStream os = Files.newOutputStream(filepath)) {
			os.write(arquivo.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		File arquivoSalvo = new File(filepath.toUri());
		projetoPesquisaService.criaProjetoPesquisa(nome, resumo, LocalDate.parse(anoInicio),
			LocalDate.parse(anoTermino),
			arquivoSalvo,
			dissertacao, tese, pesquisadorCpf);

	}

	@DeleteMapping(value = "/deletaProjeto")
	public void deletaAluno(long id) throws NotFoundException {

		projetoPesquisaService.deletar(id);

	}

}
