package locationvoiture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import locationvoiture.services.GammeService;

@RestController
@RequestMapping(value="/api/gammes")
@PreAuthorize("permitAll()")
public class GammeControllerApi {
	
	@Autowired
	private GammeService gs;

}
