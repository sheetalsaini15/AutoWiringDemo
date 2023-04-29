import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(aob)
class Address
{
	@Value("123")
	private String hno;
	@Value("Punjab")
	private String state;
	@Value("Pathankot")
	private String city;
	

}