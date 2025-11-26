package com.example.client;



import javax.xml.namespace.QName;

import com.example.api.HelloService;
import jakarta.xml.ws.Service;
import java.net.URL;

public class ClientDemo {
    public static void main(String[] args) throws Exception {

        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");

        // (Namespace, ServiceName) - Doivent correspondre au WSDL
        QName qname = new QName("http://api.cxf.acme.com/", "HelloService");

        Service svc = Service.create(wsdl, qname);
        HelloService port = svc.getPort(HelloService.class);

        // Appel 1
        System.out.println("Appel SayHello...");
        System.out.println(port.sayHello("ClientJava"));

        // Appel 2
        System.out.println("\nAppel FindPerson...");
        System.out.println("Nom trouvé : " + port.findPersonById("P-777").getName());
    }
}
