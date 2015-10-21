package domain;

import javax.jws.WebService;

@WebService(targetNamespace = "http://domain/", endpointInterface = "domain.HelloSEI", portName = "HelloPort", serviceName = "HelloService")
public class Hello implements HelloSEI {
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
