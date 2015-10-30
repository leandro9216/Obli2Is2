/*
 * Created on Feb 8, 2010
 *
 */
package viajenda.com.wolfram.alpha;

import viajenda.com.wolfram.alpha.visitor.Visitable;


public interface WALink extends Visitable {

    String getURL();
    String getText();
    String getTitle();
}
