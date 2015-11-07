import java.io.IOException;

public class setEnvVariable {

	public static void main(String[] args) throws IOException,
			InterruptedException {
		String var_name = "Name";
		String var_value = "Sagar";
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("setx " + var_name + " " + var_value);
		p.waitFor();
		p.destroy();
	}
}