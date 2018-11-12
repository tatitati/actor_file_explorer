import akka.actor._
import akka.routing._
import java.io._

class ParentActor extends Actor {
	var filesCount = 0L
	var pending = 0
	val system = ActorSystem("sample")
	val fileExplorerActorsPool = context.actorOf(RoundRobinPool(500).props(Props[FilesCounterInSubfolderFolderActor]))

	def receive = {
		case dirName: String =>
			pending = pending + 1
			fileExplorerActorsPool ! dirName

		case count: Int =>
			filesCount = filesCount + count
			pending = pending - 1
			if (pending <= 0) {
				println(s"Files count: $filesCount")
				system.terminate()
			}

			sender ! PoisonPill
	}
}
