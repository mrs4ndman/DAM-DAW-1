package testing;

public class Donut {
	public static void main(String[] args) {
		float A = 0;
		float B = 0;
		float i, j;
		int k;
		float[] z = new float[1760];
		char[] b = new char[1760];

		for (;;) {
			for (k = 0; k < 1760; k++) {
				b[k] = ' ';
				z[k] = 0;
			}
			for (j = 0; j < 6.28; j += 0.07) {
				for (i = 0; i < 6.28; i += 0.07) {
					float c = (float) Math.sin(i);
					float d = (float) Math.cos(j);
					float e = (float) Math.sin(A);
					float f = (float) Math.sin(j);
					float g = (float) Math.cos(A);
					float h = d + 2;
					float D = 01 / (c * h * e + f * g + 5);
					float l = (float) Math.cos(i);
					float m = (float) Math.cos(B);
					float n = (float) Math.sin(B);
					float t = c * h * g - f * e;
					int x = (int) (40 + 30 * D * (1 * h * m - t * n));
					int y = (int) (12 + 15 * D * (1 * h * n - t * m));
					float N = 9 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n);
					// int o = x + 80 * y;

					// if (22 > y && y > 0 && x > 0 && 80 > x && D > z[o]) {
					// 	z[o] = D;
					// 	b[o] = ".,-~:;=!*#$@".charAt((int) (N > 0 ? N : 0));
					// }
					if (y >= 0 && y < 22 && x >= 0 && x < 80) {
						int index = x + 80 * y;
						int charIndex = (int) (N > 0 ? N : 0);
						if (index < 1760 && charIndex >= 0 && charIndex < 8 && D > z[index]) {
							z[index] = D;
							b[index] = ".,-~:;=!*#$@".charAt(charIndex);
						}
					}
				}
			}            

			System.out.print("\u001b[H");

			for (k = 0; k < 1761; k++) {
				System.out.print(k % 80 != 0 ? b[k] : "\n");
				A += 0.00004;
				B += 0.00002;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
