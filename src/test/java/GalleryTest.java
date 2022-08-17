import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;

    @BeforeEach
    public void setUp(){

//        this.gallery = new Gallery("The Art Gallery", 10000);
    }

    @Test
    public void canGetTill(){
//    int actual = .getTill();
    int expected = 10000;
    assertThat(actual).isEqualTo(expected);


    }

}
