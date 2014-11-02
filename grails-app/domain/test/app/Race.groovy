package test.app

class Race {
Date startDay
City city
static hasMany = [runners: Runner]
    static constraints = {
    }
}
