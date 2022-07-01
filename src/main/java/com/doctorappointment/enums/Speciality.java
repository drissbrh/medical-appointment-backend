package com.doctorappointment.enums;

public enum Speciality {
    Allergy_And_Immunology("Allergy And Immunology"),Anesthesiology("Anesthesiology"),Colon_And_Rectal_Surgery("Colon And Rectal Surgery"),
    Cardiology("Cardiology"),Dermatology("Dermatology"),Physical_Medicine_And_Rehabilitation("Physical Medicine And Rehabilitation"),Emergency_Medicine("Emergency Medicine"),
    Internal_Medicine("Internal Medicine"),Neurology("Neurology"),Ophthalmology("Ophthalmology"),Psychiatry("Psychiatry"),Surgery("Surgery");

    private final String speciality;
    Speciality(String speciality) {
        this.speciality=speciality;
    }
    public String getSpeciality(){
        return this.speciality;
    }
}
