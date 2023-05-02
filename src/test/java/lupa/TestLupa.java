package lupa;

import _core.BaseTest;
import _core.Constantes;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;

public class TestLupa extends BaseTest implements Constantes {

    PageLupa pl = new PageLupa();

    @Test
    @Story("Validar o botão / ícone da Lupa.")
    @Description("Verificar se o botão / ícone da lupa está responsivo")
    public void validarBtnLupa(){

        pl.clickBtnLupa();

        Assert.assertEquals(textBtnPesquisar,pl.getTextBtnPesquisar());
        Assert.assertEquals(textInputPesquisar,pl.getTextInputPesquisar());
    }

    @Test
    @Story("Valdiar o placeholder do campo: 'Input'.")
    @Description("Validar a descrição 'Pesquisar...' do Placeholder com base na especificação técnica / regra de negócio / protótipo wireframe.")
    public void validarPlaceholderInputText(){

        pl.clickBtnLupa();

        Assert.assertEquals(textInputPesquisar,pl.getTextInputPesquisar());
    }

    @Test
    @Story("Validar uma pesquisa com conteúdo 'Existente'.")
    @Description("Validar uma pesquisa buscando por um registro existente no blog e clicando no botão pesquisar.")
    public void validarPesquisaExistente(){

        pl.clickBtnLupa();
        pl.senKeysTextoFinancas();
        pl.clickBtnPesquisar();

        Assert.assertTrue(pl.getTextResultadoEncontrado().contains(pesquisaExistente));
    }

    @Test
    @Story("Validar uma pesquisa com conteúdo 'Inexistente'.")
    @Description("Validar uma pesquisa buscando por um resgitro inexistente no blog, clicando no botão Pesquisar e validando a seguinte notificação retornada pelo blog: Nenhum resultado.")
    public void validarPesquisaInexistente(){

        pl.clickBtnLupa();
        pl.entrarTextoAleatorioInputText();
        pl.clickBtnPesquisar();

        Assert.assertEquals(nenhumResultado,pl.getTextNenhumResultado());
    }
}
