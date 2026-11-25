import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;


class BlobTest {
@Test
void sameContentsGiveSameId(){
    Blob a = new Blob("Hello, World!");
    Blob b = new Blob("Hello, World!");
    assertEquals(a.getId(), b.getId());
    assertEquals(a, b);
    assertNotSame(a,b);

}

}