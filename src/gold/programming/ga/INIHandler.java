package gold.programming.ga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

public class INIHandler {

	public static void makeConfig() throws InvalidFileFormatException,
			IOException {

		File config = new File("C:\\Users\\" + System.getProperty("user.name")
				+ "\\Desktop\\DTR2Install\\config.ini");
		FileOutputStream is = new FileOutputStream(config);
		OutputStreamWriter osw = new OutputStreamWriter(is);
		Writer w = new BufferedWriter(osw);
	}

	public static void writeConfig()
			throws InvalidFileFormatException, IOException {
		Wini ini = new Wini(new File("C:\\Users\\"
				+ System.getProperty("user.name")
				+ "\\Desktop\\DTR2Install\\config.ini"));
		ini.put("directories", "installDir", "C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\");
	}

	public static void main(String[] args) throws InvalidFileFormatException,
			IOException {
		makeConfig();
		writeConfig();
	}
}
