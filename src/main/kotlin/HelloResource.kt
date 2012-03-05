/**
 @author petrovic -- 3/4/12 4:46 PM
 */

import javax.ws.rs.Path
import javax.ws.rs.GET

[Path("/hello")]
class HelloResource() {

    [GET]
    fun getHello() : String {
        return "hello"
    }
}
