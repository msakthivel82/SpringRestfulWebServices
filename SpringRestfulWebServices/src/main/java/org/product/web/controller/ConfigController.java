package org.product.web.controller;

import java.util.List;

import org.product.web.bean.ConfigDetails;
import org.product.web.service.ConfigDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	ConfigDetailsService configDetailsService = new ConfigDetailsService();

	@RequestMapping(value = "/api/configdetails", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ConfigDetails> getConfigDetails() {
		List<ConfigDetails> listOfConfigDetails = configDetailsService.getAllConfigDetails();
		return listOfConfigDetails;
	}

	@RequestMapping(value = "/api/configdetails/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ConfigDetails getConfigDetails(@PathVariable int id) {
		return configDetailsService.getConfigDetails(id);
	}

	@RequestMapping(value = "/api/configdetails", method = RequestMethod.POST, headers = "Accept=application/json")
	public ConfigDetails addConfigDetails(@RequestBody ConfigDetails configdetails) {
		return configDetailsService.addConfigDetails(configdetails);
	}

	@RequestMapping(value = "/api/configdetails", method = RequestMethod.PUT, headers = "Accept=application/json")
	public ConfigDetails updateConfigDetails(@RequestBody ConfigDetails configdetails) {
		return configDetailsService.updateConfigDetails(configdetails);

	}

	@RequestMapping(value = "/api/configdetails/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteConfigDetails(@PathVariable("id") int id) {
		configDetailsService.deleteConfigDetails(id);
    }	
}
