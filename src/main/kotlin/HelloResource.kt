package org.petrovic.ws


import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

Path("/hello")
class HelloResource() {

    GET
    fun getHello([QueryParam("name")] qs : String) : String {
        return "hello, " + qs
    }
}
