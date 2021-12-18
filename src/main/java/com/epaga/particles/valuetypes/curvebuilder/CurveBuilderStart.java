package com.epaga.particles.valuetypes.curvebuilder;

import com.epaga.particles.valuetypes.Curve;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

public class CurveBuilderStart{

  Curve curveBeingBuilt = new Curve();

  /**
   * Adds the first anchor point, where the line will start
   * @return CurveBuilderAtAnchor a part of the curve builder system
   */
  public CurveBuilderAtAnchor anchorPoint(Vector2f start){
    return new CurveBuilderAtAnchor(curveBeingBuilt, null, start);
  }

}
