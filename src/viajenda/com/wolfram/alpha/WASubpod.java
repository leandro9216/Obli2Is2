/*
 * Created on Dec 9, 2009
 *
 */
package viajenda.com.wolfram.alpha;

import viajenda.com.wolfram.alpha.visitor.Visitable;


public interface WASubpod extends Visitable {

    String getTitle();
    Visitable[] getContents();
    
    void acquireImage();
    
    void setUserData(Object obj);
    Object getUserData();

}
