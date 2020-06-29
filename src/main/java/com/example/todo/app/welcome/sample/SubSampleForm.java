package com.example.todo.app.welcome.sample;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import com.example.todo.app.welcome.sample.ValidGroup.B;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public class SubSampleForm implements Serializable {

    @Size(min = 2, groups= {Default.class, B.class})
    private String sizeSubSampleStrB;

//    @Digits(integer = 4, fraction = 0, groups= {ValidGroup.B.class})
    @Digits(integer = 4, fraction = 0, groups= {Default.class, B.class})
    private BigDecimal digitsSubSampleNumDef;

    public String getSizeSubSampleStrB() {
        return sizeSubSampleStrB;
    }

    public BigDecimal getDigitsSubSampleNumDef() {
        return digitsSubSampleNumDef;
    }

    public void setSizeSubSampleStrB(String sizeSubSampleStrB) {
        this.sizeSubSampleStrB = sizeSubSampleStrB;
    }

    public void setDigitsSubSampleNumDef(BigDecimal digitsSubSampleNumDef) {
        this.digitsSubSampleNumDef = digitsSubSampleNumDef;
    }
}
