
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class ShitToTrySpec extends FunSuite with BeforeAndAfter with MockitoSugar {
	test("We can do a request withoub blocking the future item") {

		val mymock = mock[ShitToTry]

		when(mymock.multiplierAge())
				.thenReturn(2)

		assert(mymock.multiplierAge() == 2)

	}
}