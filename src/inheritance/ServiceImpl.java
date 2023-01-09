package inheritance;

public class ServiceImpl implements Service {

	@Override
	public void simpleAccount() {
		System.out.println("platanium Account");
	}

	
	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		service.simpleAccount();
	}
}
