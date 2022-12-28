package com.ygorod.webapp;

//import com.ygorod.webapp.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import static org.mockito.Mockito.when;
//import org.mockito.junit.jupiter.*;

//import java.io.IOException;
//import javax.servlet.ServletException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ExtendWith(MockitoExtension.class)
public class AboutTest {
    //private HttpServletRequest request;
    //private HttpServletResponse response;

    @BeforeAll
    public void runBeforeClass() {
        System.out.println("Run before the entire test suite...");
    }

    @BeforeEach
    public void runBeforeEachTest() {
        System.out.println("Run before each test...");
    }

    @Disabled
    public void thisTestIsSkipped() {
        System.out.println("Skipped");
    }
    
    @Test
    public void thisTestIsOk() {
        String methodName = new Object() {}
            .getClass()
            .getEnclosingMethod()
            .getName();
        System.out.println("Test " + methodName + "() is in progress..." );
        assertTrue(true);
    }

    /*
    @Test
    public void testServletServerContentType() throws IOException, ServletException {
        About about = new About();

        about.doGet(request, response);
        String contentType = response.getContentType();
        assertEquals("text/html", contentType);
    }
    */
}