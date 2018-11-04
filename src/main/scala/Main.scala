import akka.actor._

object Main extends App {
	val system = ActorSystem("sample")
	val filesCounter = system.actorOf(Props[FilesCounter])
	filesCounter ! args(0)
}