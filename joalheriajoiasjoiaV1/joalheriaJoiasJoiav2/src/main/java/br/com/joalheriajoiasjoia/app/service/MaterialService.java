package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.repositories.MaterialRepository;


@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	
	public Material saveMaterial( Material material) {
		return materialRepository.save(material);
	}
	
	public List<Material> getAllMaterial(){
		return materialRepository.findAll();
	}
	
	public Material getMaterialById (Long id) {
		return materialRepository.findById(id).orElse(null);
	}
	
	public void deleteMaterial(Long id) {
		materialRepository.deleteById(id);
	}

}
