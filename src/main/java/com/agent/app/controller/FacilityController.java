package com.agent.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agent.app.model.Facility;
import com.agent.app.ws.WSFacilityClient;
import com.agent.app.wsdl.FacilityResponse;


@RestController
@RequestMapping("/api/facility")
public class FacilityController {

	@Autowired
	WSFacilityClient client;
	
	@GetMapping
    public ResponseEntity<?> getFacilities() {
    
		
		Facility facility = new Facility();
		facility.setAddress("adresa");
		facility.setCategory(1);
		facility.setDescription("opis");
		facility.setName("naziv");
		facility.setWifi(true);
		
		
		FacilityResponse response = client.facilityWS(facility);
		if(response == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		facility.setName(response.getName());
		
    	return new ResponseEntity<>(facility, HttpStatus.OK);
    }
}
