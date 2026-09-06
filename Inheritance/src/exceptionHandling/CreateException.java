package exceptionHandling;

class NameNotFoundException extends Exception{
	public NameNotFoundException(String msg) {
		super(msg);
	}
}
public class CreateException {

	public static void main(String[] args) throws Exception {
		String name="sasmitha";
		if(name.trim().isEmpty()) {
			try {
				throw new NameNotFoundException ("Name not found");
				
			}catch(NameNotFoundException ne) {
				ne.printStackTrace();
			}
		}
		else {
			System.out.println(name);
		}
	}

}
