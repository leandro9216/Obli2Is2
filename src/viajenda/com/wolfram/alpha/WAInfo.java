/*
 * Created on Dec 9, 2009
 *
 */
package viajenda.com.wolfram.alpha;

import viajenda.com.wolfram.alpha.visitor.Visitable;


public interface WAInfo extends Visitable {

    String getText();
    Visitable[] getContents();

}
