import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class sample {
    @BeforeAll
   static void bfr(){
       int c= 1+2;
   }

   @Test
    void test1(){
        assert(true);
   }
}
