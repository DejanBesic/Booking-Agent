//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.14 at 11:50:12 PM CEST 
//


package com.agent.app.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.agent.app.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.agent.app.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestRequest }
     * 
     */
    public TestRequest createTestRequest() {
        return new TestRequest();
    }

    /**
     * Create an instance of {@link FacilityRequest }
     * 
     */
    public FacilityRequest createFacilityRequest() {
        return new FacilityRequest();
    }

    /**
     * Create an instance of {@link FacilityResponse }
     * 
     */
    public FacilityResponse createFacilityResponse() {
        return new FacilityResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link GetDBRequest }
     * 
     */
    public GetDBRequest createGetDBRequest() {
        return new GetDBRequest();
    }

    /**
     * Create an instance of {@link GetDBResponse }
     * 
     */
    public GetDBResponse createGetDBResponse() {
        return new GetDBResponse();
    }

}
