
package lm.solution.web.config.jaxwsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SquareRootServer", targetNamespace = "http://ri.jaxws.service.solution.lm/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SquareRootServer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ri.jaxws.service.solution.lm/SquareRootServer/getTimeRIRequest", output = "http://ri.jaxws.service.solution.lm/SquareRootServer/getTimeRIResponse")
    public String getTimeRI();

    /**
     * 
     * @param input
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ri.jaxws.service.solution.lm/SquareRootServer/getSquareRootRIRequest", output = "http://ri.jaxws.service.solution.lm/SquareRootServer/getSquareRootRIResponse")
    public double getSquareRootRI(
        @WebParam(name = "input", partName = "input")
        double input);

}
