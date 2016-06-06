import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;


/**
 * Created by Администратор on 16.11.2015.
 */
public class main {
    public static void main(String[] args) throws IOException {
        final WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setRedirectEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(true);
        final HtmlPage page = webClient.getPage("http://m-bitco.in/");
        DataOutputStream out = new DataOutputStream(new FileOutputStream("index.html"));
       /* System.out.println("HtmlUnit - Welcome to HtmlUnit ");
        final HtmlForm formlog = page.getFormByName("login");
        System.out.println("2222222222");
        //final HtmlForm formpass = page.getFormByName("pass");*/

        webClient.closeAllWindows();
    }

}
