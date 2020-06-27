package com.example.todo.app.welcome.sample;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import com.example.todo.app.welcome.sample.ValidGroup.A;
import com.example.todo.app.welcome.sample.ValidGroup.B;

public class SampleForm implements Serializable{
    @Size(min=2, groups= {A.class})
    private String sizeSampleStrA;

    @Digits(integer = 4, fraction = 0, groups= {B.class})
    private BigDecimal digitsSampleNumB;

    @Valid
    private SubSampleForm subForm;

    public String getSizeSampleStrA() {
        return sizeSampleStrA;
    }

    public BigDecimal getDigitsSampleNumB() {
        return digitsSampleNumB;
    }

    public SubSampleForm getSubForm() {
        return subForm;
    }

    public void setSizeSampleStrA(String sizeSampleStrA) {
        this.sizeSampleStrA = sizeSampleStrA;
    }

    public void setDigitsSampleNumB(BigDecimal digitsSampleNumB) {
        this.digitsSampleNumB = digitsSampleNumB;
    }

    public void setSubForm(SubSampleForm subForm) {
        this.subForm = subForm;
    }
}
