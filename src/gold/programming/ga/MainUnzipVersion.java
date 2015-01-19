package gold.programming.ga;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Mike Salvatore
 * 
 */
public class MainUnzipVersion {
	List<String> fileList;
	final String INPUT_ZIP_FILE = "C:\\MyFile.zip";
	final static String OUTPUT_FOLDER = "C:\\outputzip";

	public static void unZipIt(String zipFile, String outputFolder) {

		byte[] buffer = new byte[1024];

		try {

			// create output directory is not exists
			File folder = new File(OUTPUT_FOLDER);
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
						+ fileName);

				System.out.println("file unzip : " + newFile.getAbsoluteFile());

				// create all non exists folders
				// else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

			System.out.println("Done");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	static File mainDir = new File(("C:\\Users\\"
			+ System.getProperty("user.name") + "\\Desktop\\DTR2Install"));
	static File carDir = new File(
			("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\cars\\"));
	static File skinsDir = new File(
			("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\skins\\"));
	static File tracksDir = new File(
			("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\tracks\\"));
	static File gameCarDir = new File(
			"C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\cars");
	static File gameSkinsDir = new File(
			"C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\skins");
	static File gameTracksDir = new File(
			("C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\tracks"));

	public static void main(String[] args) throws IOException {
		System.out.println("Installing cars from folder: " + "'cars'");
		if (carDir.isFile() && gameCarDir.isFile()) {
			
		}

		System.out.println("Installing skins from folder: " + "'skins'");
		if (skinsDir.isFile() && gameSkinsDir.isFile()) {

		}

		System.out.println("Installing tracks from folder: " + "'tracks'");
		if (tracksDir.isFile() && gameTracksDir.isFile()) {

		}
	}
}
