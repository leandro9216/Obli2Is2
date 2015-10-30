/*
 * Created on Feb 8, 2010
 *
 */
package viajenda.com.wolfram.alpha;

import viajenda.com.wolfram.alpha.visitor.Visitable;


public interface WAUnits extends Visitable {

    String[] getLongNames();
    String[] getShortNames();
    WAImage getImage();
}
