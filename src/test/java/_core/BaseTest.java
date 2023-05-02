package _core;
import org.junit.After;

import static _core.DriverFactory.*;

public class BaseTest {

    @After
    public void finalizar(){

    	finalizarDriverFactory();
    }
}
