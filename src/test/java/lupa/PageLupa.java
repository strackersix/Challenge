package lupa;

import _core.Constantes;
import _core.Locators;

public class PageLupa extends Locators implements Constantes {

    public void clickBtnLupa(){

        takeScreenShot();
        click(btnLupa);
    }

    public void clickBtnPesquisar(){

        click(btnPesquisar);
    }

    public String getTextBtnPesquisar(){

        return getTextAttribute(btnPesquisar, pesquisar);
    }

    public String getTextInputPesquisar(){

        takeScreenShot();
        return getTextAttribute(inputPesquisar, placeholder);
    }

    public void entrarTextoAleatorioInputText(){

        takeScreenShot();
        sendKeys(inputPesquisar,textoAleatorio);
    }

    public void senKeysTextoFinancas(){

        sendKeys(inputPesquisar,pesquisaExistente);
        takeScreenShot();
    }

    public String getTextNenhumResultado(){

        takeScreenShot();
        return getText(tituloEntrada);
    }

    public String getTextResultadoEncontrado(){

        takeScreenShot();
        return getText(tituloArquivo);
    }
}
