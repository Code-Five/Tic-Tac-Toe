package Test.Java;

import Main.Java.CheckWin;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCode {

    @Test
    public void testWin(){
        CheckWin checkWin=new CheckWin();
        String[] board={"1","2","3"};
        assertTrue(checkWin.checkWin(board));

    }
}
