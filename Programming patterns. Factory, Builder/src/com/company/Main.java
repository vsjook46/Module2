/*
 *
 * Classname Main
 *
 *  14 June 2020
 *
 * Copyright Holovey Ivan
 *
 * */
package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        // Realization the builder for student Ivan
        Student ivan = new Student.Builder()
                .setFirstName("Ivan")
                .setLastName("Holovey")
                .setPatronymic("Ivanovich")
                .setBirthday(LocalDate.of(1995, Month.SEPTEMBER, 4))
                .setGender("male")
                .setIdentityDocument("passport")
                .setPhoneNumber("+380995340899")
                .setEMailAddress("vsjook46@gmail.com")
                .setIsAdult(true)
                .setIsMilitary(true)
                .setPersuasion("Orthodox")
                .setIsPrivileged(false)
                .setKnowledgeOfForeignLanguages("Slovak")
                .setCertificateMark(199)
                .setIsStateEmployee(true)
                .setIsScholar(true)
                .setStudentTicketNumber(13)
                .setCreditBookNumber(1000)
                .setSpeciality("law 081")
                .setChair("Civil law and process")
                .setEducationLevel("master")
                .setIsReTakesTheExams(false)
                .setTitleOfThesis("IT agreements")
                .setSupervisor("Buletsa Sibilla Bohdanivna")
                .setSpecialCourses("-")
                .setNumberOfConferences(5)
                .setNumberOfScientificArticles(8)
                .setParticipationInLegalClinic(false)
                .setIsSportsActivist(true)
                .setIsArtActivist(true)
                .setSpecialAwards("-")
                .setNotes("-")
                .build();
        System.out.println(ivan);

        //-----------------------------------------------------------

        // Programming patterns
        System.out.println("Hello,  patterns!");

        // 1st method of object creation

        Ring ring1 = new Ring(1, 3);

        // 2nd method creation

        Ring ring2 = new Ring(2,4);
        ring2.setr(2);
        ring2.setR(4);

        //3rd method

        Ring ring3 = RingFactory.create(2, 4);

        Ring ring4 = new Ring(1, 10);

        System.out.println(ring4);

        Ring rn2 = RingFactory.create(1,1);

        System.out.println(rn2);




        // 4th method  - Abstract Factory

        IGeometry rn5 = AbstractFactory.create(4,5, Figure.RING);

        System.out.println(rn5);


    }

}
