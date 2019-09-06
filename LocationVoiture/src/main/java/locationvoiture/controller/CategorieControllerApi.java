package locationvoiture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.services.CategorieService;

@RestController
@RequestMapping(value="/api/categories")
@PreAuthorize("permitAll()")
public class CategorieControllerApi {
	
	@Autowired
	private CategorieService cs;

}
