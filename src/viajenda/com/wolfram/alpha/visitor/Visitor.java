/*
 * Created on Dec 8, 2009
 *
 */
package viajenda.com.wolfram.alpha.visitor;

import viajenda.com.wolfram.alpha.WAAssumption;
import viajenda.com.wolfram.alpha.WAExamplePage;
import viajenda.com.wolfram.alpha.WAFutureTopic;
import viajenda.com.wolfram.alpha.WAImage;
import viajenda.com.wolfram.alpha.WAInfo;
import viajenda.com.wolfram.alpha.WALink;
import viajenda.com.wolfram.alpha.WAPlainText;
import viajenda.com.wolfram.alpha.WAPod;
import viajenda.com.wolfram.alpha.WAPodState;
import viajenda.com.wolfram.alpha.WAQueryResult;
import viajenda.com.wolfram.alpha.WAReinterpretWarning;
import viajenda.com.wolfram.alpha.WARelatedExample;
import viajenda.com.wolfram.alpha.WARelatedLink;
import viajenda.com.wolfram.alpha.WASound;
import viajenda.com.wolfram.alpha.WASourceInfo;
import viajenda.com.wolfram.alpha.WASubpod;
import viajenda.com.wolfram.alpha.WAUnits;
import viajenda.com.wolfram.alpha.WAWarning;


public interface Visitor {
    
    void visit(WAQueryResult obj); 
    void visit(WAPod obj); 
    void visit(WASubpod obj); 
    void visit(WAAssumption obj); 
    void visit(WAWarning obj); 
    void visit(WAInfo obj); 
    void visit(WAPodState obj); 
    void visit(WARelatedLink obj); 
    void visit(WARelatedExample obj); 
    void visit(WASourceInfo obj); 
    void visit(WAFutureTopic obj); 
    void visit(WAExamplePage obj); 
    void visit(WALink obj); 
    void visit(WAReinterpretWarning obj); 
    void visit(WAUnits obj); 
    
    // Content types
    void visit(WAPlainText obj); 
    void visit(WAImage obj); 
    void visit(WASound obj); 

}
