/*
 *
 * Classname Student
 *
 *  14 June 2020
 *
 * Copyright Holovey Ivan
 *
 * Module 2 task 4.1
 *
 * Programming patterns. Factory, Builder
 *
 * 3. Create a class Student  - 25 fields.
 * 4.  Create a builder for the class Student
 *
 * */
package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    // Creating 32 fields of Student
    private String FirstName;
    private String LastName;
    private String Patronymic;
    private LocalDate birthday;
    private String Gender;
    private String IdentityDocument;
    private String PhoneNumber;
    private String EMailAddress;
    public boolean isAdult;
    private boolean isMilitary;
    private String Persuasion;
    private boolean isPrivileged;
    private String KnowledgeOfForeignLanguages;
    private int CertificateMark;
    private boolean IsStateEmployee;
    private boolean isScholar;
    private int StudentTicketNumber;
    private int CreditBookNumber;
    private String Speciality;
    private String Chair;
    private String EducationLevel;
    private boolean isReTakesTheExams;
    private String TitleOfThesis;
    private String Supervisor;
    private String SpecialCourses;
    private int NumberOfConferences;
    private int NumberOfScientificArticles;
    private boolean ParticipationInLegalClinic;
    private boolean IsSportsActivist;
    private boolean IsArtActivist;
    private String SpecialAwards;
    private String Notes;
    //-----------------------------------------------------------

    // Creating Constructor Student
    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   LocalDate birthday,
                   String gender,
                   String identityDocument,
                   String phoneNumber,
                   String EMailAddress,
                   boolean isAdult,
                   boolean isMilitary,
                   String persuasion,
                   boolean isPrivileged,
                   String knowledgeOfForeignLanguages,
                   int certificateMark,
                   int UALanguageZNOResults,
                   int englishLanguageZNOResults,
                   int historyZNOResults,
                   boolean isStateEmployee,
                   boolean isScholar,
                   int studentTicketNumber,
                   int creditBookNumber,
                   String speciality,
                   String chair,
                   String educationLevel,
                   boolean isReTakesTheExams,
                   String titleOfThesis,
                   String supervisor,
                   String specialCourses,
                   int numberOfConferences,
                   int numberOfScientificArticles,
                   boolean participationInLegalClinic,
                   boolean isSportsActivist,
                   boolean isArtActivist,
                   String specialAwards,
                   String notes) {
        FirstName = firstName;
        LastName = lastName;
        Patronymic = patronymic;
        this.birthday = birthday;
        Gender = gender;
        IdentityDocument = identityDocument;
        PhoneNumber = phoneNumber;
        this.EMailAddress = EMailAddress;
        this.isAdult = isAdult;
        this.isMilitary = isMilitary;
        Persuasion = persuasion;
        this.isPrivileged = isPrivileged;
        KnowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
        CertificateMark = certificateMark;
        IsStateEmployee = isStateEmployee;
        this.isScholar = isScholar;
        StudentTicketNumber = studentTicketNumber;
        CreditBookNumber = creditBookNumber;
        Speciality = speciality;
        Chair = chair;
        EducationLevel = educationLevel;
        this.isReTakesTheExams = isReTakesTheExams;
        TitleOfThesis = titleOfThesis;
        Supervisor = supervisor;
        SpecialCourses = specialCourses;
        NumberOfConferences = numberOfConferences;
        NumberOfScientificArticles = numberOfScientificArticles;
        ParticipationInLegalClinic = participationInLegalClinic;
        IsSportsActivist = isSportsActivist;
        IsArtActivist = isArtActivist;
        SpecialAwards = specialAwards;
        Notes = notes;
    }

    // empty Constructor
    public Student() {

    }

    // Getters and Setters

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getIdentityDocument() {
        return IdentityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        IdentityDocument = identityDocument;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEMailAddress() {
        return EMailAddress;
    }

    public void setEMailAddress(String EMailAddress) {
        this.EMailAddress = EMailAddress;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public String getPersuasion() {
        return Persuasion;
    }

    public void setPersuasion(String persuasion) {
        Persuasion = persuasion;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public String getKnowledgeOfForeignLanguages() {
        return KnowledgeOfForeignLanguages;
    }

    public void setKnowledgeOfForeignLanguages(String knowledgeOfForeignLanguages) {
        KnowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
    }

    public int getCertificateMark() {
        return CertificateMark;
    }

    public void setCertificateMark(int certificateMark) {
        CertificateMark = certificateMark;
    }

    public boolean isStateEmployee() {
        return IsStateEmployee;
    }

    public void setStateEmployee(boolean stateEmployee) {
        IsStateEmployee = stateEmployee;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }

    public int getStudentTicketNumber() {
        return StudentTicketNumber;
    }

    public void setStudentTicketNumber(int studentTicketNumber) {
        StudentTicketNumber = studentTicketNumber;
    }

    public int getCreditBookNumber() {
        return CreditBookNumber;
    }

    public void setCreditBookNumber(int creditBookNumber) {
        CreditBookNumber = creditBookNumber;
    }

    public String getSpeciality() {
        return Speciality;
    }
    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getChair() {
        return Chair;
    }

    public void setChair(String chair) {
        Chair = chair;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        EducationLevel = educationLevel;
    }

    public boolean isReTakesTheExams() {
        return isReTakesTheExams;
    }

    public void setReTakesTheExams(boolean reTakesTheExams) {
        isReTakesTheExams = reTakesTheExams;
    }

    public String getTitleOfThesis() {
        return TitleOfThesis;
    }

    public void setTitleOfThesis(String titleOfThesis) {
        TitleOfThesis = titleOfThesis;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public String getSpecialCourses() {
        return SpecialCourses;
    }

    public void setSpecialCourses(String specialCourses) {
        SpecialCourses = specialCourses;
    }

    public int getNumberOfConferences() {
        return NumberOfConferences;
    }

    public void setNumberOfConferences(int numberOfConferences) {
        NumberOfConferences = numberOfConferences;
    }

    public int getNumberOfScientificArticles() {
        return NumberOfScientificArticles;
    }

    public void setNumberOfScientificArticles(int numberOfScientificArticles) {
        NumberOfScientificArticles = numberOfScientificArticles;
    }

    public boolean isParticipationInLegalClinic() {
        return ParticipationInLegalClinic;
    }

    public void setParticipationInLegalClinic(boolean participationInLegalClinic) {
        ParticipationInLegalClinic = participationInLegalClinic;
    }

    public boolean isSportsActivist() {
        return IsSportsActivist;
    }

    public void setSportsActivist(boolean sportsActivist) {
        IsSportsActivist = sportsActivist;
    }

    public boolean isArtActivist() {
        return IsArtActivist;
    }

    public void setArtActivist(boolean artActivist) {
        IsArtActivist = artActivist;
    }

    public String getSpecialAwards() {
        return SpecialAwards;
    }

    public void setSpecialAwards(String specialAwards) {
        SpecialAwards = specialAwards;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", birthday=" + birthday +
                ", Gender='" + Gender + '\'' +
                ", IdentityDocument='" + IdentityDocument + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EMailAddress='" + EMailAddress + '\'' +
                ", isAdult=" + isAdult +
                ", isMilitary=" + isMilitary +
                ", Persuasion='" + Persuasion + '\'' +
                ", isPrivileged=" + isPrivileged +
                ", KnowledgeOfForeignLanguages='" + KnowledgeOfForeignLanguages + '\'' +
                ", CertificateMark=" + CertificateMark +
                ", IsStateEmployee=" + IsStateEmployee +
                ", isScholar=" + isScholar +
                ", StudentTicketNumber=" + StudentTicketNumber +
                ", CreditBookNumber=" + CreditBookNumber +
                ", Speciality='" + Speciality + '\'' +
                ", Chair='" + Chair + '\'' +
                ", EducationLevel='" + EducationLevel + '\'' +
                ", isReTakesTheExams=" + isReTakesTheExams +
                ", TitleOfThesis='" + TitleOfThesis + '\'' +
                ", Supervisor='" + Supervisor + '\'' +
                ", SpecialCourses='" + SpecialCourses + '\'' +
                ", NumberOfConferences=" + NumberOfConferences +
                ", NumberOfScientificArticles=" + NumberOfScientificArticles +
                ", ParticipationInLegalClinic=" + ParticipationInLegalClinic +
                ", IsSportsActivist=" + IsSportsActivist +
                ", IsArtActivist=" + IsArtActivist +
                ", SpecialAwards='" + SpecialAwards + '\'' +
                ", Notes='" + Notes + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isAdult() == student.isAdult() &&
                isMilitary() == student.isMilitary() &&
                isPrivileged() == student.isPrivileged() &&
                getCertificateMark() == student.getCertificateMark() &&
                isStateEmployee() == student.isStateEmployee() &&
                isScholar() == student.isScholar() &&
                getStudentTicketNumber() == student.getStudentTicketNumber() &&
                getCreditBookNumber() == student.getCreditBookNumber() &&
                isReTakesTheExams() == student.isReTakesTheExams() &&
                getNumberOfConferences() == student.getNumberOfConferences() &&
                getNumberOfScientificArticles() == student.getNumberOfScientificArticles() &&
                isParticipationInLegalClinic() == student.isParticipationInLegalClinic() &&
                isSportsActivist() == student.isSportsActivist() &&
                isArtActivist() == student.isArtActivist() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getGender(), student.getGender()) &&
                Objects.equals(getIdentityDocument(), student.getIdentityDocument()) &&
                Objects.equals(getPhoneNumber(), student.getPhoneNumber()) &&
                Objects.equals(getEMailAddress(), student.getEMailAddress()) &&
                Objects.equals(getPersuasion(), student.getPersuasion()) &&
                Objects.equals(getKnowledgeOfForeignLanguages(), student.getKnowledgeOfForeignLanguages()) &&
                Objects.equals(getSpeciality(), student.getSpeciality()) &&
                Objects.equals(getChair(), student.getChair()) &&
                Objects.equals(getEducationLevel(), student.getEducationLevel()) &&
                Objects.equals(getTitleOfThesis(), student.getTitleOfThesis()) &&
                Objects.equals(getSupervisor(), student.getSupervisor()) &&
                Objects.equals(getSpecialCourses(), student.getSpecialCourses()) &&
                Objects.equals(getSpecialAwards(), student.getSpecialAwards()) &&
                Objects.equals(getNotes(), student.getNotes());
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(), getBirthday(),
                getGender(), getIdentityDocument(), getPhoneNumber(), getEMailAddress(),
                isAdult(), isMilitary(), getPersuasion(), isPrivileged(),
                getKnowledgeOfForeignLanguages(), getCertificateMark(),
                isStateEmployee(), isScholar(), getStudentTicketNumber(), getCreditBookNumber(),
                getSpeciality(), getChair(), getEducationLevel(), isReTakesTheExams(), getTitleOfThesis(),
                getSupervisor(), getSpecialCourses(), getNumberOfConferences(),
                getNumberOfScientificArticles(), isParticipationInLegalClinic(),
                isSportsActivist(), isArtActivist(), getSpecialAwards(), getNotes());
    }

    // Doing the work with builder
    public static class Builder {
        private Student StudentToBuild;

        public Builder() {
            this.StudentToBuild = new Student();
        }
        public Builder setSimilarTo(Student student){
            this.StudentToBuild.FirstName = student.FirstName;
            this.StudentToBuild.LastName = student.LastName;
            this.StudentToBuild.Patronymic = student.Patronymic;
            this.StudentToBuild.birthday = student.birthday;
            this.StudentToBuild.Gender = student.Gender;
            this.StudentToBuild.IdentityDocument = student.IdentityDocument;
            this.StudentToBuild.PhoneNumber = student.PhoneNumber;
            this.StudentToBuild.EMailAddress = student.EMailAddress;
            this.StudentToBuild.isAdult = student.isAdult;
            this.StudentToBuild.isMilitary = student.isMilitary;
            this.StudentToBuild.Persuasion = student.Persuasion;
            this.StudentToBuild.isPrivileged = student.isPrivileged;
            this.StudentToBuild.KnowledgeOfForeignLanguages
                    = student.KnowledgeOfForeignLanguages;
            this.StudentToBuild.CertificateMark = student.CertificateMark;
            this.StudentToBuild.IsStateEmployee = student.IsStateEmployee;
            this.StudentToBuild.isScholar = student.isScholar;
            this.StudentToBuild.StudentTicketNumber = student.StudentTicketNumber;
            this.StudentToBuild.CreditBookNumber = student.CreditBookNumber;
            this.StudentToBuild.Speciality = student.Speciality;
            this.StudentToBuild.Chair = student.Chair;
            this.StudentToBuild.EducationLevel = student.EducationLevel;
            this.StudentToBuild.isReTakesTheExams = student.isReTakesTheExams;
            this.StudentToBuild.TitleOfThesis = student.TitleOfThesis;
            this.StudentToBuild.Supervisor = student.Supervisor;
            this.StudentToBuild.SpecialCourses = student.SpecialCourses;
            this.StudentToBuild.NumberOfConferences = student.NumberOfConferences;
            this.StudentToBuild.NumberOfScientificArticles
                    = student.NumberOfScientificArticles;
            this.StudentToBuild.ParticipationInLegalClinic
                    = student.ParticipationInLegalClinic;
            this.StudentToBuild.IsSportsActivist = student.IsSportsActivist;
            this.StudentToBuild.IsArtActivist = student.IsArtActivist;
            this.StudentToBuild.SpecialAwards = student.SpecialAwards;
            this.StudentToBuild.Notes = student.Notes;
            return this;
        }

        Builder setFirstName(String FirstName){
            StudentToBuild.setFirstName(FirstName);
            return this;
        }

        Builder setLastName (String LastName) {
            StudentToBuild.setLastName(LastName);
            return this;
        }

        Builder setPatronymic (String Patronymic) {
            StudentToBuild.setPatronymic(Patronymic);
            return this;
        }

        Builder setBirthday (LocalDate Birthday) {
            StudentToBuild.setBirthday(Birthday);
            return this;
        }

        Builder setGender (String Gender) {
            StudentToBuild.setGender(Gender);
            return this;
        }

        Builder setIdentityDocument (String IdentityDocument) {
            StudentToBuild.setIdentityDocument(IdentityDocument);
            return this;
        }

        Builder setPhoneNumber (String PhoneNumber) {
            StudentToBuild.setPhoneNumber(PhoneNumber);
            return this;
        }

        Builder setEMailAddress (String EMailAddress) {
            StudentToBuild.setEMailAddress(EMailAddress);
            return this;
        }

        Builder setIsAdult (boolean IsAdult) {
            StudentToBuild.setAdult(IsAdult);
            return this;
        }
        Builder setIsMilitary (boolean IsMilitary) {
            StudentToBuild.setMilitary(IsMilitary);
            return this;
        }

        Builder setPersuasion (String Persuasion) {
            StudentToBuild.setPersuasion(Persuasion);
            return this;
        }

        Builder setIsPrivileged (boolean IsPrivileged) {
            StudentToBuild.setPrivileged(IsPrivileged);
            return this;
        }

        Builder setKnowledgeOfForeignLanguages (String KnowledgeOfForeignLanguages) {
            StudentToBuild.setKnowledgeOfForeignLanguages(KnowledgeOfForeignLanguages);
            return this;
        }

        Builder setCertificateMark (int CertificateMark) {
            StudentToBuild.setCertificateMark(CertificateMark);
            return this;
        }

        Builder setIsStateEmployee (boolean IsStateEmployee) {
            StudentToBuild.setStateEmployee(IsStateEmployee);
            return this;
        }

        Builder setIsScholar (boolean IsScholar) {
            StudentToBuild.setScholar(IsScholar);
            return this;
        }

        Builder setStudentTicketNumber (int StudentTicketNumber) {
            StudentToBuild.setStudentTicketNumber(StudentTicketNumber);
            return this;
        }

        Builder setCreditBookNumber (int CreditBookNumber) {
            StudentToBuild.setCreditBookNumber(CreditBookNumber);
            return this;
        }

        Builder setSpeciality (String Speciality) {
            StudentToBuild.setSpeciality(Speciality);
            return this;
        }

        Builder setChair (String Chair) {
            StudentToBuild.setChair(Chair);
            return this;
        }

        Builder setEducationLevel (String EducationLevel) {
            StudentToBuild.setEducationLevel(EducationLevel);
            return this;
        }

        Builder setIsReTakesTheExams (boolean IsReTakesTheExams) {
            StudentToBuild.setReTakesTheExams(IsReTakesTheExams);
            return this;
        }

        Builder setTitleOfThesis (String TitleOfThesis) {
            StudentToBuild.setTitleOfThesis(TitleOfThesis);
            return this;
        }

        Builder setSupervisor (String Supervisor) {
            StudentToBuild.setSupervisor(Supervisor);
            return this;
        }

        Builder setSpecialCourses (String SpecialCourses) {
            StudentToBuild.setSpecialCourses(SpecialCourses);
            return this;
        }

        Builder setNumberOfConferences (int NumberOfConferences) {
            StudentToBuild.setNumberOfConferences(NumberOfConferences);
            return this;
        }

        Builder setNumberOfScientificArticles (int NumberOfScientificArticles) {
            StudentToBuild.setNumberOfScientificArticles(NumberOfScientificArticles);
            return this;
        }

        Builder setParticipationInLegalClinic (boolean ParticipationInLegalClinic) {
            StudentToBuild.setParticipationInLegalClinic(ParticipationInLegalClinic);
            return this;
        }

        Builder setIsSportsActivist (boolean IsSportsActivist) {
            StudentToBuild.setSportsActivist(IsSportsActivist);
            return this;
        }

        Builder setIsArtActivist (boolean IsArtActivist) {
            StudentToBuild.setArtActivist(IsArtActivist);
            return this;
        }

        Builder setSpecialAwards (String SpecialAwards) {
            StudentToBuild.setSpecialAwards(SpecialAwards);
            return this;
        }
        Builder setNotes (String Notes) {
            StudentToBuild.setNotes(Notes);
            return this;
        }

        Student build(){
            return StudentToBuild;
        }

    }
}

