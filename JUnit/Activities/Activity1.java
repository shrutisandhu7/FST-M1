
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import java.util.ArrayList;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity1 {

    static ArrayList<String> list;

    @BeforeEach
    public void setUp() throws Exception{

        System.out.println("setUp method");
        //LOG.info("setUP method");
        // Initialize a new ArrayList
        list = new ArrayList<String>();
        // Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }

    @Test
    @Order(1)
    public void insertTest() throws Exception{

        //LOG.info("insertTest method");
        System.out.println("insertTest method");
        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");

        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");

    }
    @Test
    @Order(2)
    public void replaceTest() throws Exception{

        System.out.println("replaceTest method");
        //LOG.info("replaceTest method");
        // Assert size of list
        list.set(1,"delta");

        assertEquals(2, list.size(), "Wrong size");
        //Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("delta", list.get(1), "Wrong element");

    }

}
