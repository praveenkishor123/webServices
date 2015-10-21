package domain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "HelloSEI", targetNamespace = "http://domain/")
public interface HelloSEI {

	@WebMethod(operationName = "sayHello", action = "urn:SayHello")
	@RequestWrapper(className = "domain.jaxws.SayHello", localName = "sayHello", targetNamespace = "http://domain/")
	@ResponseWrapper(className = "domain.jaxws.SayHelloResponse", localName = "sayHelloResponse", targetNamespace = "http://domain/")
	@WebResult(name = "return")
	public String sayHello(@WebParam(name = "arg0") String name);

}