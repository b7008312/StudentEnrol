package com.enrol

class BootStrap {

    def init = { servletContext ->
def Computing = new Course(
department: 'Computing',
courseTitle: 'BSc Hon Computing',
courseLeader:'Dr Michelle Murphy',
courseCode: 'CS123',
startDate: new Date('09/09/2019'),
endDate: new Date('07/07/2023'),
description : 'Lorem',
numberOfStudents: 55,
tuitionFees: 9000.60,
studyMode: 'Full Time'
).save()

def Ben = new Student(
studentName: 'Ben',
studentID: '1',
dob: new Date('06/08/1999'),
isFundingAvailable: 'Yes',
studentEmail: 'Ben@email.com',
studentUsername: 'b7008312',
studentPassword : 'red',
course: 'BSc Hon Computing'
).save()

def Miles = new Student(
studentName: 'Miles',
studentID: '2',
dob: new Date('16/10/1999'),
isFundingAvailable: 'Yes',
studentEmail: 'Miles@email.com',
studentUsername: 'b9008312',
studentPassword : 'pink',
course: 'BSc Hon Computing'
).save()

def SysArchs = new Module(
module_title: 'SysArchs',
module_code: '1',
credits: 30,
lecturer: 'Tonderai',
course: 'BSc Hon Computing',
description: 'SysArchs'

).save()

def Tonderai = new Lecturer(
fullName: 'Tonderai',
post: 'Lecturer',
subject: 'Computing',
lecturerEmail: 'Tonderai@email.com',
office: '9320',
bio: 'SysArchs'

).save()





}
    def destroy = {
    }
}
