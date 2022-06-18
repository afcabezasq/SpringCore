package org.pinal.tutoring.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {

    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", medicines=" + medicines +
                '}';
    }
}
