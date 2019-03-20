package helloworld

class UserController {

    UserService userService
    def index() { }

    def getUser(){
        //render User.list()*.name
       // render User.list()*.age
        def user
        user = User.findAll()
        //userService.getUser()
        render(view:'index',model: [user:user])
    }
    def saveUser(String name,String age){
        userService.saveUser(name,age)
        render "Object has been saved"
    }
    def hello() {
        def recipient = grailsApplication.config.getProperty('hibernate.cache.region.factory_class')

        render "Hello ${recipient}"
    }
}
