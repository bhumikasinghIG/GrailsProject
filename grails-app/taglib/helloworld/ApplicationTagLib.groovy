package helloworld

class ApplicationTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "ap"
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def test= { attrs,body ->
        String name = attrs.name
        String lan = attrs.lan

        println("Hi i am from taglib")
        out << name + " " + lan
    }

    def fullGender = { attrs ->
        String gender = attrs.gender
        if(gender=="M"){
            out << "Male"
        }else
            out << "Female"
    }
}
