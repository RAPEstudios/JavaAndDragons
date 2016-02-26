import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class JadCredits implements Runnable {

	public void drawJavaToAscII() {
		int width = 100;
		int height = 30;

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("SansSerif", Font.BOLD, 10));

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString("JAVA", 5, 10);

		for (int i = 0; i < height; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < width; j++) {
				sb.append(image.getRGB(j, i) == -16777216 ? " " : "E");

			}
			if (sb.toString().trim().isEmpty()) {
				continue;

			}
			System.out.println(sb);
		}
	}

	public void drawAndToAscII() {
		int width = 100;
		int height = 30;

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("SansSerif", Font.BOLD, 10));

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString("AND", 5, 10);

		for (int i = 0; i < height; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < width; j++) {
				sb.append(image.getRGB(j, i) == -16777216 ? " " : "P");

			}
			if (sb.toString().trim().isEmpty()) {
				continue;

			}
			System.out.println(sb);
		}

	}

	public void drawDragonsToascII() {
		int width = 100;
		int height = 30;

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("SansSerif", Font.BOLD, 10));

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString("DRAGONS", 5, 10);

		for (int i = 0; i < height; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < width; j++) {
				sb.append(image.getRGB(j, i) == -16777216 ? " " : "R");

			}
			if (sb.toString().trim().isEmpty()) {
				continue;

			}
			System.out.println(sb);
		}

	}

	/*
	 * Muss hier nochmal gucken... er springt nicht in die run methode rein.
	 * obwohl ich den thread starte.
	 */
	public void printCredits() {
		int sleepTime = 2000;

		try {
			System.out.println(JadDialog.CreditsEnglish.gameName);
			Thread.sleep(sleepTime);
			System.out.println("is presented by");
			Thread.sleep(sleepTime);
			System.out.println(JadDialog.CreditsEnglish.rapeStudios);
			Thread.sleep(sleepTime);
			System.out.println("programmed by");
			Thread.sleep(sleepTime);
			System.out.println(JadDialog.CreditsEnglish.firstProgrammer);
			Thread.sleep(sleepTime);
			System.out.println("and by");
			Thread.sleep(sleepTime);
			System.out.println(JadDialog.CreditsEnglish.secondProgrammer);
			Thread.sleep(sleepTime);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Thread t = new Thread(this, "Credits");
		// t.start();

	}

	public void run() {

	}
	// public void run() {
	// int sleepTime = 2000;
	// try {
	// System.out.println(JadLanguage.Deutsch.gameName);
	// Thread.sleep(sleepTime);
	// System.out.println("is presented by");
	// Thread.sleep(sleepTime);
	// System.out.println(JadLanguage.Deutsch.rapeStudios);
	// Thread.sleep(sleepTime);
	// System.out.println("programmed by");
	// Thread.sleep(sleepTime);
	// System.out.println(JadLanguage.Deutsch.firstProgrammer);
	// Thread.sleep(sleepTime);
	// System.out.println("and by");
	// Thread.sleep(sleepTime);
	// System.out.println(JadLanguage.Deutsch.secondProgrammer);
	// Thread.sleep(sleepTime);
	// } catch (Exception e) {
	// System.out.println("Something went wrong. Please restart the game. \n "
	// + e);
	// }
	//
	//test
	//
	// }

}
