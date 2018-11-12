
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class ShitToTrySpec extends FunSuite with BeforeAndAfter with MockitoSugar {
	test("I can stub a simple object with mockito") {
		val myStub = mock[ShitToTry]
		when(myStub.multiplierAge()).thenReturn(2)
		assert(myStub.multiplierAge() == 2)
	}
}