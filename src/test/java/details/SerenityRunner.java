package details;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import util.BaseClass;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/Resources/features")
public class SerenityRunner extends BaseClass {



}
