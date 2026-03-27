package lab2.task1.part_c.models;

import java.util.Objects;

public class TechnicalUniversity extends University{
    private String mainEngineeringField;

    public TechnicalUniversity(String name, String location, String mainEngineeringField) {
        super(name, location);
        this.mainEngineeringField = mainEngineeringField;
    }

    //getters
    public String getMainEngineeringField() {
        return this.mainEngineeringField;
    }

    //setters
    public void setMainEngineeringField(String mainField) {
        this.mainEngineeringField = mainField;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        TechnicalUniversity tUni = (TechnicalUniversity) obj;
        return super.equals(tUni) && Objects.equals(this.mainEngineeringField, tUni.mainEngineeringField);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.mainEngineeringField);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nMain engineering field: %s", this.mainEngineeringField);
    }
}

