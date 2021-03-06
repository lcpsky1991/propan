package com.harium.propan.util;

import com.badlogic.gdx.math.Vector3;
import com.harium.etyl.linear.Point3D;

public class PointToVectorAdapter {

	public static Vector3 adapt(Point3D point) {
		
		float px = (float) point.getX();
		float py = (float) point.getY();
		float pz = (float) point.getZ();
		
		Vector3 vector = new Vector3(px, py, pz);
		return vector;
	}
	
	public static Point3D adapt(Vector3 vector) {
		
		double px = vector.x;
		double py = vector.y;
		double pz = vector.z;
		
		Point3D point = new Point3D(px, py, pz);
		return point;
	}
	
}
