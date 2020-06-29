package com.example.todo.app.welcome.sample;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

import com.example.todo.app.welcome.sample.ValidGroup.A;
import com.example.todo.app.welcome.sample.ValidGroup.B;

public class SampleForm implements Serializable {
    @Size(min = 2, groups = { A.class })
    private String sizeSampleStrA;

    @Digits(integer = 4, fraction = 0, groups = { Default.class, B.class })
    private BigDecimal digitsSampleNumB;

    @Valid
    private SubSampleForm subForm;

    @Valid
    private List<SubSampleForm> subFormList;

    public List<SubSampleForm> getSubFormList() {
        return subFormList;
    }

    public void setSubFormList(List<SubSampleForm> subFormList) {
        this.subFormList = subFormList;
    }

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
