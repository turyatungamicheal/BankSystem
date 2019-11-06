/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainview.maincontoller;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kgbtdatabase.KGBTDataBase;
import kgbtmodel.SavingModel;
import mainview.LoanViewAdd;
import mainview.maincontoller.SavingController;
import mainview.SavingViewAdd;

/**
 *
 * @author scovia m
 */
public class SavingController{
    
     private SavingModel model;
    private LoanViewAdd loans;
    private ActionListener actionListener;
    private KGBTDataBase dbcconnector;
    private SavingViewAdd savings;
    
    public SavingController(SavingModel model) {
        this.model = model;
        this.dbcconnector =  new KGBTDataBase();
        initView();
    }

    public void initView() {

    }

   
    
    
    public static boolean email_Validation(String email){
        boolean status =false;
        String email_pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern =Pattern.compile(email_pattern);
        Matcher matcher =pattern.matcher(email);
        
        if(matcher.matches()){
            status =true;
                    }else{
            status =false;
        
        }
        return status;
    
    }
    
    
    
}