package com.tempsys;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class CV {

    private String lastChanged;
    private String cvDoc;

    public String getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged() {
        LocalDate curDate = LocalDate.now();
        DateTimeFormatter dForm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        lastChanged = curDate.format(dForm);
    }

    public String getCvDoc() {
        return cvDoc;
    }

    public void setCvDoc(String cvDoc) {
        this.cvDoc = cvDoc;
    }
}
