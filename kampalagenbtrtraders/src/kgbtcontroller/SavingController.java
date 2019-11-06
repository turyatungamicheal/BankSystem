/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgbtcontroller;

import java.awt.event.ActionListener;
import kgbtdatabase.KGBTDataBase;
import kgbtmodel.SavingModel;
import mainview.LoanViewAdd;
import mainview.SavingViewAdd;

/**
 *
 * @author scovia m
 */
public class SavingController {

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

      public void control(SavingModel model) {
        System.out.println("SavingModel : " + model.getname() + model.getstallno()+ model.getlocation()+ model.gettellno() + model.getnok() + model.getstallno());
        dbcconnector.save(model);
    }
}
