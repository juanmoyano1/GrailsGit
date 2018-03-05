package grailsgit

class Category {

    String name
    String urlImage
    Integer visits

    static belongsTo = [site: Site]

    static constraints = {
    }
}
