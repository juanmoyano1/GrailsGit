package grailsgit

class Category {

    String name
    String urlImage
    Integer visits
    String borrar

    static belongsTo = [site: Site]

    static constraints = {
    }
}
