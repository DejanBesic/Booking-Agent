package com.agent.app.ws;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.agent.app.model.Facility;
import com.agent.app.wsdl.FacilityRequest;
import com.agent.app.wsdl.FacilityResponse;


public class WSFacilityClient extends WebServiceGatewaySupport {
	private static final String URI = "http://localhost:1312/ws";
	
	public FacilityResponse facilityWS(Facility facility) {
		FacilityRequest request = new FacilityRequest();
		request.setName(facility.getName());
		request.setAddress(facility.getAddress());
		request.setDescription(facility.getDescription());
		request.setCategory(facility.getCategory());
		FacilityResponse response = (FacilityResponse) getWebServiceTemplate().marshalSendAndReceive(URI , request, new SoapActionCallback(URI + "/facilityRequest"));
		return response;
	}
	
	
	
}
