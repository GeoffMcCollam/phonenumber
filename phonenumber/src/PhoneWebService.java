import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="api/phonenumbers/parse")
public class PhoneWebService {
    @WebMethod
    public String sayHello(String name){
        return "Hello " + name + "!";
    }
}