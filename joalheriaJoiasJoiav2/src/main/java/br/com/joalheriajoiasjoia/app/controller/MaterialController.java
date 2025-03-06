package br.com.joalheriajoiasjoia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.service.MaterialService;

@RestController
@RequestMapping("/cadastroMaterial")
public class MaterialController {

	@Autowired
	private MaterialService materialService;

	@PostMapping
	public Material createMaterial(@RequestBody Material material) {
		return materialService.saveMaterial(material);
	}

	@GetMapping
	public List<Material> getAllMaterial() {
		return materialService.getAllMaterial();
	}

	@GetMapping("/{id}")
	public Material getMaterial(@PathVariable Long id) {
		return materialService.getMaterialById(id);
	}

	@PutMapping
	public Material editMaterial(@RequestBody Material material) {
		return materialService.saveMaterial(material);
	}

	@DeleteMapping("/{id}")
	public void deleteMaterial(@PathVariable Long id) {
		materialService.deleteMaterial(id);
	}
}