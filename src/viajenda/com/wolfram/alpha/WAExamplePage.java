/*
 * Created on Sep 19, 2010
 *
 */
package viajenda.com.wolfram.alpha;

import viajenda.com.wolfram.alpha.visitor.Visitable;


public interface WAExamplePage extends Visitable {

    String getCategory();
    String getURL();
}
