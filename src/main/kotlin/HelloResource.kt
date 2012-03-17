import javax.ws.rs.Path
import javax.ws.rs.GET

Path("/hello")
class HelloResource() {

    GET
    fun getHello() : String {
        return "hello"
    }
}
