package info.java.tips.form;


import lombok.Data;
import org.apache.struts.action.ActionForm;

@Data
public class HelloForm extends ActionForm{
    private String name;
}