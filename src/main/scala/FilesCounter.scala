import akka.actor._
import akka.routing._
import java.io._

class FilesCounter extends Actor {
	var filesCount = 0L
	var pending = 0
	val system = ActorSystem("sample")
	val fileExplorers = context.actorOf(RoundRobinPool(100).props(Props[FileExplorer]))

	def receive = {
		case dirName: String =>
			pending - pending + 1
			fileExplorers ! dirName

		case count: Int =>
			filesCount = filesCount + count
			pending = pending - 1
			if (pending <= 0) {
				println(s"Files count: $filesCount")
				system.terminate()
			}

	}
}
