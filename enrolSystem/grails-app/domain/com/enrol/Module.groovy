package com.enrol

class Module {
String module_title
String module_code
int credits
String lecturer
String description
static hasMany=[courses:Course, students:Student]
static belongsTo=[Course, Student]
String toString(){
return module_title
}
    static constraints = {
module_title nullable:false
module_title blank:false
module_code nullable:false
module_code blank:false
credits nullable:false
credits blank:false
credits minSize:20
credits maxSize:120
lecturer nullable:false
lecturer blank:false
description nullable:false
description blank:false
description maxSize:500
description blank:false
description widget:'textarea'
    }
}
