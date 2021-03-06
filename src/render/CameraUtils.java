package render;

import assets.*;

public class CameraUtils {
	
	public static double dist(double x1, double y1, double x2, double y2) {
		return dist(x1, y1, 0, x2, y2, 0);
	}
	
	public static double dist(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2) );
	}
}
