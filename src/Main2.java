
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import java.io.*;

import static java.lang.Thread.sleep;

/**
 * Created by ������������� on 19.11.2015.
 */
public class Main2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.


        File file = new File("C:/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        boolean flag = true, flag1 = false;
        int iterator = 0;
        // And now use this to visit Google
        driver.get("https://www.facebook.com/login.php?login_attempt=1&lwv=110"); //http://m-bitco.in


       /* String jsCode = "var input  = document.getElementById('mailbox__login');"+
                        "input.value = 'nahuy95';"+
                        "var input  = document.getElementById('mailbox__password');"+
                        "input.value ='Sergkovalov1969';"+
                        "document.getElementById('mailbox__login__domain').value = '@bk.ru';"+
                        "document.getElementById('mailbox__auth__button').click();";*/

        String jsCode = "var input  = document.getElementById('email');"+
                "input.value = '099 361 9100';"+
                "var input  = document.getElementById('pass');"+
                "input.value ='mentos1969';"+
                "    var buttons = document.getElementById('loginbutton');" +
                "    buttons.click();";
           /*   "    function clickButton(val)\n" +
                "    {\n" +
                "    var buttons = document.getElementsByTagName('input');\n" +
                "      for(var i = 0; i < buttons.length; i++) \n" +
                "      {\n" +
                "         if(buttons[i].type == 'button' && buttons[i].value == val) \n" +
                "         {\n" +
                "              buttons[i].click();\n" +
                "              break; //this will exit for loop, but if you want to click every button with the value button then comment this line\n" +
                "         }\n" +
                "      }\n" +
                "}\n"+
                "clickButton('�����');";*/ //����� ������ �� ��������

       String jsCodeForClick = "var input  = document.getElementsByClassName('_s0 _rv img')[0];"+
                "if(input) input.click()";

        String jsCodeForClick5 =
                "var input = document.getElementsByClassName('_42ft _4jy0 _4jy0 _4jy4 _517h _51sy')[2];" +
                "input.click();";

        String jsCodeForClick10 = "var input  = document.getElementsByName('kjgjsdda')[0];"+
                "if(input)document.getElementsByName('kjgjsdda')[0].click()";

        String jsCodeForClick30 = "var input  = document.getElementsByName('gkyjtdrjgfd')[0];"+
                "if(input)document.getElementsByName('gkyjtdrjgfd')[0].click()";

        String jsCodeForClick1 = "var input  = document.getElementsByName('dgjkjsdfgjdfd')[0];"+
                "if(input)document.getElementsByName('dgjkjsdfgjdfd')[0].click()";

        String jsCodeForClick3 = "var input  = document.getElementsByName('lkjhjhghfg')[0];"+
                "if(input)document.getElementsByName('lkjhjhghfg')[0].click()";

        String jsCodeForClick6 = "var input  = document.getElementsByName('fghgfgffjgf')[0];"+
                "if(input)document.getElementsByName('fghgfgffjgf')[0].click()";

        String jsCodeForClick12 = "var input  = document.getElementsByName('fdghkhsdfjfd')[0];"+
                "if(input)document.getElementsByName('fdghkhsdfjfd')[0].click()";

        String jsCodeForClick24 = "var input  = document.getElementsByName('dffjsdgkffggv')[0];"+
                "if(input)document.getElementsByName('dffjsdgkffggv')[0].click()";
        String jsCodeForClick48 = "var input  = document.getElementsByName('kjgsdgfdfs')[0];"+
                "if(input)document.getElementsByName('kjgsdgfdfs')[0].click()";








        JavascriptExecutor js = null;
        if (driver instanceof JavascriptExecutor) {
            js = (JavascriptExecutor)driver;
        }

        js.executeScript(jsCode);

        // DataOutputStream out  = new DataOutputStream(new FileOutputStream("index.html"));
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        if(flag) {
            driver.get("https://www.facebook.com/groups/208855902547192/members/");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick);

            //driver.get("http://m-bitco.in/account/bonus5");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick5);

/*          driver.get("http://m-bitco.in/account/bonus6");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick10);

            driver.get("http://m-bitco.in/account/bonus3");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick30);

            driver.get("http://m-bitco.in/account/bonus7");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick1);

            driver.get("http://m-bitco.in/account/bonus0");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick3);

            driver.get("http://m-bitco.in/account/bonus8");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick6);

            driver.get("http://m-bitco.in/account/bonus9");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick12);

            driver.get("http://m-bitco.in/account/bonus");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick24);

            driver.get("http://m-bitco.in/account/bonus2");
            System.out.println("Page title is: " + driver.getTitle());
            js.executeScript(jsCodeForClick48);

            flag1 = true;*/
        }

/*        if(flag1) {
            while (true) {
                iterator++;


                driver.get("http://m-bitco.in/account/bonus4");
                System.out.println("Page title is: " + driver.getTitle());
                js.executeScript(jsCodeForClick);

                if (iterator % 5 == 0) {
                    driver.get("http://m-bitco.in/account/bonus5");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick5);
                }

                if (iterator % 10 == 0) {
                    driver.get("http://m-bitco.in/account/bonus6");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick10);
                }


                if (iterator % 30 == 0) {
                    driver.get("http://m-bitco.in/account/bonus3");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick30);
                }

                if (iterator % 60 == 0) {
                    driver.get("http://m-bitco.in/account/bonus7");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick1);
                }

                if (iterator % 180 == 0) {
                    driver.get("http://m-bitco.in/account/bonus0");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick3);
                }

                if (iterator % 360 == 0) {
                    driver.get("http://m-bitco.in/account/bonus8");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick6);
                }

                if (iterator % 720 == 0) {
                    driver.get("http://m-bitco.in/account/bonus9");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick12);
                }

                if (iterator % 1440 == 0) {
                    driver.get("http://m-bitco.in/account/bonus");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick24);
                }

                if (iterator % 2880 == 0) {
                    driver.get("http://m-bitco.in/account/bonus2");
                    System.out.println("Page title is: " + driver.getTitle());
                    js.executeScript(jsCodeForClick48);
                }
            }
        }*/
       // Thread thread = new Thread();

       // driver.quit();
    }

}
