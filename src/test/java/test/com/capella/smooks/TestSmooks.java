package test.com.capella.smooks;

import org.junit.Test;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.event.report.HtmlReportGenerator;
import org.milyn.io.StreamUtils;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

/**
 * Created on : 2/8/16
 *
 * @author Ramesh Rajendran
 */
public class TestSmooks {
    private Smooks smooks;

    protected String runSmooksTransform(ExecutionContext executionContext) throws IOException, SAXException, SmooksException {
        try {
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(new Locale("en", "IE"));

            StringResult result = new StringResult();

            // Configure the execution context to generate a report...
//            executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            // Filter the input message to the outputWriter, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(readInputMessage())), result);

            Locale.setDefault(defaultLocale);

            return result.toString();
        } finally {
            smooks.close();
        }
    }

    private static byte[] readInputMessage() {
        try {
            return StreamUtils.readStream(new FileInputStream("src/main/resources/input.json"));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>".getBytes();
        }
    }

    public TestSmooks() throws IOException, SAXException {
        smooks = new Smooks("smooks-config.xml");
    }


    @Test
    public void testSmooks() throws IOException, SAXException {
        ExecutionContext executionContext = smooks.createExecutionContext();
        String s = runSmooksTransform(executionContext);
        System.out.println("Result " + s);
        System.out.println("****" + (executionContext.getBeanContext().getBean("order")));
    }
}
