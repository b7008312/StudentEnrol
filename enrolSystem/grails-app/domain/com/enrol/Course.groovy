package com.enrol

class Course {
String department
String courseTitle
String courseLeader
String courseCode 
Date startDate 
Date endDate
String description
int numberOfStudents
double tuitionFees
String studyMode

    static constraints = {
courseTitle nullable:false
courseTitle blank:false
department blank:false
department nullable:false
courseLeader blank:false
courseLeader nullable:false
courseCode blank:false
courseCode nullable:false
numberOfStudents blank:false
numberOfStudents nullable:false
numberOfStudents minSize:20
numberOfStudents maxSize:60
startDate blank:false
startDate nullable:false
endDate blank:false
endDate nullable:false
studyMode blank:false
studyMode nullable:false
studyMode length:20
description nullable:false
description blank:false
description maxSize:5000
description widget:'textarea'
tuitionFees nullable:false
tuitionFees blank:false
tuitionFees scale:2
    }
}
