package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _06_DataTables {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

       List<String> listelemanlar=items.asList(String.class);

       for (String strButton:listelemanlar){
           WebElement element=ln.getWebElement(strButton);
           ln.clickFunction(element);

       }



    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable item) {

        List<String> strButtons=item.asList(String.class);

        for (String strButton:strButtons) {
            WebElement element=dc.getWebElement(strButton);
            dc.clickFunction(element);

        }


    }


    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {

        List< List<String> > items=dt.asLists(String.class);

        for (int i = 0; i < items.size() ; i++) {

            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));

        }
    }

    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {

        List<String>  items=dt.asList(String.class);

        for (String strDeleteText: items) {

            dc.deleteItem(strDeleteText);

        }


    }
}
