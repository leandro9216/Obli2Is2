package viajenda.extras;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class Traductor {
    
    public Traductor(){
    
    }

    public String traducir(String cadena, boolean aIngles) throws Exception {
	// Set your Windows Azure Marketplace client info - See http://msdn.microsoft.com/en-us/library/hh454950.aspx
	Translate.setClientId("viajenda2012");
	Translate.setClientSecret("orIjlge6Qy3wOpapL+aBNRpTRTL3zHLpkxncocYYLWU=");
	if(aIngles){
	    return Translate.execute(cadena, Language.SPANISH, Language.ENGLISH);
	}else{
	    return Translate.execute(cadena, Language.ENGLISH, Language.SPANISH);
	}
    }
}