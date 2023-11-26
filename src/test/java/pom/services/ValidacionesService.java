package pom.services;

import pom.DriverActions;
import pom.pages.ValidacionesPage;

public class ValidacionesService {

    ValidacionesPage validacionesPage;

    public ValidacionesService(){
        this.validacionesPage= new ValidacionesPage();
    }


    public String getCompleteText(){
        DriverActions.explicitWaitNoLoading() ;
        return DriverActions.getText(this.validacionesPage.getTxt_texto());
    }

    public Boolean isEnableContinueShopping(){
        return DriverActions.isEnabled(this.validacionesPage.getBtn_continueShopping());

    }

    public Boolean isVisibleCreateAnAccount(){
        return DriverActions.isVisible(this.validacionesPage.getBtn_createAnAccount());

    }
    public String getCompleteTextOrden() {
        return DriverActions.getText(this.validacionesPage.getTxt_textoOrden());

    }

}



