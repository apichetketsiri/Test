import com.example.game.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestUnitTest {
    @InjectMocks
    Main main = new Main();

    @Test
    public void test_index(){
        String text = main.home();
        assertEquals(text, "Hello World! Jenkins");

    }
}
