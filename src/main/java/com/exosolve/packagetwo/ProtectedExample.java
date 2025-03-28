package com.exosolve.packagetwo;

import com.exosolve.packageone.Tax;

public class ProtectedExample extends Tax {

    public int useProtected(){
        ProtectedExample tax = new ProtectedExample();
        return tax.calculateTax();
    }
}
