package gold.programming.ga;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * @author Mike Salvatore
 * 
 */
public class Main {
	static boolean deleteAfter = true; // Save space or nahh?

	public static void main(String[] args) throws IOException {
		System.out.println("Installing cars from folder: " + "'cars'");
		if (Config.carDir.isDirectory() && Config.gameCarDir.isDirectory()) {
			FileUtils.copyDirectory(Config.carDir, Config.gameCarDir);
			System.out.println("Done with cars.");

			if (deleteAfter == true) {
				FileUtils.deleteDirectory(Config.carDir);
				FileUtils.forceMkdir(Config.carDir);
			}

			if (!Config.carDir.exists()) {
				FileUtils.forceMkdir(Config.carDir);
			}
		}

		System.out.println("Installing skins from folder: " + "'skins'");
		
		if (Config.skinsDir.isDirectory() && Config.gameSkinsDir.isDirectory()) {
			FileUtils.copyDirectory(Config.skinsDir, Config.gameSkinsDir);
			System.out.println("Done with skins.");

			if (deleteAfter == true) {
				FileUtils.deleteDirectory(Config.skinsDir);
				FileUtils.forceMkdir(Config.skinsDir);
			}

			if (!Config.skinsDir.exists()) {
				FileUtils.forceMkdir(Config.skinsDir);
			}
		}

		System.out.println("Installing tracks from folder: " + "'tracks'");
		if (Config.tracksDir.isDirectory()
				&& Config.gameTracksDir.isDirectory()) {
			FileUtils.copyDirectory(Config.tracksDir, Config.gameTracksDir);
			System.out.println("Done with tracks.");

			if (deleteAfter == true) {
				FileUtils.deleteDirectory(Config.tracksDir);

				if (!Config.tracksDir.exists()) {
					FileUtils.forceMkdir(Config.tracksDir);
				}
			}
		}
	}
}
