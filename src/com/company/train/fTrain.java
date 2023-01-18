package com.company.train;

import com.company.driver.Professionals;
import com.company.wagon.Locomotive;
import com.company.wagon.Wagon;
import com.company.wagon.FreightWagon;

public class fTrain {
    Professionals driver = new Professionals("Nursultan Nazarbayev","15");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.print("Volume: "+wagon.volume+"m2 || ");
        System.out.print("Product: "+wagon.getProduct()+" || ");
        System.out.println("Total weight of wagon: "+wagon.totalWeight()+"kg");

    }





    public String toString(){
        return  "\n"+driver.name+"\n"
                +"Exprerience: "+driver.exp+" years";
    }
}

