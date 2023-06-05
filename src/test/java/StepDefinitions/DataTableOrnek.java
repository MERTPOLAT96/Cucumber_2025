package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String userName)  {
        System.out.println("userName = " + userName);

    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String userName, String password) {
        System.out.println("userName and pass = " + userName+" "+password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) { // tek boyutlu list

       List<String> listelemanlar= items.asList(String.class);

       for (String u:listelemanlar)
           System.out.println("u = " + u);




    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable items) { // 2 boyutlu listin listi

        List< List<String> > listelemanlarr=items.asLists(String.class);

        for (int i = 0; i <listelemanlarr.size() ; i++) {         // username           // password
            System.out.println("listelemanlar = " + listelemanlarr.get(i).get(0)+ " "+listelemanlarr.get(i).get(1));

            // username ve password un yanına 3 .ncü bir kıstas eklenecek olsaydı listelemanların 2. get i 2 olurdu
            // ve uzayacak senaryolarda 3 ,4 olarak devam ederdi.

        }
    }
}
