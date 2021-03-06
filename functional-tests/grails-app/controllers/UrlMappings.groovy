class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/books"(resources:"book")
        "/teams"(resources:"team")
        "/products"(resources:"product")
        "/teams/deep/$id"(controller: "team", action:"deep")
        "/teams/hal/$id"(controller: "team", action:"hal")
        "/authors"(resources:"author")
        "/api/book/$action?"(controller: 'book', namespace: 'api')
    }
}
