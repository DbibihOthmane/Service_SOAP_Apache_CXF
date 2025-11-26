package com.example.impl;




import com.example.api.HelloService;
import com.example.model.Person;
import jakarta.jws.WebService;

@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
        endpointInterface = "com.example.api.HelloService",
        targetNamespace = "http://api.cxf.acme.com/"
)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    @Override
    public Person findPersonById(String id) {
        // Simule une recherche
        return new Person(id, "Ada Lovelace", 36);
    }
}
