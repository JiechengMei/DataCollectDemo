import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//================注意==========================
//里边开头带*的都表示必需品，其他的可以当做一个参考来使用
//================注意==========================


public class Main {
    public static void main(String[] args) {
        //配置环境
        //  *在这里我使用的是Chrome，然后指引到Chromedriver.exe的路径
        System.setProperty("webdriver.chrome.driver", "/Users/jcmbp/Desktop/DataCollectDemo/chromedriver");
        //  *这个是用来装Chrome的设置的
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        //  *阻止弹出式窗口（需要看需求变动）
        chromePrefs.put("profile.default_content_settings.popups", 0);
        ChromeOptions options = new ChromeOptions();
        //  无窗口GUI
        //  options.addArguments("--headless");
        //  *把上述条件添加到预设里
        options.setExperimentalOption("prefs", chromePrefs);
        //  *把预设添加到Chrome里
        WebDriver driver = new ChromeDriver(options);

        //执行搜索部分
        /*  我们先分析数据
        *   https://hotels.ctrip.com/hotels/list?
        *                           countryId=1&                    国家ID
        *                           city=32&                        城市ID
        *                           checkin=2023/09/26&             入住日期
        *                           checkout=2023/09/27&            退房日期
        *                           optionId=32&                    未知
        *                           optionType=City&                查找城市
        *                           directSearch=0&                 关键字搜索
        *                           display=%E5%B9%BF%E5%B7%9E&     解码后是 显示=广州 的意思
        *                           crn=1&
        *                           adult=1&
        *                           children=0&
        *                           searchBoxArg=t&
        *                           travelPurpose=0&
        *                           ctm_ref=ix_sb_dl&
        *                           domestic=1&
        * */
        //

        //分析部分

        //得出的结果

    }
}
