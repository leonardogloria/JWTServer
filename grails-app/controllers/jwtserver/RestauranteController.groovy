package jwtserver

import grails.converters.JSON

class RestauranteController {

    def index() { }
    def restaurantes(){
        response.contentType = "application/json"
        render Restaurante.list() as JSON
    }
    def forbiden(){
        render "Not Allowed"

    }
}
