package Test.Java;
import Main.Java.CheckWin;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class TestCode {

    @Test
    void testWin(){
        CheckWIn checker=new CheckWin();
        String[] board={"X,"Y,"X"};
        assertTrue(checker.checkWin(board));

    }



}
