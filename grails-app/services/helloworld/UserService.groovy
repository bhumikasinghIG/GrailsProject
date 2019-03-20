package helloworld

import grails.transaction.Transactional

@Transactional
class UserService {

    def saveUser(String name,String age){
        log.info("first log")
        User user = new User(name: name, age:age)
        user.save()

    }



}
