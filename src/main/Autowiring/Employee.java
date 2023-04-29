import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
class Employee
{
	@Value("sheetal")
	private String name;
	@Value("123id")
	private String id;
	@Autowired
	private Address adr;
	
	
}