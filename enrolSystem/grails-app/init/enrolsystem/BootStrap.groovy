package com.enrol

class BootStrap {

    def init = { servletContext ->
def Tonderai = new Lecturer(
fullName: 'Tonderai',
post: 'Lecturer',
subject: 'Computing',
lecturerEmail: 'Tonderai@email.com',
office: '9320',
bio: 'SysArchs'

).save()

def Matthew = new Lecturer(
fullName: 'Matthew',
post: 'Lecturer',
subject: 'PCP',
lecturerEmail: 'Matthew@email.com',
office: '9220',
bio: 'PCP'

).save()

def Lynne = new Lecturer(
fullName: 'Lynne',
post: 'Lecturer',
subject: 'PPSS',
lecturerEmail: 'Lynne@email.com',
office: '9420',
bio: 'PPSS'

).save()

def Computing = new Course(
department: 'Computing',
courseTitle: 'BSc Hon Computing',
courseLeader: Lynne,
courseCode: 'CS123',
startDate: new Date('09/09/2019'),
endDate: new Date('07/07/2023'),
description : 'Lorem',
numberOfStudents: 55,
tuitionFees: 9000.60,
studyMode: 'Full Time'

).save()

def Biology = new Course(
department: 'Biology',
courseTitle: 'Biology',
courseLeader: Matthew,
courseCode: 'B123',
startDate: new Date('08/09/2019'),
endDate: new Date('09/07/2023'),
description : 'Loremist',
numberOfStudents: 55,
tuitionFees: 9000.60,
studyMode: 'Full Time'

).save()

def ComputerGames = new Course(
department: 'Computing',
courseTitle: 'ComputerGames',
courseLeader: Tonderai,
courseCode: 'CSG123',
startDate: new Date('08/09/2019'),
endDate: new Date('09/07/2023'),
description : 'Loremist',
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
course: Computing
).save()

def Miles = new Student(
studentName: 'Miles',
studentID: '2',
dob: new Date('16/10/1999'),
isFundingAvailable: 'Yes',
studentEmail: 'Miles@email.com',
studentUsername: 'b9008312',
studentPassword : 'pink',
course: ComputerGames
).save()

def Mitchell = new Student(
studentName: 'Mitchell',
studentID: '3',
dob: new Date('16/11/1999'),
isFundingAvailable: 'Yes',
studentEmail: 'Mitchell@email.com',
studentUsername: 'b2008312',
studentPassword : 'yellow',
course: Biology

).save()

def SysArchs = new Module(
module_title: 'SysArchs',
module_code: '1',
credits: 30,
lecturer: 'Tonderai',
course: 'BSc Hon Computing',
description: 'SysArchs'

).save()

def PPSS = new Module(
module_title: 'PPSS',
module_code: '2',
credits: 30,
lecturer: 'Lynne',
course: 'BSc Hon Computing',
description: 'PPSS'

).save()

def PCP = new Module(
module_title: 'PCP',
module_code: '3',
credits: 30,
lecturer: 'Matthew',
course: 'BSc Hon Computing',
description: 'PCP'

).save()

def Sea = new Module(
module_title: 'Sea',
module_code: '4',
credits: 30,
lecturer: 'Matthew',
course: 'Biology',
description: 'Sea'

).save()

Lynne.addToModules(PCP)
Lynne.addToModules(PPSS)
Matthew.addToModules(Sea)
Tonderai.addToModules(PPSS)

Computing.addToLecturers(Lynne)
Biology.addToLecturers(Matthew)
ComputerGames.addToLecturers(Tonderai)

Lynne.addToCourses(Computing)
Matthew.addToCourses(Biology)
Tonderai.addToCourses(ComputerGames)

Computing.addToStudents(Ben)
Biology.addToStudents(Mitchell)
ComputerGames.addToStudents(Miles)

PCP.addToCourses(Computing)
PPSS.addToCourses(ComputerGames)
PCP.addToCourses(Biology)

PCP.addToStudents(Ben)
PPSS.addToStudents(Miles)
Sea.addToStudents(Mitchell)

Ben.addToModules(PCP)
Miles.addToModules(PPSS)
Mitchell.addToModules(Sea)


}
    def destroy = {
    }
}
