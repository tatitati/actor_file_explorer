import akka.actor._

object Main extends App {
	val system = ActorSystem("sample")
	val filesCounterActor = system.actorOf(Props[ParentActor])

	val dirname = args(0)
	filesCounterActor ! dirname
}