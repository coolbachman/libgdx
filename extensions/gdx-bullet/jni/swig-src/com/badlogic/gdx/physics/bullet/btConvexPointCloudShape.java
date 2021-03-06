/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btConvexPointCloudShape extends btPolyhedralConvexAabbCachingShape {
  private long swigCPtr;

  protected btConvexPointCloudShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConvexPointCloudShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexPointCloudShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexPointCloudShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btConvexPointCloudShape() {
    this(gdxBulletJNI.new_btConvexPointCloudShape__SWIG_0(), true);
  }

  public btConvexPointCloudShape(btVector3 points, int numPoints, Vector3 localScaling, boolean computeAabb) {
    this(gdxBulletJNI.new_btConvexPointCloudShape__SWIG_1(btVector3.getCPtr(points), points, numPoints, localScaling, computeAabb), true);
  }

  public btConvexPointCloudShape(btVector3 points, int numPoints, Vector3 localScaling) {
    this(gdxBulletJNI.new_btConvexPointCloudShape__SWIG_2(btVector3.getCPtr(points), points, numPoints, localScaling), true);
  }

  public void setPoints(btVector3 points, int numPoints, boolean computeAabb, Vector3 localScaling) {
    gdxBulletJNI.btConvexPointCloudShape_setPoints__SWIG_0(swigCPtr, this, btVector3.getCPtr(points), points, numPoints, computeAabb, localScaling);
  }

  public void setPoints(btVector3 points, int numPoints, boolean computeAabb) {
    gdxBulletJNI.btConvexPointCloudShape_setPoints__SWIG_1(swigCPtr, this, btVector3.getCPtr(points), points, numPoints, computeAabb);
  }

  public void setPoints(btVector3 points, int numPoints) {
    gdxBulletJNI.btConvexPointCloudShape_setPoints__SWIG_2(swigCPtr, this, btVector3.getCPtr(points), points, numPoints);
  }

  public btVector3 getUnscaledPoints() {
    long cPtr = gdxBulletJNI.btConvexPointCloudShape_getUnscaledPoints__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public int getNumPoints() {
    return gdxBulletJNI.btConvexPointCloudShape_getNumPoints(swigCPtr, this);
  }

  public Vector3 getScaledPoint(int index) {
	return gdxBulletJNI.btConvexPointCloudShape_getScaledPoint(swigCPtr, this, index);
}

}
