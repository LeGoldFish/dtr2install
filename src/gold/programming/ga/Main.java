package gold.programming.ga;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * @author Mike Salvatore
 * 
 */
public class Main {
	static File mainDir = new File(("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install"));
	static File carDir = new File(("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\cars\\"));
	static File skinsDir = new File(("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\skins\\"));
	static File tracksDir = new File(("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\DTR2Install\\tracks\\"));
	static File gameCarDir = new File("C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\cars");
	static File gameSkinsDir = new File("C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\skins");
	static File gameTracksDir = new File(("C:\\Games\\Infogrames\\Dirt Track Racing 2\\data\\tracks"));

	public static void main(String[] args) throws IOException {
		System.out.println("Installing cars from folder: " + "'cars'");
		if (carDir.isDirectory() && gameCarDir.isDirectory()) {
			FileUtils.copyDirectory(carDir, gameCarDir);
		}
		
		System.out.println("Installing skins from folder: " + "'skins'");
		if (skinsDir.isDirectory() && gameSkinsDir.isDirectory()) {
			FileUtils.copyDirectory(skinsDir, gameSkinsDir);
		}
		
		System.out.println("Installing tracks from folder: " + "'tracks'");
		if (tracksDir.isDirectory() && gameTracksDir.isDirectory()) {
			FileUtils.copyDirectory(tracksDir, gameTracksDir);
		}
	}
}
