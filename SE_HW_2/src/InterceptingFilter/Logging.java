package InterceptingFilter;

public class Logging implements Filter {

	public String execute(double req) {
            return "Logging : Done";
	}

}